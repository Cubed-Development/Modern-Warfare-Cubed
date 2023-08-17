package com.paneedah.weaponlib.grenade;

import com.paneedah.mwc.rendering.renderer.ModelSourceRenderer;
import com.paneedah.mwc.rendering.TexturedModel;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.*;
import com.paneedah.weaponlib.animation.DebugPositioner.TransitionConfiguration;
import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class GrenadeRenderer extends ModelSourceRenderer implements IBakedModel {

    private static final float DEFAULT_RANDOMIZING_RATE = 0.33f;

    private static final float DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE = 0.06f;

    private static final int DEFAULT_ANIMATION_DURATION = 70;

    protected TextureManager textureManager;

    @Override
    public void doRender() {
        if (owner != null && transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND && owner.isSneaking())
            GlStateManager.translate(0, -0.2F, 0);

        if (onGround())
            GlStateManager.scale(-3, -3, -3);

        renderItem();
    }

    protected static class StateDescriptor {
        protected MultipartRenderStateManager<GrenadeRenderableState, Part, RenderContext<GrenadeRenderableState>> stateManager;
        protected float rate;
        protected float amplitude = 0.04f;
        private PlayerGrenadeInstance instance;

        public StateDescriptor(PlayerGrenadeInstance instance, MultipartRenderStateManager<GrenadeRenderableState, Part, RenderContext<GrenadeRenderableState>> stateManager, float rate, float amplitude) {
            this.instance = instance;
            this.stateManager = stateManager;
            this.rate = rate;
            this.amplitude = amplitude;
        }
    }

    private static class SimplePositioning {
        Part attachedTo;
        Consumer<RenderContext<GrenadeRenderableState>> positioning;

        SimplePositioning(Part attachedTo, Consumer<RenderContext<GrenadeRenderableState>> positioning) {
            this.attachedTo = attachedTo;
            this.positioning = positioning;
        }
    }

    public static class Builder {

        private ModelBase model;
        private String textureName;

        private Consumer<ItemStack> entityPositioning;
        private Runnable thrownEntityPositioning = () -> {};
        private Consumer<ItemStack> inventoryPositioning;
        private Consumer<RenderContext<GrenadeRenderableState>> thirdPersonPositioning;

        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioning;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonRightHandPositioning;
        private LinkedHashMap<Part, SimplePositioning> firstPersonCustomPositioning = new LinkedHashMap<>();

        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioningRunning;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonLeftHandPositioningRunning;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonRightHandPositioningRunning;
        private LinkedHashMap<Part, Consumer<RenderContext<GrenadeRenderableState>>> firstPersonCustomPositioningRunning = new LinkedHashMap<>();

        private List<Transition<RenderContext<GrenadeRenderableState>>> firstPersonPositioningSafetyPinOff;
        private List<Transition<RenderContext<GrenadeRenderableState>>> firstPersonLeftHandPositioningSafetyPinOff;
        private List<Transition<RenderContext<GrenadeRenderableState>>> firstPersonRightHandPositioningSafetyPinOff;
        private LinkedHashMap<Part, List<Transition<RenderContext<GrenadeRenderableState>>>> firstPersonCustomPositioningSafetyPinOff = new LinkedHashMap<>();

        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioningStrikerLeverOff;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonLeftHandPositioningStrikerLeverOff;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonRightHandPositioningStrikerLeverOff;
        private LinkedHashMap<Part, SimplePositioning> firstPersonCustomPositioningStrikerLeverOff = new LinkedHashMap<>();

        private List<Transition<RenderContext<GrenadeRenderableState>>> firstPersonPositioningThrowing;
        private List<Transition<RenderContext<GrenadeRenderableState>>> firstPersonLeftHandPositioningThrowing;
        private List<Transition<RenderContext<GrenadeRenderableState>>> firstPersonRightHandPositioningThrowing;
        private LinkedHashMap<Part, List<Transition<RenderContext<GrenadeRenderableState>>>> firstPersonCustomPositioningThrowing = new LinkedHashMap<>();

        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioningThrown;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonLeftHandPositioningThrown;
        private Consumer<RenderContext<GrenadeRenderableState>> firstPersonRightHandPositioningThrown;
        private LinkedHashMap<Part, SimplePositioning> firstPersonCustomPositioningThrown = new LinkedHashMap<>();

        private long totalTakingPinOffDuration;
        private long totalThrowingDuration;


        private float normalRandomizingRate = DEFAULT_RANDOMIZING_RATE; // movements per second, e.g. 0.25 = 0.25 movements per second = 1 movement in 3 minutes
        private float normalRandomizingAmplitude = DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE;
        public int animationDuration = DEFAULT_ANIMATION_DURATION;
        private Supplier<Float> xCenterOffset = () -> 0f;
        private Supplier<Float> yCenterOffset = () -> 0f;
        private Supplier<Float> zCenterOffset = () -> 0f;

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withAnimationDuration(int animationDuration) {
            this.animationDuration = animationDuration;
            return this;
        }

        public Builder withNormalRandomizingRate(float normalRandomizingRate) {
            this.normalRandomizingRate = normalRandomizingRate;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName + ".png";
            return this;
        }

        public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
            this.entityPositioning = entityPositioning;
            return this;
        }

        public Builder withThrownEntityPositioning(Runnable throwEntityPositioning) {
            this.thrownEntityPositioning = throwEntityPositioning;
            return this;
        }

        public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
            return this;
        }

        public Builder withThirdPersonPositioning(Consumer<RenderContext<GrenadeRenderableState>> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return this;
        }

        public Builder withFirstPersonHandPositioning(
                Consumer<RenderContext<GrenadeRenderableState>> leftHand,
                Consumer<RenderContext<GrenadeRenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioning(Part part, Part attachedTo, Consumer<RenderContext<GrenadeRenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioning.put(part, new SimplePositioning(attachedTo, positioning)) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        public Builder withFirstPersonPositioningRunning(Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioningRunning) {
            this.firstPersonPositioningRunning = firstPersonPositioningRunning;
            return this;
        }

        public Builder withFirstPersonHandPositioningRunning(
                Consumer<RenderContext<GrenadeRenderableState>> leftHand,
                Consumer<RenderContext<GrenadeRenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningRunning = leftHand;
            this.firstPersonRightHandPositioningRunning = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioningRunning(Part part, Consumer<RenderContext<GrenadeRenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningRunning.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }


        public Builder withFirstPersonPositioningThrown(Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioningThrown) {
            this.firstPersonPositioningThrown = firstPersonPositioningThrown;
            return this;
        }

        public Builder withFirstPersonHandPositioningThrown(
                Consumer<RenderContext<GrenadeRenderableState>> leftHand,
                Consumer<RenderContext<GrenadeRenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningThrown = leftHand;
            this.firstPersonRightHandPositioningThrown = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioningThrown(Part part, Part attachedTo, Consumer<RenderContext<GrenadeRenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningThrown.put(part,
                    new SimplePositioning(attachedTo, positioning)) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningSafetyPinOff(Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            this.firstPersonPositioningSafetyPinOff = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonPositioningThrowing(Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            this.firstPersonPositioningThrowing = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonPositioningStrikerLeverOff(Consumer<RenderContext<GrenadeRenderableState>> firstPersonPositioningStrikerLeverOff) {
            this.firstPersonPositioningStrikerLeverOff = firstPersonPositioningStrikerLeverOff;
            return this;
        }


        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningSafetyPinOff(Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            this.firstPersonLeftHandPositioningSafetyPinOff = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningThrowing(Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            this.firstPersonLeftHandPositioningThrowing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningThrowing(Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            this.firstPersonRightHandPositioningThrowing = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningSafetyPinOff(Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            this.firstPersonRightHandPositioningSafetyPinOff = Arrays.asList(transitions);
            return this;
        }

        public Builder withFirstPersonHandPositioningStrikerLevelOff(
                Consumer<RenderContext<GrenadeRenderableState>> leftHand,
                Consumer<RenderContext<GrenadeRenderableState>> rightHand) {
            this.firstPersonLeftHandPositioningStrikerLeverOff = leftHand;
            this.firstPersonRightHandPositioningStrikerLeverOff = rightHand;
            return this;
        }

        public Builder withFirstPersonCustomPositioningStrikerLeverOff(Part part, Part attachedTo, Consumer<RenderContext<GrenadeRenderableState>> positioning) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if (this.firstPersonCustomPositioningStrikerLeverOff.put(part,
                    new SimplePositioning(attachedTo, positioning)) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningSafetyPinOff(Part part, Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningSafetyPinOff.put(part, Arrays.asList(transitions));
            return this;
        }

        @SafeVarargs
        public final Builder withFirstPersonCustomPositioningThrowing(Part part, Transition<RenderContext<GrenadeRenderableState>>... transitions) {
            if (part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningThrowing.put(part, Arrays.asList(transitions));
            return this;
        }

        public Builder withEntityRotationCenterOffsets(Supplier<Float> xCenterOffset, Supplier<Float> yCenterOffset, Supplier<Float> zCenterOffset) {
            this.xCenterOffset = xCenterOffset;
            this.yCenterOffset = yCenterOffset;
            this.zCenterOffset = zCenterOffset;
            return this;
        }

        public GrenadeRenderer build() {
            if (FMLCommonHandler.instance().getSide() == Side.SERVER) {
                return null;
            }

            if (inventoryPositioning == null) {
                inventoryPositioning = itemStack -> {GL11.glTranslatef(0, 0.12f, 0);};
            }

            if (entityPositioning == null) {
                entityPositioning = itemStack -> {
                };
            }

            GrenadeRenderer renderer = new GrenadeRenderer(this);

            if (firstPersonPositioning == null) {
                firstPersonPositioning = (renderContext) -> {};
            }

            if (firstPersonPositioningSafetyPinOff == null) {
                firstPersonPositioningSafetyPinOff = Collections.singletonList(new Transition<>(firstPersonPositioning, animationDuration));
            }

            if (firstPersonPositioningThrowing == null) {
                firstPersonPositioningThrowing = Collections.singletonList(new Transition<>(firstPersonPositioning, animationDuration));
            }

            for (Transition<RenderContext<GrenadeRenderableState>> t : firstPersonPositioningSafetyPinOff) {
                totalTakingPinOffDuration += t.getDuration();
                totalTakingPinOffDuration += t.getPause();
            }

            for (Transition<RenderContext<GrenadeRenderableState>> t : firstPersonPositioningThrowing) {
                totalThrowingDuration += t.getDuration();
                totalThrowingDuration += t.getPause();
            }

            if (firstPersonPositioningRunning == null) {
                firstPersonPositioningRunning = firstPersonPositioning;
            }

            if (firstPersonPositioningStrikerLeverOff == null) {
                if (firstPersonPositioningSafetyPinOff != null && !firstPersonPositioningSafetyPinOff.isEmpty()) {
                    // Use last transition
                    firstPersonPositioningStrikerLeverOff = firstPersonPositioningSafetyPinOff
                            .get(firstPersonPositioningSafetyPinOff.size() - 1).getItemPositioning();
                }

                if (firstPersonPositioningStrikerLeverOff == null) {
                    firstPersonPositioningStrikerLeverOff = firstPersonPositioning;
                }
            }

            if (firstPersonPositioningThrown == null) {
                if (firstPersonPositioningThrowing != null && !firstPersonPositioningThrowing.isEmpty()) {
                    // Use last transition
                    firstPersonPositioningThrown = firstPersonPositioningThrowing
                            .get(firstPersonPositioningThrowing.size() - 1).getItemPositioning();
                }

                if (firstPersonPositioningThrown == null) {
                    firstPersonPositioningThrown = firstPersonPositioning;
                }
            }

            if (thirdPersonPositioning == null) {
                thirdPersonPositioning = (context) -> {
                    GL11.glTranslatef(-0.4F, 0.2F, 0.4F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(70F, 1f, 0f, 0f);
                };
            }

            // Left hand positioning

            if (firstPersonLeftHandPositioning == null) {
                firstPersonLeftHandPositioning = (context) -> {};
            }

            if (firstPersonLeftHandPositioningSafetyPinOff == null) {
                firstPersonLeftHandPositioningSafetyPinOff = firstPersonPositioningSafetyPinOff.stream().map(t -> new Transition<RenderContext<GrenadeRenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

            if (firstPersonLeftHandPositioningThrowing == null) {
                firstPersonLeftHandPositioningThrowing = firstPersonPositioningThrowing.stream().map(t -> new Transition<RenderContext<GrenadeRenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

            if (firstPersonRightHandPositioningThrowing == null) {
                firstPersonRightHandPositioningThrowing = firstPersonPositioningThrowing.stream().map(t -> new Transition<RenderContext<GrenadeRenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

            if (firstPersonLeftHandPositioningRunning == null) {
                firstPersonLeftHandPositioningRunning = firstPersonLeftHandPositioning;
            }

            if (firstPersonLeftHandPositioningStrikerLeverOff == null) {

                if (firstPersonLeftHandPositioningSafetyPinOff != null && !firstPersonLeftHandPositioningSafetyPinOff.isEmpty()) {
                    // Use last transition
                    firstPersonLeftHandPositioningStrikerLeverOff = firstPersonLeftHandPositioningSafetyPinOff
                            .get(firstPersonLeftHandPositioningSafetyPinOff.size() - 1).getItemPositioning();
                }

                if (firstPersonLeftHandPositioningStrikerLeverOff == null) {
                    firstPersonLeftHandPositioningStrikerLeverOff = firstPersonLeftHandPositioning;
                }

            }

            if (firstPersonLeftHandPositioningThrown == null) {

                if (firstPersonLeftHandPositioningThrowing != null && !firstPersonLeftHandPositioningThrowing.isEmpty()) {
                    // Use last transition
                    firstPersonLeftHandPositioningThrown = firstPersonLeftHandPositioningThrowing
                            .get(firstPersonLeftHandPositioningThrowing.size() - 1).getItemPositioning();
                }

                if (firstPersonLeftHandPositioningThrown == null) {
                    firstPersonLeftHandPositioningThrown = firstPersonLeftHandPositioning;
                }

            }

            // Right hand positioning

            if (firstPersonRightHandPositioning == null) {
                firstPersonRightHandPositioning = (context) -> {};
            }

            if (firstPersonRightHandPositioningSafetyPinOff == null) {
                //firstPersonRightHandPositioningSafetyPinOff = Collections.singletonList(new Transition(firstPersonRightHandPositioning, DEFAULT_ANIMATION_DURATION));
                firstPersonRightHandPositioningSafetyPinOff = firstPersonPositioningSafetyPinOff.stream().map(t -> new Transition<RenderContext<GrenadeRenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

            if (firstPersonRightHandPositioningThrowing == null) {
                //firstPersonRightHandPositioningSafetyPinOff = Collections.singletonList(new Transition(firstPersonRightHandPositioning, DEFAULT_ANIMATION_DURATION));
                firstPersonRightHandPositioningThrowing = firstPersonPositioningThrowing.stream().map(t -> new Transition<RenderContext<GrenadeRenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

            if (firstPersonRightHandPositioningRunning == null) {
                firstPersonRightHandPositioningRunning = firstPersonRightHandPositioning;
            }

            if (firstPersonRightHandPositioningStrikerLeverOff == null) {

                if (firstPersonRightHandPositioningSafetyPinOff != null && !firstPersonRightHandPositioningSafetyPinOff.isEmpty()) {
                    // Use last transition
                    firstPersonRightHandPositioningStrikerLeverOff = firstPersonRightHandPositioningSafetyPinOff
                            .get(firstPersonRightHandPositioningSafetyPinOff.size() - 1).getItemPositioning();
                }

                if (firstPersonRightHandPositioningStrikerLeverOff == null) {
                    firstPersonRightHandPositioningStrikerLeverOff = firstPersonRightHandPositioning;
                }

            }

            if (firstPersonRightHandPositioningThrown == null) {

                if (firstPersonRightHandPositioningThrowing != null && !firstPersonRightHandPositioningThrowing.isEmpty()) {
                    // Use last transition
                    firstPersonRightHandPositioningThrown = firstPersonRightHandPositioningThrowing
                            .get(firstPersonRightHandPositioningThrowing.size() - 1).getItemPositioning();
                }

                if (firstPersonRightHandPositioningThrown == null) {
                    firstPersonRightHandPositioningThrown = firstPersonRightHandPositioning;
                }

            }

            firstPersonCustomPositioningSafetyPinOff.forEach((p, t) -> {
                if (t.size() != firstPersonPositioningSafetyPinOff.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningSafetyPinOff.size()
                            + ", actual: " + t.size());
                }
            });

            firstPersonCustomPositioningThrowing.forEach((p, t) -> {
                if (t.size() != firstPersonPositioningThrowing.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningThrowing.size()
                            + ", actual: " + t.size());
                }
            });

            if (!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningStrikerLeverOff.isEmpty()) {
                firstPersonCustomPositioning.forEach((part, pos) -> {
                    firstPersonCustomPositioningStrikerLeverOff.put(part, new SimplePositioning(null, pos.positioning));
                });
            }

            if (!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningThrown.isEmpty()) {
                firstPersonCustomPositioning.forEach((part, pos) -> {
                    firstPersonCustomPositioningThrown.put(part, new SimplePositioning(null, pos.positioning));
                });
            }

            return renderer;
        }

        public Consumer<ItemStack> getEntityPositioning() {
            return entityPositioning;
        }

        public Consumer<ItemStack> getInventoryPositioning() {
            return inventoryPositioning;
        }

        public Consumer<RenderContext<GrenadeRenderableState>> getThirdPersonPositioning() {
            return thirdPersonPositioning;
        }

        public String getTextureName() {
            return textureName;
        }

        public ModelBase getModel() {
            return model;
        }
    }

    private Builder builder;

    private Map<StateManagerKey, MultipartRenderStateManager<GrenadeRenderableState, Part, RenderContext<GrenadeRenderableState>>> firstPersonStateManagers;

    private MultipartTransitionProvider<GrenadeRenderableState, Part, RenderContext<GrenadeRenderableState>> weaponTransitionProvider;

    protected ClientModContext clientModContext;

    private GrenadeRenderer(Builder builder) {
        this.builder = builder;
        this.textureManager = MC.getTextureManager();
        this.builder = builder;
        this.firstPersonStateManagers = new HashMap<>();
        this.weaponTransitionProvider = new WeaponPositionProvider();
    }

    protected long getTotalTakingSafetyPinOffDuration() {
        return builder.totalTakingPinOffDuration;
    }

    protected long getTotalThrowingDuration() {
        return builder.totalThrowingDuration;
    }

    protected ClientModContext getClientModContext() {
        return clientModContext;
    }

    public void setClientModContext(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
    }


    private static class StateManagerKey {
        EntityLivingBase player;
        int slot = -1;

        public StateManagerKey(EntityLivingBase player, int slot) {
            this.player = player;
            this.slot = slot;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((player == null) ? 0 : player.hashCode());
            result = prime * result + slot;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            StateManagerKey other = (StateManagerKey) obj;
            if (player == null) {
                if (other.player != null)
                    return false;
            } else if (!player.equals(other.player))
                return false;
            if (slot != other.slot)
                return false;
            return true;
        }

    }

    protected StateDescriptor getStateDescriptor(EntityLivingBase player, ItemStack itemStack) {
        float amplitude = builder.normalRandomizingAmplitude;
        float rate = builder.normalRandomizingRate;
        GrenadeRenderableState currentState = null;

        PlayerItemInstance<?> playerItemInstance = clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
        //.getMainHandItemInstance(player, PlayerWeaponInstance.class); // TODO: cannot be always main hand, need to which hand from context

        PlayerGrenadeInstance playerGrenadeInstance = null;
        if (playerItemInstance == null || !(playerItemInstance instanceof PlayerGrenadeInstance)
                || playerItemInstance.getItem() != itemStack.getItem()) {
            LOG.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, itemStack);
        } else {
            playerGrenadeInstance = (PlayerGrenadeInstance) playerItemInstance;
        }

        if (playerGrenadeInstance != null) {
            AsyncGrenadeState asyncWeaponState = getNextNonExpiredState(playerGrenadeInstance);

            switch (asyncWeaponState.getState()) {

                case SAFETY_PING_OFF:
                    currentState = GrenadeRenderableState.SAFETY_PIN_OFF;
                    break;

                case STRIKER_LEVER_RELEASED:
                    currentState = GrenadeRenderableState.STRIKER_LEVEL_OFF;
                    break;

                case THROWING:
                    currentState = GrenadeRenderableState.THROWING;
                    break;

                case THROWN:
                    currentState = GrenadeRenderableState.THROWN;
                    break;

                default:
                    if (player.isSprinting() && builder.firstPersonPositioningRunning != null) {
                        currentState = GrenadeRenderableState.RUNNING;
                    }
            }

            LOG.trace("Rendering state {} created from {}", currentState, asyncWeaponState.getState());
        }

        if (currentState == null) {
            currentState = GrenadeRenderableState.NORMAL;
        }


        // TODO: what if there are multiple items of the same type? They all share the same state manager.
        StateManagerKey key = new StateManagerKey(player, playerGrenadeInstance != null ?
                playerGrenadeInstance.getItemInventoryIndex() : -1);
        MultipartRenderStateManager<GrenadeRenderableState, Part, RenderContext<GrenadeRenderableState>> stateManager = firstPersonStateManagers.get(key);
        if (stateManager == null) {
            stateManager = new MultipartRenderStateManager<>(currentState, weaponTransitionProvider);
            firstPersonStateManagers.put(key, stateManager);
        } else {
            stateManager.setState(currentState, true, currentState == GrenadeRenderableState.THROWING);
        }


        return new StateDescriptor(playerGrenadeInstance, stateManager, rate, amplitude);
    }

    private AsyncGrenadeState getNextNonExpiredState(PlayerGrenadeInstance playerWeaponState) {
        AsyncGrenadeState asyncWeaponState = null;
        while ((asyncWeaponState = playerWeaponState.nextHistoryState()) != null) {
            if (System.currentTimeMillis() > asyncWeaponState.getTimestamp() + asyncWeaponState.getDuration()) {
                continue;
            } else {
                break;
            }
        }

        return asyncWeaponState;
    }

    private Consumer<RenderContext<GrenadeRenderableState>> createWeaponPartPositionFunction(Transition<RenderContext<GrenadeRenderableState>> t) {
        if (t == null) {
            return context -> {};
        }
        Consumer<RenderContext<GrenadeRenderableState>> weaponPositionFunction = t.getItemPositioning();
        if ((Consumer<?>) weaponPositionFunction == Transition.anchoredPosition()) {
            return MultipartTransition.anchoredPosition();
        } else if (weaponPositionFunction != null) {
            return context -> weaponPositionFunction.accept(context);
        }

        return context -> {};

    }

    private Consumer<RenderContext<GrenadeRenderableState>> createWeaponPartPositionFunction(Consumer<RenderContext<GrenadeRenderableState>> weaponPositionFunction) {

        if ((Consumer<?>) weaponPositionFunction == Transition.anchoredPosition()) {
            return MultipartTransition.anchoredPosition();
        } else if (weaponPositionFunction != null) {
            return context -> weaponPositionFunction.accept(context);
        }
        return context -> {};

    }

    private List<MultipartTransition<Part, RenderContext<GrenadeRenderableState>>> getComplexTransition(
            List<Transition<RenderContext<GrenadeRenderableState>>> wt,
            List<Transition<RenderContext<GrenadeRenderableState>>> lht,
            List<Transition<RenderContext<GrenadeRenderableState>>> rht,
            LinkedHashMap<Part, List<Transition<RenderContext<GrenadeRenderableState>>>> custom) {
        List<MultipartTransition<Part, RenderContext<GrenadeRenderableState>>> result = new ArrayList<>();
        for (int i = 0; i < wt.size(); i++) {
            Transition<RenderContext<GrenadeRenderableState>> p = wt.get(i);
            Transition<RenderContext<GrenadeRenderableState>> l = lht.get(i);
            Transition<RenderContext<GrenadeRenderableState>> r = rht.get(i);

            long pause = p.getPause();
            if (DebugPositioner.isDebugModeEnabled()) {
                TransitionConfiguration transitionConfiguration = DebugPositioner.getTransitionConfiguration(i, false);
                if (transitionConfiguration != null) {
                    pause = transitionConfiguration.getPause();
                }
            }
            MultipartTransition<Part, RenderContext<GrenadeRenderableState>> t = new MultipartTransition<Part, RenderContext<GrenadeRenderableState>>(
                    p.getDuration(), pause)
                    .withPartPositionFunction(Part.MAIN_ITEM, p.getAttachedTo(), createWeaponPartPositionFunction(p))
                    .withPartPositionFunction(Part.LEFT_HAND, l.getAttachedTo(), createWeaponPartPositionFunction(l))
                    .withPartPositionFunction(Part.RIGHT_HAND, r.getAttachedTo(), createWeaponPartPositionFunction(r));

            for (Entry<Part, List<Transition<RenderContext<GrenadeRenderableState>>>> e : custom.entrySet()) {
                List<Transition<RenderContext<GrenadeRenderableState>>> partTransitions = e.getValue();
                Transition<RenderContext<GrenadeRenderableState>> partTransition = null;
                if (partTransitions != null && partTransitions.size() > i) {
                    partTransition = partTransitions.get(i);
                } else {
                    LOG.warn("Transition not defined for part {}", custom);
                }
                t.withPartPositionFunction(e.getKey(), partTransition.getAttachedTo(), createWeaponPartPositionFunction(partTransition));
            }

            result.add(t);
        }
        return result;
    }

    private List<MultipartTransition<Part, RenderContext<GrenadeRenderableState>>> getSimpleTransition(
            Consumer<RenderContext<GrenadeRenderableState>> w,
            Consumer<RenderContext<GrenadeRenderableState>> lh,
            Consumer<RenderContext<GrenadeRenderableState>> rh,
            //Consumer<RenderContext<GrenadeRenderableState>> m,
            LinkedHashMap<Part, SimplePositioning> custom, ///LinkedHashMap<Part, Consumer<RenderContext<GrenadeRenderableState>>> custom,
            int duration) {

        long pause = 0;
        if (DebugPositioner.isDebugModeEnabled()) {
            TransitionConfiguration transitionConfiguration = DebugPositioner.getTransitionConfiguration(0, false);
            if (transitionConfiguration != null) {
                pause = transitionConfiguration.getPause();
            }
        }
        MultipartTransition<Part, RenderContext<GrenadeRenderableState>> mt = new MultipartTransition<Part, RenderContext<GrenadeRenderableState>>(duration, pause)
                .withPartPositionFunction(Part.MAIN_ITEM, null, createWeaponPartPositionFunction(w))
                .withPartPositionFunction(Part.LEFT_HAND, null, createWeaponPartPositionFunction(lh))
                .withPartPositionFunction(Part.RIGHT_HAND, null, createWeaponPartPositionFunction(rh));
        custom.forEach((part, position) -> {
            mt.withPartPositionFunction(part, position.attachedTo, createWeaponPartPositionFunction(position.positioning));
        });
        return Collections.singletonList(mt);
    }

    private class WeaponPositionProvider implements MultipartTransitionProvider<GrenadeRenderableState, Part, RenderContext<GrenadeRenderableState>> {

        @Override
        public List<MultipartTransition<Part, RenderContext<GrenadeRenderableState>>> getTransitions(GrenadeRenderableState state) {
            switch (state) {
                case SAFETY_PIN_OFF:
                    return getComplexTransition(builder.firstPersonPositioningSafetyPinOff,
                            builder.firstPersonLeftHandPositioningSafetyPinOff,
                            builder.firstPersonRightHandPositioningSafetyPinOff,
                            builder.firstPersonCustomPositioningSafetyPinOff
                    );

                case STRIKER_LEVEL_OFF:
                    return getSimpleTransition(builder.firstPersonPositioningStrikerLeverOff,
                            builder.firstPersonLeftHandPositioningStrikerLeverOff,
                            builder.firstPersonRightHandPositioningStrikerLeverOff,
                            builder.firstPersonCustomPositioningStrikerLeverOff,
                            builder.animationDuration);

                case THROWING:
                    return getComplexTransition(builder.firstPersonPositioningThrowing,
                            builder.firstPersonLeftHandPositioningThrowing,
                            builder.firstPersonRightHandPositioningThrowing,
                            builder.firstPersonCustomPositioningThrowing
                    );

                case THROWN:
                    return getSimpleTransition(builder.firstPersonPositioningThrown,
                            builder.firstPersonLeftHandPositioningThrown,
                            builder.firstPersonRightHandPositioningThrown,
                            builder.firstPersonCustomPositioningThrown,
                            builder.animationDuration);

                case NORMAL:
                case RUNNING: // TODO: configure running position
                    return getSimpleTransition(builder.firstPersonPositioning,
                            builder.firstPersonLeftHandPositioning,
                            builder.firstPersonRightHandPositioning,
                            builder.firstPersonCustomPositioning,
                            builder.animationDuration);
                default:
                    break;
            }
            return null;
        }
    }

    public void renderItem(ItemStack weaponItemStack, RenderContext<GrenadeRenderableState> renderContext,
                           Positioner<Part, RenderContext<GrenadeRenderableState>> positioner) {

        if (builder.getTextureName() != null) {
            MC.renderEngine.bindTexture(new ResourceLocation(ID + ":textures/models/" + builder.getTextureName()));
        } else {
            String textureName = null;

            if (textureName == null) {
                ItemGrenade weapon = ((ItemGrenade) weaponItemStack.getItem());
                textureName = weapon.getTextureName();
            }

            MC.renderEngine.bindTexture(new ResourceLocation(ID + ":textures/models/" + textureName));
        }

        //limbSwing, float flimbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale
        builder.getModel().render(null,
                renderContext.getLimbSwing(),
                renderContext.getFlimbSwingAmount(),
                renderContext.getAgeInTicks(),
                renderContext.getNetHeadYaw(),
                renderContext.getHeadPitch(),
                renderContext.getScale());

        PlayerItemInstance<?> itemInstance = renderContext.getPlayerItemInstance();
        if (!(itemInstance instanceof PlayerGrenadeInstance)) {
            //log.error("Instance is not a grenade!");
            return;
        }

        PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance) itemInstance;

        List<CompatibleAttachment<? extends AttachmentContainer>> attachments = grenadeInstance.getActiveAttachments(renderContext, true);
        renderAttachments(positioner, renderContext, attachments);
    }

    public void renderAttachments(Positioner<Part, RenderContext<GrenadeRenderableState>> positioner, RenderContext<GrenadeRenderableState> renderContext, List<CompatibleAttachment<? extends AttachmentContainer>> attachments) {
        for (CompatibleAttachment<?> compatibleAttachment : attachments) {
            if (compatibleAttachment != null && !(compatibleAttachment.getAttachment() instanceof ItemSkin)) {
                renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
            }
        }
    }

    private void renderCompatibleAttachment(CompatibleAttachment<?> compatibleAttachment,
                                            Positioner<Part, RenderContext<GrenadeRenderableState>> positioner, RenderContext<GrenadeRenderableState> renderContext) {


        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

        if (compatibleAttachment.getPositioning() != null) {
            //compatibleAttachment.getPositioning().accept(renderContext.getPlayer(), renderContext.getWeapon());
        }

        ItemAttachment<?> itemAttachment = compatibleAttachment.getAttachment();


        if (positioner != null) {
            if (itemAttachment instanceof Part) {
                positioner.position((Part) itemAttachment, renderContext);
                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position((Part) itemAttachment, renderContext);
                }
            } else if (itemAttachment.getRenderablePart() != null) {
                positioner.position(itemAttachment.getRenderablePart(), renderContext);
                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position(itemAttachment.getRenderablePart(), renderContext);
                }
            }
        }

        for (TexturedModel texturedModel : compatibleAttachment.getAttachment().getTexturedModels()) {
            MC.renderEngine.bindTexture(new ResourceLocation(ID + ":textures/models/" + texturedModel.getTextureName()));
            GL11.glPushMatrix();
            GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
            if (compatibleAttachment.getModelPositioning() != null) {
                compatibleAttachment.getModelPositioning().accept(texturedModel.getModel());
            }
            texturedModel.getModel().render(
                    renderContext.getEntityLiving(),
                    renderContext.getLimbSwing(),
                    renderContext.getFlimbSwingAmount(),
                    renderContext.getAgeInTicks(),
                    renderContext.getNetHeadYaw(),
                    renderContext.getHeadPitch(),
                    renderContext.getScale()
            );

            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }


        final CustomRenderer<GrenadeRenderableState> postRenderer = compatibleAttachment.getAttachment().getGrenadePostRenderer();
        if (postRenderer != null)
            postRenderer.render(renderContext);

        for (CompatibleAttachment<?> childAttachment : itemAttachment.getAttachments()) {
            renderCompatibleAttachment(childAttachment, positioner, renderContext);
        }

        GL11.glPopAttrib();
        GL11.glPopMatrix();

    }

    public String getTextureName() {
        return builder.getTextureName();
    }

    public ModelBase getModel() {
        return builder.getModel();
    }

    public Supplier<Float> getXRotationCenterOffset() {
        return builder.xCenterOffset;
    }

    public Supplier<Float> getYRotationCenterOffset() {
        return builder.yCenterOffset;
    }

    public Supplier<Float> getZRotationCenterOffset() {
        return builder.zCenterOffset;
    }

    public Runnable getThrownEntityPositioning() {
        return builder.thrownEntityPositioning;
    }

    @SideOnly(Side.CLIENT)
    public void renderItem() {
        GL11.glPushMatrix();

        RenderContext<GrenadeRenderableState> renderContext = new RenderContext<>(owner, itemStack);

        //float limbSwing, float flimbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale
        //0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);
        renderContext.setAgeInTicks(-0.4f);
        renderContext.setScale(0.08f);
        renderContext.setCompatibleTransformType(transformType);

        Positioner<Part, RenderContext<GrenadeRenderableState>> positioner = null;
        switch (transformType) {
            case GROUND:
                GL11.glScaled(-1F, -1F, 1F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(-0.7f, -1f, -0.1f);
                GL11.glRotatef(0F, 1f, 0f, 0f);
                //GL11.glRotatef(150F, 0f, 1f, 0f);
                GL11.glRotatef(90F, 0f, 0f, 1f);
                builder.getEntityPositioning().accept(itemStack);
                break;

            case GUI:
                GL11.glScaled(-1F, -1F, 1F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.7f, -0.8f, -0.1f);
                GL11.glRotatef(-30F, 1f, 0f, 0f);
                GL11.glRotatef(40F, 0f, 1f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                builder.getInventoryPositioning().accept(itemStack);
                break;

            case THIRD_PERSON_RIGHT_HAND:
            case THIRD_PERSON_LEFT_HAND:
                GL11.glScaled(-1F, -1F, 1F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-1.5f, -2.4f, 1.3f);
                GL11.glRotatef(-100F, 1f, 0f, 0f);
                GL11.glRotatef(50F, 0f, 1f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                builder.getThirdPersonPositioning().accept(renderContext);
                break;

            case FIRST_PERSON_RIGHT_HAND:
            case FIRST_PERSON_LEFT_HAND:


                WeaponRenderer.fixVersionSpecificFirstPersonPositioning(transformType);

                GL11.glScaled(-1F, -1F, 1F);

                StateDescriptor stateDescriptor = getStateDescriptor(owner, itemStack);

                renderContext.setPlayerItemInstance(stateDescriptor.instance);

                MultipartPositioning<Part, RenderContext<GrenadeRenderableState>> multipartPositioning = stateDescriptor.stateManager.nextPositioning();

                renderContext.setTransitionProgress(multipartPositioning.getProgress());

                renderContext.setFromState(multipartPositioning.getFromState(GrenadeRenderableState.class));

                renderContext.setToState(multipartPositioning.getToState(GrenadeRenderableState.class));

                positioner = multipartPositioning.getPositioner();

                renderContext.capturePartPosition(Part.NONE);

                WeaponRenderer.renderLeftArm(owner, renderContext, positioner);

                // Randomization is supported for the right hand only only
                positioner.randomize(stateDescriptor.rate, stateDescriptor.amplitude);

                WeaponRenderer.renderRightArm(owner, renderContext, positioner);

                positioner.position(Part.MAIN_ITEM, renderContext);

                if (DebugPositioner.isDebugModeEnabled()) {
                    DebugPositioner.position(Part.MAIN_ITEM, renderContext);
                }

                renderContext.capturePartPosition(Part.MAIN_ITEM);

                break;
            default:
        }

        renderItem(itemStack, renderContext, positioner);

        GL11.glPopMatrix();
    }

    protected boolean onGround() {
        return transformType == null;
    }
}
