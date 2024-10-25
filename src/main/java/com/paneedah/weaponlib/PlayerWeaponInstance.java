package com.paneedah.weaponlib;

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
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL13;

import java.util.Arrays;
import java.util.Deque;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

@NoArgsConstructor
public class PlayerWeaponInstance extends PlayerItemInstance<WeaponState> implements DynamicShaderGroupSourceProvider {

    // ! TODO: Figure this out, the resources of weaponlib got incorrectly place in the src, and removing this shader system doesn't change anything

    private static final UUID NIGHT_VISION_SOURCE_UUID = UUID.randomUUID();
    private static final UUID VIGNETTE_SOURCE_UUID = UUID.randomUUID();
    private static final UUID BLUR_SOURCE_UUID = UUID.randomUUID();

    @SideOnly(CLIENT) public final DynamicShaderGroupSource blurSource = new DynamicShaderGroupSource(BLUR_SOURCE_UUID, new ResourceLocation("weaponlib", "blur.json"))
            .withUniform("Radius", context -> hasOpticalScope() ? 10 : 5)
            .withUniform("Progress", context -> getAimChangeProgress());

    @SideOnly(CLIENT) public final DynamicShaderGroupSource nightVisionSource = new DynamicShaderGroupSource(NIGHT_VISION_SOURCE_UUID, new ResourceLocation("weaponlib","night-vision.json"))
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

    @Getter private int ammo;
    @Getter private float recoil;
    @Getter @Setter private int seriesShotCount;
    @Getter @Setter private long lastFireTimestamp;
    @Getter private boolean aimed;
    @Getter private int maxShots;
    @Getter private float zoom = 1f;
    @Getter private byte activeTextureIndex;
    @Getter private boolean laserOn;
    private long aimedChangeTimestamp;
    @Getter private boolean nightVisionOn;
    @Setter @Getter private boolean seriesResetAllowed;
    @Setter @Getter private long lastBurstEndTimestamp;
    @Getter @Setter private boolean altModificationModeEnabled;

    @Getter @Setter private int loadIterationCount;
    @Getter @Setter private boolean loadAfterUnloadEnabled;
    @Setter @Getter private boolean delayCompoundEnd = true;

    @Getter @Setter private boolean isAwaitingCompoundInstructions = false;

    @Getter private boolean slideLockOn = false;

    /*
     * Upon adding an element to the head of the queue, all existing elements with lower priority are removed
     * from the queue. Elements with the same priority are not removed.
     * This ensures the queue is always sorted by priority, lowest (head) to highest (tail).
     */
    private final Deque<AsyncWeaponState> filteredStateQueue = new LinkedBlockingDeque<>();
    private int[] activeAttachmentIds = new int[0];
    @Getter private byte[] selectedAttachmentIndexes = new byte[0];

    public PlayerWeaponInstance(final int itemInventoryIndex, final EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    public PlayerWeaponInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    @Override
    protected int getSerialVersion() {
        return 9;
    }

    @Override
    protected void updateWith(final PlayerItemInstance<WeaponState> otherItemInstance, final boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);

        final PlayerWeaponInstance otherWeaponInstance = (PlayerWeaponInstance) otherItemInstance;

        setAmmo(otherWeaponInstance.ammo);
        setZoom(otherWeaponInstance.zoom);
        setRecoil(otherWeaponInstance.recoil);
        setSelectedAttachmentIndexes(otherWeaponInstance.selectedAttachmentIndexes);
        setActiveAttachmentIds(otherWeaponInstance.activeAttachmentIds);
        setActiveTextureIndex(otherWeaponInstance.activeTextureIndex);
        setSlideLock(otherWeaponInstance.slideLockOn);
        setLaserOn(otherWeaponInstance.laserOn);
        setMaxShots(otherWeaponInstance.maxShots);
        setLoadIterationCount(otherWeaponInstance.loadIterationCount);
        setLoadAfterUnloadEnabled(otherWeaponInstance.loadAfterUnloadEnabled);
    }

    @Override
    public boolean setState(final WeaponState state) {
        final boolean result = super.setState(state);

        addStateToHistory(state);

        return result;
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
        //return getWeapon().builder.fireRate;
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
        //System.out.println("One click burst allowed: " + getWeapon().builder.isOneClickBurstAllowed);
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

    public void setActiveAttachmentIds(final int[] activeAttachmentIds) {
        if (Arrays.equals(this.activeAttachmentIds, activeAttachmentIds))
            return;

        this.activeAttachmentIds = activeAttachmentIds;

        markDirty();
    }

    void setSelectedAttachmentIndexes(final byte[] selectedAttachmentIndexes) {
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

    public void setZoom(final float zoom) {
        if (this.zoom == zoom || zoom <= 0)
            return;

        this.zoom = zoom;

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
    protected void reconcile() {
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

    // ! INSTANCE_TAG TODO: Once NBT does not use serialized data, improve serialization
    // region Serialization and Deserialization

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        activeAttachmentIds = readIntArray(byteBuf);
        selectedAttachmentIndexes = readByteArray(byteBuf);
        ammo = byteBuf.readInt();
        aimed = byteBuf.readBoolean();
        recoil = byteBuf.readFloat();
        maxShots = byteBuf.readInt();
        zoom = byteBuf.readFloat();
        activeTextureIndex = byteBuf.readByte();
        laserOn = byteBuf.readBoolean();
        nightVisionOn = byteBuf.readBoolean();
        loadIterationCount = byteBuf.readInt();
        loadAfterUnloadEnabled = byteBuf.readBoolean();
        altModificationModeEnabled = byteBuf.readBoolean();
    }

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        writeIntArray(byteBuf, activeAttachmentIds);
        writeByteArray(byteBuf, selectedAttachmentIndexes);
        byteBuf.writeInt(ammo);
        byteBuf.writeBoolean(aimed);
        byteBuf.writeFloat(recoil);
        byteBuf.writeInt(maxShots);
        byteBuf.writeFloat(zoom);
        byteBuf.writeByte(activeTextureIndex);
        byteBuf.writeBoolean(laserOn);
        byteBuf.writeBoolean(nightVisionOn);
        byteBuf.writeInt(loadIterationCount);
        byteBuf.writeBoolean(loadAfterUnloadEnabled);
        byteBuf.writeBoolean(altModificationModeEnabled);
    }

    private static int[] readIntArray(final ByteBuf byteBuf) {
        final int length = byteBuf.readByte();

        final int[] array = new int[length];
        for (int i = 0; i < length; i++)
            array[i] = byteBuf.readInt();

        return array;
    }

    private static byte[] readByteArray(final ByteBuf byteBuf) {
        final int length = byteBuf.readByte();

        final byte[] array = new byte[length];
        for (int i = 0; i < length; i++)
            array[i] = byteBuf.readByte();

        return array;
    }

    private static void writeIntArray(final ByteBuf byteBuf, final int[] array) {
        byteBuf.writeByte(array.length);

        for (final int i : array)
            byteBuf.writeInt(i);
    }

    private static void writeByteArray(final ByteBuf byteBuf, final byte[] array) {
        byteBuf.writeByte(array.length);

        for (final byte b : array)
            byteBuf.writeByte(b);
    }

    // endregion
}
