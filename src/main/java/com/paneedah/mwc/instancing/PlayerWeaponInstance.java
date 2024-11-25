package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.perspective.OpticalScopePerspective;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.shader.DynamicShaderGroupSource;
import com.paneedah.weaponlib.shader.DynamicShaderGroupSourceProvider;
import com.paneedah.weaponlib.shader.DynamicShaderPhase;
import dev.redstudio.redcore.math.ClampUtil;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL13;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.UUID;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@NoArgsConstructor
public class PlayerWeaponInstance extends PlayerItemInstance<WeaponState> implements DynamicShaderGroupSourceProvider {

    private static final String ALT_MODIFICATION_MODE_ENABLED_TAG = "ALT_MODIFICATION_MODE_ENABLED";
    private static final String SELECTED_ATTACHMENT_INDEXES_TAG = "SELECTED_ATTACHMENT_INDEXES";
    private static final String LOAD_AFTER_UNLOAD_ENABLED_TAG = "LOAD_AFTER_UNLOAD_ENABLED";
    private static final String ACTIVE_ATTACHMENT_IDS_TAG = "ACTIVE_ATTACHMENT_IDS";
    private static final String LOAD_ITERATION_COUNT_TAG = "LOAD_ITERATION_COUNT";
    private static final String ACTIVE_TEXTURE_INDEX_TAG = "ACTIVE_TEXTURE_INDEX";
    private static final String NIGHT_VISION_ON_TAG = "NIGHT_VISION_ON";
    private static final String MAX_SHOTS_TAG = "MAX_SHOTS";
    private static final String LASER_ON_TAG = "LASER_ON";
    private static final String RECOIL_TAG = "RECOIL";
    private static final String AIMED_TAG = "AIMED";
    private static final String AMMO_TAG = "AMMO";
    private static final String ZOOM_TAG = "ZOOM";

    // ! TODO: Figure this out, the resources of weaponlib got incorrectly place in the src, and removing this shader system doesn't change anything

    private static final UUID NIGHT_VISION_SOURCE_UUID = UUID.randomUUID();
    private static final UUID VIGNETTE_SOURCE_UUID = UUID.randomUUID();
    private static final UUID BLUR_SOURCE_UUID = UUID.randomUUID();

    @SideOnly(CLIENT) public final DynamicShaderGroupSource blurSource = new DynamicShaderGroupSource(BLUR_SOURCE_UUID, new ResourceLocation("weaponlib", "blur.json"))
            .withUniform("Radius", context -> hasOpticalScope() ? 10 : 5)
            .withUniform("Progress", context -> getAimChangeProgress());

    @SideOnly(CLIENT) public final DynamicShaderGroupSource nightVisionSource = new DynamicShaderGroupSource(NIGHT_VISION_SOURCE_UUID, new ResourceLocation("weaponlib", "night-vision.json"))
            .withUniform("IntensityAdjust", context -> 40 - MC.gameSettings.gammaSetting * 38)
            .withUniform("NoiseAmplification", context -> 2 + 3 * MC.gameSettings.gammaSetting);

    @SideOnly(CLIENT) public final DynamicShaderGroupSource vignetteSource = new DynamicShaderGroupSource(VIGNETTE_SOURCE_UUID, new ResourceLocation("weaponlib", "vignette.json"))
            .withUniform("Radius", context -> getOpticalScopeVignetteRadius(context.getPartialTicks()))
            // .withUniform("Velocity", context -> new float[]{ClientEventHandler.scopeVelX, ClientEventHandler.scopeVelY})
            .withUniform("Reticle", context -> {
                GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 4);
                MC.getTextureManager().bindTexture(new ResourceLocation(ID + ":textures/hud/reticle1.png"));
                GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
                return 4;
            });

    private static final long AIM_CHANGE_DURATION = 1200;

    @Getter @Setter private boolean isAwaitingCompoundInstructions;
    @Getter @Setter private boolean altModificationModeEnabled;
    @Getter @Setter private boolean delayCompoundEnd = true;
    @Getter @Setter private boolean loadAfterUnloadEnabled;
    @Getter @Setter private boolean seriesResetAllowed;
    @Getter private boolean compoundMagSwapping;
    @Getter private boolean slideLockOn;
    @Getter private boolean nightVisionOn;
    @Getter private boolean laserOn;
    @Getter private boolean aimed;

    @Getter private byte activeTextureIndex;

    @Getter @Setter private int loadIterationCount;
    @Getter @Setter private int seriesShotCount;
    @Getter private int maxShots; // ! FIRE_MODE TODO: Enum pls - Luna Mira Lage (Desoroxxx) 2024-11-25
    @Getter private int ammo;

    @Getter @Setter private long lastReloadUpdateTimestamp;
    @Getter @Setter private long lastBurstEndTimestamp;
    @Getter @Setter private long lastFireTimestamp;
    private long aimedChangeTimestamp;

    @Getter private float zoom = 1;
    @Getter private float recoil;

    @Getter private byte[] selectedAttachmentIndexes = new byte[0];

    private int[] activeAttachmentIds = new int[0];

    /*
     * Upon adding an element to the head of the queue, all existing elements with lower priority are removed from the queue.
     * Elements with the same priority are not removed.
     * This ensures the queue is always sorted by priority, lowest (head) to highest (tail).
     */
    private final Deque<AsyncWeaponState> filteredStateQueue = new ArrayDeque<>();

    public PlayerWeaponInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    /**
     * Commits pending state
     */
    @Override
    protected void updateWith(final PlayerItemInstance<WeaponState> otherItemInstance, final boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);

        final PlayerWeaponInstance otherInstance = (PlayerWeaponInstance) otherItemInstance;

        setAmmo(otherInstance.ammo);
        setZoom(otherInstance.zoom);
        setRecoil(otherInstance.recoil);
        setSelectedAttachmentIndexes(otherInstance.selectedAttachmentIndexes);
        setActiveAttachmentIds(otherInstance.activeAttachmentIds);
        setActiveTextureIndex(otherInstance.activeTextureIndex);
        setSlideLock(otherInstance.slideLockOn);
        setLaserOn(otherInstance.laserOn);
        setMaxShots(otherInstance.maxShots);
        setLoadIterationCount(otherInstance.loadIterationCount);
        setLoadAfterUnloadEnabled(otherInstance.loadAfterUnloadEnabled);
    }

    private void addStateToHistory(final WeaponState state) {
        AsyncWeaponState asyncWeaponState;
        // Remove existing items from lower priorities from the top of the stack; stop when same or higher priority item is found
        while ((asyncWeaponState = filteredStateQueue.peekFirst()) != null) {
            if (asyncWeaponState.getState().getPriority() >= state.getPriority())
                break;

            filteredStateQueue.pollFirst();
        }

        long expirationTimeout;

        if (isAutomaticModeEnabled() && !getWeapon().hasRecoilPositioning()) {
            expirationTimeout = (long) (50 / getFireRate());
        } else {
            expirationTimeout = 500;
        }

        filteredStateQueue.addFirst(new AsyncWeaponState(state, stateUpdateTimestamp, expirationTimeout));
    }

    public AsyncWeaponState nextNonExpiredHistoryState() {
        final long currentTime = System.currentTimeMillis();
        AsyncWeaponState result;

        while ((result = filteredStateQueue.pollLast()) != null)
            if (result.getTimestamp() + result.getDuration() >= currentTime && !(result.getState() == WeaponState.FIRING && (getWeapon().hasRecoilPositioning() || !isAutomaticModeEnabled()))) // Allow recoil for non-automatic weapons
                break;

        if (result == null)
            result = new AsyncWeaponState(getState(), stateUpdateTimestamp);

        return result;
    }

    public void resetCurrentSeries() {
        seriesShotCount = 0;
        seriesResetAllowed = false;
    }

    // ! TODO: Investigate
//    public void resetCurrentSeriesEventually() {
//        if(isOneClickBurstAllowed()) {
//	        seriesResetAllowed = true;
//	    } else {
//	        seriesShotCount = 0;
//	    }
//    }

    @Override
    public void reconcile() {
        if (!player.world.getGameRules().getBoolean("reconcileAmmunition") && !player.world.getGameRules().getBoolean("reconcileAttachment"))
            return;

        final ItemStack itemStack = getItemStack();

        if (player.world.getGameRules().getBoolean("reconcileAmmunition"))
            reconcileAmmunition(itemStack);

        if (player.world.getGameRules().getBoolean("reconcileAttachments"))
            reconcileAttachments(itemStack);
    }

    private void reconcileAmmunition(final ItemStack itemStack) {
        final int expectedStackAmmo = Tags.getAmmo(itemStack);

        if (ammo == expectedStackAmmo)
            return;

        LOGGER.debug("Reconciling ammunition. Expected ammunition: {}, Current ammunition: {}", expectedStackAmmo, ammo);

        ammo = expectedStackAmmo;

        updateTimestamp = System.currentTimeMillis();
    }

    private void reconcileAttachments(final ItemStack itemStack) {
        final int[] expectedAttachmentIds = Tags.getAttachmentIds(itemStack);

        if (Arrays.equals(expectedAttachmentIds, activeAttachmentIds))
            return;

        LOGGER.debug("Reconciling attachments. Expected attachments: {}, Current attachments: {}", Arrays.toString(expectedAttachmentIds), Arrays.toString(activeAttachmentIds));

        activeAttachmentIds = expectedAttachmentIds;

        updateTimestamp = System.currentTimeMillis();
    }

    public void startedCompoundMagSwapping() {
        compoundMagSwapping = true;
    }

    public void stoppedCompoundMagSwapping() {
        compoundMagSwapping = false;
    }

    // region Getters

    @Override
    protected int getSerialVersion() {
        return 9;
    }

    public Weapon getWeapon() {
        return (Weapon) item;
    }

    public RecoilParam getRecoilParameters() {
        if (AnimationModeProcessor.getInstance().getFPSMode())
            return AnimationGUI.getInstance().getRecoilParams();

        return getWeapon().builder.recoilParam;
    }

    public Pair<Double, Double> getScreenShakeParameters() {
        if (DebugCommand.isWorkingOnScreenShake())
            return DebugCommand.screenShakeParam;

        return getWeapon().getModernScreenShakeParameters();
    }

    public long getAnimationDuration() {
        if (!getWeapon().builder.isUsingNewSystem()) {
            LOGGER.debug("Weapon is using the old system, returning standard value");
            return getWeapon().getTotalReloadingDuration();
        }

        return getAnimationDuration(getState());
    }

    public long getAnimationDuration(final WeaponState state) {
        switch (state) {
            case LOAD:
                return getWeapon().getTotalReloadingDuration();
            case UNLOAD:
                return getWeapon().getTotalUnloadingDuration();
            case DRAWING:
                return getWeapon().getTotalDrawingDuration();
            case COMPOUND_RELOAD:
                return getWeapon().getRenderer().getWeaponRendererBuilder().getCompoundReloadDuration() / 2;
            case COMPOUND_RELOAD_EMPTY:
                return getWeapon().getRenderer().getWeaponRendererBuilder().getCompoundReloadEmptyDuration();
            case TACTICAL_RELOAD:
                return getWeapon().getRenderer().getWeaponRendererBuilder().getTacticalReloadDuration();
            case COMPOUND_RELOAD_FINISHED:
                return getWeapon().getRenderer().getWeaponRendererBuilder().getCompoundReloadDuration();
            default:
                return 100L;
        }
    }

    public float getFireRate() {
        return BalancePackManager.getFirerate(getWeapon());
    }

    public float getInaccuracy() {
        return BalancePackManager.getInaccuracy(getWeapon());
    }

    public ItemScope getScope() {
        final ItemAttachment<Weapon> scope = getAttachmentItemByCategory(AttachmentCategory.SCOPE);

        return scope instanceof ItemScope ? (ItemScope) scope : null;
    }

    public boolean hasScope() {
        return getScope() != null;
    }

    public boolean hasOpticalScope() {
        return hasScope() && getScope().isOptical();
    }

    public boolean isOneClickBurstAllowed() {
        return getWeapon().builder.isOneClickBurstAllowed;
    }

    public boolean isAutomaticModeEnabled() {
        return maxShots > 1;
    }

    public int[] getActiveAttachmentIds() {
        if (activeAttachmentIds == null || activeAttachmentIds.length != AttachmentCategory.values.length) {
            activeAttachmentIds = new int[AttachmentCategory.values.length];

            for (final CompatibleAttachment<Weapon> attachment : getWeapon().getCompatibleAttachments().values())
                if (attachment.isDefault())
                    activeAttachmentIds[attachment.getAttachment().getCategory().ordinal()] = Item.getIdFromItem(attachment.getAttachment());
        }

        return activeAttachmentIds;
    }

    public ItemAttachment<Weapon> getAttachmentItemByCategory(final AttachmentCategory category) {
        if (activeAttachmentIds == null || activeAttachmentIds.length <= category.ordinal())
            return null;

        final Item activeAttachment = Item.getItemById(activeAttachmentIds[category.ordinal()]);

        if (activeAttachment instanceof ItemAttachment)
            return (ItemAttachment<Weapon>) activeAttachment;

        return null;
    }

    @Override
    @SideOnly(CLIENT)
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return hasOpticalScope() ? OpticalScopePerspective.class : null;
    }

    @Override
    @SideOnly(CLIENT)
    public DynamicShaderGroupSource getShaderSource(final DynamicShaderPhase phase) {
        if (isAimed() && phase == DynamicShaderPhase.POST_WORLD_OPTICAL_SCOPE_RENDER) {
            final ItemScope scope = getScope();

            if (scope.isOptical())
                return scope.hasNightVision() && nightVisionOn ? nightVisionSource : vignetteSource;
        }

        final float progress = getAimChangeProgress();
        return ModernConfigManager.enableBlurOnAim && phase == DynamicShaderPhase.PRE_ITEM_RENDER && (isAimed() || (progress > 0 && progress < 1)) ? blurSource : null;
    }

    private float getAimChangeProgress() {
        float progress = ClampUtil.clampMaxFirst((float) (System.currentTimeMillis() - aimedChangeTimestamp) / AIM_CHANGE_DURATION, 0, 1);

        if (!isAimed())
            progress = 1 - progress;

        return progress;
    }

    @SideOnly(CLIENT)
    private float getOpticalScopeVignetteRadius(final float partialTicks) {
//        final EntityPlayer player = MC.player;
//        final float f = player.distanceWalkedModified - player.prevDistanceWalkedModified;
//        final float f1 = -(player.distanceWalkedModified + f * partialTicks);
//        final float f2 = player.prevCameraYaw + (player.cameraYaw - player.prevCameraYaw) * partialTicks;
//        return -2f * f2 + 0.55f;
        return 0.55f;
    }

    // endregion

    // region Setters

    @Override
    public boolean setState(final WeaponState state) {
        final boolean result = super.setState(state);

        addStateToHistory(state);

        return result;
    }

    public void setActiveAttachmentIds(final int[] activeAttachmentIds) {
        if (Arrays.equals(this.activeAttachmentIds, activeAttachmentIds))
            return;

        this.activeAttachmentIds = activeAttachmentIds;

        markDirty();
    }

    public void setSelectedAttachmentIndexes(final byte[] selectedAttachmentIndexes) {
        if (Arrays.equals(this.selectedAttachmentIndexes, selectedAttachmentIndexes))
            return;

        this.selectedAttachmentIndexes = selectedAttachmentIndexes;

        markDirty();
    }

    // ! TODO: Investigate
    // ? I am assuming this needs to be synced but all usages are comment out need to investigate - Luna Mira Lage (Desoroxxx)
    public void setSlideLock(final boolean slideLockOn) {
        if (this.slideLockOn == slideLockOn)
            return;

        this.slideLockOn = slideLockOn;

        markDirty();
    }

    public void setAmmo(final int ammo) {
        if (this.ammo == ammo)
            return;

        this.ammo = ammo;

        markDirty();
    }

    public void setZoom(float zoom) {
        if (this.zoom == zoom || zoom <= 0)
            return;

        this.zoom = zoom;

        markDirty();
    }

    public void setRecoil(final float recoil) {
        if (this.recoil == recoil)
            return;

        this.recoil = recoil;

        markDirty();
    }

    public void setMaxShots(final int maxShots) {
        if (this.maxShots == maxShots)
            return;

        this.maxShots = maxShots;

        markDirty();
    }

    public void setLaserOn(final boolean laserOn) {
        if (this.laserOn == laserOn)
            return;

        this.laserOn = laserOn;

        markDirty();
    }

    public void setNightVisionOn(final boolean nightVisionOn) {
        if (this.nightVisionOn == nightVisionOn)
            return;

        this.nightVisionOn = nightVisionOn;

        markDirty();
    }

    public void setActiveTextureIndex(final byte activeTextureIndex) {
        if (this.activeTextureIndex == activeTextureIndex)
            return;

        this.activeTextureIndex = activeTextureIndex;

        markDirty();
    }

    public void setAimed(final boolean aimed) {
        if (this.aimed == aimed)
            return;

        this.aimed = aimed;

        markDirty();

        aimedChangeTimestamp = System.currentTimeMillis();
    }

    // endregion

    // region NBT

    @Override
    public void readInstanceFromNBT(final NBTTagCompound tagCompound) {
        super.readInstanceFromNBT(tagCompound);

        loadAfterUnloadEnabled = tagCompound.getBoolean(LOAD_AFTER_UNLOAD_ENABLED_TAG);
        nightVisionOn = tagCompound.getBoolean(NIGHT_VISION_ON_TAG);
        laserOn = tagCompound.getBoolean(LASER_ON_TAG);
        aimed = tagCompound.getBoolean(AIMED_TAG);

        activeTextureIndex = tagCompound.getByte(ACTIVE_TEXTURE_INDEX_TAG);

        loadIterationCount = tagCompound.getInteger(LOAD_ITERATION_COUNT_TAG);
        maxShots = tagCompound.getInteger(MAX_SHOTS_TAG);
        ammo = tagCompound.getInteger(AMMO_TAG);

        recoil = tagCompound.getFloat(RECOIL_TAG);
        zoom = tagCompound.getFloat(ZOOM_TAG);

        selectedAttachmentIndexes = tagCompound.getByteArray(SELECTED_ATTACHMENT_INDEXES_TAG);

        activeAttachmentIds = tagCompound.getIntArray(ACTIVE_ATTACHMENT_IDS_TAG);
    }

    @Override
    public void writeInstanceToNBT(final NBTTagCompound tagCompound) {
        super.writeInstanceToNBT(tagCompound);

        tagCompound.setBoolean(LOAD_AFTER_UNLOAD_ENABLED_TAG, loadAfterUnloadEnabled);
        tagCompound.setBoolean(NIGHT_VISION_ON_TAG, nightVisionOn);
        tagCompound.setBoolean(LASER_ON_TAG, laserOn);
        tagCompound.setBoolean(AIMED_TAG, aimed);

        tagCompound.setByte(ACTIVE_TEXTURE_INDEX_TAG, activeTextureIndex);

        tagCompound.setInteger(LOAD_ITERATION_COUNT_TAG, loadIterationCount);
        tagCompound.setInteger(MAX_SHOTS_TAG, maxShots);
        tagCompound.setInteger(AMMO_TAG, ammo);

        tagCompound.setFloat(RECOIL_TAG, recoil);
        tagCompound.setFloat(ZOOM_TAG, zoom);

        tagCompound.setByteArray(SELECTED_ATTACHMENT_INDEXES_TAG, selectedAttachmentIndexes);

        tagCompound.setIntArray(ACTIVE_ATTACHMENT_IDS_TAG, activeAttachmentIds);
    }

    // endregion

    // region Serialization & Deserialization

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        loadAfterUnloadEnabled = byteBuf.readBoolean();
        nightVisionOn = byteBuf.readBoolean();
        laserOn = byteBuf.readBoolean();
        aimed = byteBuf.readBoolean();

        activeTextureIndex = byteBuf.readByte();

        loadIterationCount = byteBuf.readInt();
        maxShots = byteBuf.readInt();
        ammo = byteBuf.readInt();

        recoil = byteBuf.readFloat();
        zoom = byteBuf.readFloat();

        selectedAttachmentIndexes = readByteArray(byteBuf);

        activeAttachmentIds = readIntArray(byteBuf);
    }

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeBoolean(loadAfterUnloadEnabled);
        byteBuf.writeBoolean(nightVisionOn);
        byteBuf.writeBoolean(laserOn);
        byteBuf.writeBoolean(aimed);

        byteBuf.writeByte(activeTextureIndex);

        byteBuf.writeInt(loadIterationCount);
        byteBuf.writeInt(maxShots);
        byteBuf.writeInt(ammo);

        byteBuf.writeFloat(recoil);
        byteBuf.writeFloat(zoom);

        writeByteArray(byteBuf, selectedAttachmentIndexes);

        writeIntArray(byteBuf, activeAttachmentIds);
    }

    // endregion
}
