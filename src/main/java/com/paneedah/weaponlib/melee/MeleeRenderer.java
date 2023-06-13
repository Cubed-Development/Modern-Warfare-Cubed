package com.paneedah.weaponlib.melee;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.*;
import com.paneedah.weaponlib.animation.DebugPositioner.TransitionConfiguration;
import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
import com.paneedah.weaponlib.compatibility.ModelSourceRenderer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

import javax.vecmath.Matrix4f;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class MeleeRenderer extends ModelSourceRenderer implements IBakedModel {

	private static final float DEFAULT_RANDOMIZING_RATE = 0.33f;

	private static final float DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE = 0.06f;

	private static final int DEFAULT_ANIMATION_DURATION = 70;

	protected static class StateDescriptor {
		protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
		protected float rate;
		protected float amplitude = 0.04f;
		private PlayerMeleeInstance instance;
		public StateDescriptor(PlayerMeleeInstance instance, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager,
							   float rate, float amplitude) {
			this.instance = instance;
			this.stateManager = stateManager;
			this.rate = rate;
			this.amplitude = amplitude;
		}
	}

	protected ItemStack itemStack;

	protected ModelResourceLocation resourceLocation;

	private class WeaponItemOverrideList extends ItemOverrideList {

		public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
			super(overridesIn);
		}

		@Override
		public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world,
										   EntityLivingBase entity) {
			MeleeRenderer.this.itemStack = stack;
			MeleeRenderer.this.player = (EntityPlayer) entity;
			return super.handleItemState(originalModel, stack, world, entity);
		}
	}

	private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());

	ItemCameraTransforms.TransformType transformType;

	protected EntityPlayer player;

	protected TextureManager textureManager;

	private Pair<? extends IBakedModel, Matrix4f> pair;

	public static class Builder {

		private ModelBase model;
		private String textureName;

		private BiConsumer<Part, RenderContext<RenderableState>> partDebugPositioning;

		private Consumer<ItemStack> entityPositioning;
		private Consumer<ItemStack> inventoryPositioning;
		private Consumer<RenderContext<RenderableState>> thirdPersonPositioning;

		private Consumer<RenderContext<RenderableState>> firstPersonPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying;

		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRunning;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningModifying;

		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRunning;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningModifying;

		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningAttacking;
		private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningAttacking;
		private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningAttacking;

		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningHeavyAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningHeavyAttacking;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningHeavyAttacking;

		private long totalAttackingDuration;

		private long totalHeavyAttackingDuration;


		private float normalRandomizingRate = DEFAULT_RANDOMIZING_RATE; // movements per second, e.g. 0.25 = 0.25 movements per second = 1 movement in 3 minutes

		private float normalRandomizingAmplitude = DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE;

		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioning = new LinkedHashMap<>();
		//private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningUnloading = new LinkedHashMap<>();
		private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningAttacking = new LinkedHashMap<>();
	    private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningHeavyAttacking = new LinkedHashMap<>();


//		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningRecoiled = new LinkedHashMap<>();
//		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZoomingRecoiled = new LinkedHashMap<>();
//		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZoomingShooting = new LinkedHashMap<>();

		private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningEjectSpentRound = new LinkedHashMap<>();
		private boolean hasRecoilPositioningDefined;
        public int animationDuration = DEFAULT_ANIMATION_DURATION;

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

		public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
			this.inventoryPositioning = inventoryPositioning;
			return this;
		}

		public Builder withPartDebugPositioning(BiConsumer<Part, RenderContext<RenderableState>> partDebugPositioning) {
            this.partDebugPositioning = partDebugPositioning;
            return this;
        }

		public Builder withThirdPersonPositioning(Consumer<RenderContext<RenderableState>> thirdPersonPositioning) {
			this.thirdPersonPositioning = thirdPersonPositioning;
			return this;
		}

		public Builder withFirstPersonPositioning(Consumer<RenderContext<RenderableState>> firstPersonPositioning) {
			this.firstPersonPositioning = firstPersonPositioning;
			return this;
		}

		public Builder withFirstPersonPositioningRunning(Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning) {
			this.firstPersonPositioningRunning = firstPersonPositioningRunning;
			return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonPositioningAttacking(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonPositioningAttacking = Arrays.asList(transitions);
			return this;
		}

		@SafeVarargs
        public final Builder withFirstPersonPositioningHeavyAttacking(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonPositioningHeavyAttacking = Arrays.asList(transitions);
            return this;
        }

		public Builder withFirstPersonPositioningModifying(Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying) {
			this.firstPersonPositioningModifying = firstPersonPositioningModifying;
			return this;
		}


		public Builder withFirstPersonHandPositioning(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioning = leftHand;
			this.firstPersonRightHandPositioning = rightHand;
			return this;
		}

		public Builder withFirstPersonHandPositioningRunning(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioningRunning = leftHand;
			this.firstPersonRightHandPositioningRunning = rightHand;
			return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonLeftHandPositioningAttacking(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonLeftHandPositioningAttacking = Arrays.asList(transitions);
			return this;
		}

		@SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningHeavyAttacking(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonLeftHandPositioningHeavyAttacking = Arrays.asList(transitions);
            return this;
        }

		@SafeVarargs
        public final Builder withFirstPersonRightHandPositioningHeavyAttacking(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonRightHandPositioningHeavyAttacking = Arrays.asList(transitions);
            return this;
        }

		@SafeVarargs
		public final Builder withFirstPersonRightHandPositioningAttacking(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonRightHandPositioningAttacking = Arrays.asList(transitions);
			return this;
		}

		public Builder withFirstPersonHandPositioningModifying(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioningModifying = leftHand;
			this.firstPersonRightHandPositioningModifying = rightHand;
			return this;
		}

		public Builder withFirstPersonCustomPositioning(Part part, Consumer<RenderContext<RenderableState>> positioning) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			if(this.firstPersonCustomPositioning.put(part, positioning) != null) {
				throw new IllegalArgumentException("Part " + part + " already added");
			}
			return this;
		}

//		public Builder withFirstPersonPositioningCustomZoomingRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
//			if(part instanceof DefaultPart) {
//				throw new IllegalArgumentException("Part " + part + " is not custom");
//			}
//			if(this.firstPersonCustomPositioningZoomingRecoiled.put(part, positioning) != null) {
//				throw new IllegalArgumentException("Part " + part + " already added");
//			}
//			return this;
//		}

		@SafeVarargs
		public final Builder withFirstPersonCustomPositioningAttacking(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}

			this.firstPersonCustomPositioningAttacking.put(part, Arrays.asList(transitions));
			return this;
		}

		@SafeVarargs
        public final Builder withFirstPersonCustomPositioningHeavyAttacking(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningHeavyAttacking.put(part, Arrays.asList(transitions));
            return this;
        }

//		@SafeVarargs
//		public final Builder withFirstPersonCustomPositioningUnloading(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
//			if(part instanceof DefaultPart) {
//				throw new IllegalArgumentException("Part " + part + " is not custom");
//			}
//			this.firstPersonCustomPositioningUnloading.put(part, Arrays.asList(transitions));
//			return this;
//		}

		@SafeVarargs
		public final Builder withFirstPersonCustomPositioningEjectSpentRound(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}

			this.firstPersonCustomPositioningEjectSpentRound.put(part, Arrays.asList(transitions));
			return this;
		}

		public MeleeRenderer build() {
			if(FMLCommonHandler.instance().getSide() == Side.SERVER) {
				return null;
			}

			if(inventoryPositioning == null) {
				inventoryPositioning = itemStack -> {GL11.glTranslatef(0,  0.12f, 0);};
			}

			if(entityPositioning == null) {
				entityPositioning = itemStack -> {
				};
			}

			MeleeRenderer renderer = new MeleeRenderer(this);

			if(firstPersonPositioning == null) {
				firstPersonPositioning = (renderContext) -> {};
			}

			if(firstPersonPositioningAttacking == null) {
				firstPersonPositioningAttacking = Collections.singletonList(new Transition<>(firstPersonPositioning, animationDuration));
			}

			if(firstPersonPositioningHeavyAttacking == null) {
                firstPersonPositioningHeavyAttacking = Collections.singletonList(new Transition<>(firstPersonPositioning, animationDuration));
            }

			for(Transition<RenderContext<RenderableState>> t: firstPersonPositioningAttacking) {
				totalAttackingDuration += t.getDuration();
				totalAttackingDuration += t.getPause();
			}

			for(Transition<RenderContext<RenderableState>> t: firstPersonPositioningHeavyAttacking) {
                totalHeavyAttackingDuration += t.getDuration();
                totalHeavyAttackingDuration += t.getPause();
            }

			if(firstPersonPositioningRunning == null) {
				firstPersonPositioningRunning = firstPersonPositioning;
			}

			if(firstPersonPositioningModifying == null) {
				firstPersonPositioningModifying = firstPersonPositioning;
			}

			if(thirdPersonPositioning == null) {
				thirdPersonPositioning = (context) -> {
					GL11.glTranslatef(-0.4F, 0.2F, 0.4F);
					GL11.glRotatef(-45F, 0f, 1f, 0f);
					GL11.glRotatef(70F, 1f, 0f, 0f);
				};
			}

			// Left hand positioning

			if(firstPersonLeftHandPositioning == null) {
				firstPersonLeftHandPositioning = (context) -> {};
			}

			if(firstPersonLeftHandPositioningAttacking == null) {
				firstPersonLeftHandPositioningAttacking = firstPersonPositioningAttacking.stream().map(t -> new Transition<RenderContext<RenderableState>>(
				        c -> {}, 0)).collect(Collectors.toList());
			}

			if(firstPersonLeftHandPositioningHeavyAttacking == null) {
                firstPersonLeftHandPositioningHeavyAttacking = firstPersonPositioningHeavyAttacking.stream().map(t -> new Transition<RenderContext<RenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

			if(firstPersonRightHandPositioningHeavyAttacking == null) {
                firstPersonRightHandPositioningHeavyAttacking = firstPersonPositioningHeavyAttacking.stream().map(t -> new Transition<RenderContext<RenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

			if(firstPersonLeftHandPositioningRunning == null) {
				firstPersonLeftHandPositioningRunning = firstPersonLeftHandPositioning;
			}

			if(firstPersonLeftHandPositioningModifying == null) {
				firstPersonLeftHandPositioningModifying = firstPersonLeftHandPositioning;
			}

			// Right hand positioning

			if(firstPersonRightHandPositioning == null) {
				firstPersonRightHandPositioning = (context) -> {};
			}

			if(firstPersonRightHandPositioningAttacking == null) {
				//firstPersonRightHandPositioningAttacking = Collections.singletonList(new Transition(firstPersonRightHandPositioning, DEFAULT_ANIMATION_DURATION));
				firstPersonRightHandPositioningAttacking = firstPersonPositioningAttacking.stream().map(t -> new Transition<RenderContext<RenderableState>>(
				        c-> {}, 0)).collect(Collectors.toList());
			}

			if(firstPersonRightHandPositioningHeavyAttacking == null) {
                //firstPersonRightHandPositioningAttacking = Collections.singletonList(new Transition(firstPersonRightHandPositioning, DEFAULT_ANIMATION_DURATION));
                firstPersonRightHandPositioningHeavyAttacking = firstPersonPositioningHeavyAttacking.stream().map(t -> new Transition<RenderContext<RenderableState>>(
                        c -> {}, 0)).collect(Collectors.toList());
            }

			if(firstPersonRightHandPositioningRunning == null) {
				firstPersonRightHandPositioningRunning = firstPersonRightHandPositioning;
			}

			if(firstPersonRightHandPositioningModifying == null) {
				firstPersonRightHandPositioningModifying = firstPersonRightHandPositioning;
			}

//			/*
//			 * If custom positioning for recoil is not set, default it to normal custom positioning
//			 */
//			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningRecoiled.isEmpty()) {
//				firstPersonCustomPositioning.forEach((part, pos) -> {
//					firstPersonCustomPositioningRecoiled.put(part, pos);
//				});
//			}
//
//			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningZoomingRecoiled.isEmpty()) {
//				firstPersonCustomPositioning.forEach((part, pos) -> {
//					firstPersonCustomPositioningZoomingRecoiled.put(part, pos);
//				});
//			}
//
//			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningZoomingShooting.isEmpty()) {
//				firstPersonCustomPositioning.forEach((part, pos) -> {
//					firstPersonCustomPositioningZoomingShooting.put(part, pos);
//				});
//			}

			firstPersonCustomPositioningAttacking.forEach((p, t) -> {
				if(t.size() != firstPersonPositioningAttacking.size()) {
					throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningAttacking.size()
					+ ", actual: " + t.size());
				}
			});

			firstPersonCustomPositioningHeavyAttacking.forEach((p, t) -> {
                if(t.size() != firstPersonPositioningHeavyAttacking.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningAttacking.size()
                    + ", actual: " + t.size());
                }
            });

			return renderer;
		}

		public Consumer<ItemStack> getEntityPositioning() {
			return entityPositioning;
		}

		public Consumer<ItemStack> getInventoryPositioning() {
			return inventoryPositioning;
		}

		public Consumer<RenderContext<RenderableState>> getThirdPersonPositioning() {
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

	private Map<EntityPlayer, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> firstPersonStateManagers;

	private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> weaponTransitionProvider;

	protected ClientModContext clientModContext;

	private MeleeRenderer(Builder builder) {
		this.builder = builder;
		this.firstPersonStateManagers = new HashMap<>();
		this.weaponTransitionProvider = new WeaponPositionProvider();
		this.textureManager = mc.getTextureManager();
		this.pair = Pair.of((IBakedModel) this, null);
	}

	protected long getTotalAttackDuration() {
		return builder.totalAttackingDuration;
	}

	protected long getTotalHeavyAttackDuration() {
        return builder.totalHeavyAttackingDuration;
    }

	protected ClientModContext getClientModContext() {
		return clientModContext;
	}

	public void setClientModContext(ClientModContext clientModContext) {
		this.clientModContext = clientModContext;
	}

	protected StateDescriptor getStateDescriptor(EntityPlayer player, ItemStack itemStack) {
		float amplitude = builder.normalRandomizingAmplitude;
		float rate = builder.normalRandomizingRate;
		RenderableState currentState = null;

		PlayerItemInstance<?> playerItemInstance = clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
				//.getMainHandItemInstance(player, PlayerWeaponInstance.class); // TODO: cannot be always main hand, need to which hand from context

		PlayerMeleeInstance playerMeleeInstance = null;
		if(playerItemInstance == null || !(playerItemInstance instanceof PlayerMeleeInstance)
		        || playerItemInstance.getItem() != itemStack.getItem()) {
		    LOG.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, itemStack);
		} else {
		    playerMeleeInstance = (PlayerMeleeInstance) playerItemInstance;
		}

		if(playerMeleeInstance != null) {
			AsyncMeleeState asyncWeaponState = getNextNonExpiredState(playerMeleeInstance);

			switch(asyncWeaponState.getState()) {

			case ATTACKING: case ATTACKING_STABBING:
			    currentState = RenderableState.ATTACKING;
			    break;

			case HEAVY_ATTACKING: case HEAVY_ATTACKING_STABBING:
                currentState = RenderableState.HEAVY_ATTACKING;
                break;

			case MODIFYING: case MODIFYING_REQUESTED: case NEXT_ATTACHMENT: case NEXT_ATTACHMENT_REQUESTED:
				currentState = RenderableState.MODIFYING;
				break;

			default:
				if(player.isSprinting() && builder.firstPersonPositioningRunning != null) {
					currentState = RenderableState.RUNNING;
				}
			}

			LOG.trace("Rendering state {} created from {}", currentState, asyncWeaponState.getState());
		}

		if(currentState == null) {
			currentState = RenderableState.NORMAL;
		}

		MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager = firstPersonStateManagers.get(player);
		if(stateManager == null) {
			stateManager = new MultipartRenderStateManager<>(currentState, weaponTransitionProvider);
			firstPersonStateManagers.put(player, stateManager);
		} else {
			stateManager.setState(currentState, true, currentState == RenderableState.ATTACKING);
		}


		return new StateDescriptor(playerMeleeInstance, stateManager, rate, amplitude);
	}

	private AsyncMeleeState getNextNonExpiredState(PlayerMeleeInstance playerWeaponState) {
	    AsyncMeleeState asyncWeaponState = null;
		while((asyncWeaponState = playerWeaponState.nextHistoryState()) != null) {
			if(System.currentTimeMillis() > asyncWeaponState.getTimestamp() + asyncWeaponState.getDuration()) {
			    continue;
			} else {
			    break;
			}
		}

		return asyncWeaponState;
	}

	private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Transition<RenderContext<RenderableState>> t) {
		if(t == null) {
			return context -> {};
		}
		Consumer<RenderContext<RenderableState>> weaponPositionFunction = t.getItemPositioning();
		if(weaponPositionFunction != null) {
			return context -> weaponPositionFunction.accept(context);
		}

		return context -> {};

	}

	private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Consumer<RenderContext<RenderableState>> weaponPositionFunction) {
		if(weaponPositionFunction != null) {
			return context -> weaponPositionFunction.accept(context);
		}
		return context -> {};

	}

	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getComplexTransition(
			List<Transition<RenderContext<RenderableState>>> wt,
			List<Transition<RenderContext<RenderableState>>> lht,
			List<Transition<RenderContext<RenderableState>>> rht,
			LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom)
	{
		List<MultipartTransition<Part, RenderContext<RenderableState>>> result = new ArrayList<>();
		for(int i = 0; i < wt.size(); i++) {
			Transition<RenderContext<RenderableState>> p = wt.get(i);
			Transition<RenderContext<RenderableState>> l = lht.get(i);
			Transition<RenderContext<RenderableState>> r = rht.get(i);

			long pause = p.getPause();
			if(DebugPositioner.isDebugModeEnabled()) {
			    TransitionConfiguration transitionConfiguration = DebugPositioner.getTransitionConfiguration(i, false);
			    if(transitionConfiguration != null) {
			        pause = transitionConfiguration.getPause();
			    }
			}
			MultipartTransition<Part, RenderContext<RenderableState>> t = new MultipartTransition<Part, RenderContext<RenderableState>>(
			        p.getDuration(), pause)
					.withPartPositionFunction(Part.MAIN_ITEM, createWeaponPartPositionFunction(p))
					.withPartPositionFunction(Part.LEFT_HAND, createWeaponPartPositionFunction(l))
					.withPartPositionFunction(Part.RIGHT_HAND, createWeaponPartPositionFunction(r));

			for(Entry<Part, List<Transition<RenderContext<RenderableState>>>> e: custom.entrySet()){
				List<Transition<RenderContext<RenderableState>>> partTransitions = e.getValue();
				Transition<RenderContext<RenderableState>> partTransition = null;
				if(partTransitions != null && partTransitions.size() > i) {
					partTransition = partTransitions.get(i);
				} else {
					LOG.warn("Transition not defined for part {}", custom);
				}
				t.withPartPositionFunction(e.getKey(), createWeaponPartPositionFunction(partTransition));
			}

			result.add(t);
		}
		return result;
	}

	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getSimpleTransition(
			Consumer<RenderContext<RenderableState>> w,
			Consumer<RenderContext<RenderableState>> lh,
			Consumer<RenderContext<RenderableState>> rh,
			//Consumer<RenderContext<RenderableState>> m,
			LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> custom,
			int duration) {
		MultipartTransition<Part, RenderContext<RenderableState>> mt = new MultipartTransition<Part, RenderContext<RenderableState>>(duration, 0)
				.withPartPositionFunction(Part.MAIN_ITEM, createWeaponPartPositionFunction(w))
				.withPartPositionFunction(Part.LEFT_HAND, createWeaponPartPositionFunction(lh))
				.withPartPositionFunction(Part.RIGHT_HAND, createWeaponPartPositionFunction(rh));
		custom.forEach((part, position) -> {
			mt.withPartPositionFunction(part, createWeaponPartPositionFunction(position));
		});
		return Collections.singletonList(mt);
	}

	private class WeaponPositionProvider implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {

		@Override
		public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
			switch(state) {
			case MODIFYING:
				return getSimpleTransition(builder.firstPersonPositioningModifying,
						builder.firstPersonLeftHandPositioningModifying,
						builder.firstPersonRightHandPositioningModifying,
						builder.firstPersonCustomPositioning,
						builder.animationDuration);
			case RUNNING:
				return getSimpleTransition(builder.firstPersonPositioningRunning,
						builder.firstPersonLeftHandPositioningRunning,
						builder.firstPersonRightHandPositioningRunning,
						builder.firstPersonCustomPositioning,
						builder.animationDuration);
			case ATTACKING:
				return getComplexTransition(builder.firstPersonPositioningAttacking,
						builder.firstPersonLeftHandPositioningAttacking,
						builder.firstPersonRightHandPositioningAttacking,
						builder.firstPersonCustomPositioningAttacking
						);
			case HEAVY_ATTACKING:
                return getComplexTransition(builder.firstPersonPositioningHeavyAttacking,
                        builder.firstPersonLeftHandPositioningHeavyAttacking,
                        builder.firstPersonRightHandPositioningHeavyAttacking,
                        builder.firstPersonCustomPositioningHeavyAttacking
                        );
			case NORMAL:
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

	public void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext,
			Positioner<Part, RenderContext<RenderableState>> positioner) {
		List<CompatibleAttachment<? extends AttachmentContainer>> attachments = null;
		if(builder.getModel() instanceof ModelWithAttachments) {
			attachments = ((ItemMelee) weaponItemStack.getItem()).getActiveAttachments(renderContext.getPlayer(), weaponItemStack);
		}

		if(builder.getTextureName() != null) {
			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID + ":textures/models/" + builder.getTextureName()));
		} else {
			String textureName = null;
			CompatibleAttachment<?> compatibleSkin = attachments.stream()
					.filter(ca -> ca.getAttachment() instanceof MeleeSkin).findAny().orElse(null);
			if(compatibleSkin != null) {
				PlayerItemInstance<?> itemInstance = getClientModContext().getPlayerItemInstanceRegistry()
						.getItemInstance(renderContext.getPlayer(), weaponItemStack);
				if(itemInstance instanceof PlayerMeleeInstance) {
					int textureIndex = ((PlayerMeleeInstance) itemInstance).getActiveTextureIndex();
					if(textureIndex >= 0) {
						textureName = ((MeleeSkin) compatibleSkin.getAttachment()).getTextureVariant(textureIndex)
								+ ".png";
					}
				}
			}

			if(textureName == null) {
				ItemMelee weapon = ((ItemMelee) weaponItemStack.getItem());
				textureName = weapon.getTextureName();
			}

			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID
					+ ":textures/models/" + textureName));
		}

		//limbSwing, float flimbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale
		builder.getModel().render(null,
				renderContext.getLimbSwing(),
				renderContext.getFlimbSwingAmount(),
				renderContext.getAgeInTicks(),
				renderContext.getNetHeadYaw(),
				renderContext.getHeadPitch(),
				renderContext.getScale());

		if(attachments != null) {
			renderAttachments(positioner, renderContext, attachments);
		}
	}

	public void renderAttachments(Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext,List<CompatibleAttachment<? extends AttachmentContainer>> attachments) {
		for(CompatibleAttachment<?> compatibleAttachment: attachments) {
			if(compatibleAttachment != null && !(compatibleAttachment.getAttachment() instanceof ItemSkin)) {
				renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void renderCompatibleAttachment(CompatibleAttachment<?> compatibleAttachment,
			Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext) {

		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

		if(compatibleAttachment.getPositioning() instanceof BiConsumer) {
            ((BiConsumer) compatibleAttachment.getPositioning()).accept(renderContext.getPlayer(), renderContext.getWeapon());
        } else if(compatibleAttachment.getPositioning() instanceof Consumer) {
            ((Consumer) compatibleAttachment.getPositioning()).accept(renderContext);
        }

		ItemAttachment<?> itemAttachment = compatibleAttachment.getAttachment();


		if(positioner != null) {
			if(itemAttachment instanceof Part) {
				positioner.position((Part) itemAttachment, renderContext);
			} else if(itemAttachment.getRenderablePart() != null) {
				positioner.position(itemAttachment.getRenderablePart(), renderContext);
			}
		}

		for(Tuple<ModelBase, String> texturedModel: compatibleAttachment.getAttachment().getTexturedModels()) {
			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID
					+ ":textures/models/" + texturedModel.getV()));
			GL11.glPushMatrix();
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
			if(compatibleAttachment.getModelPositioning() != null) {
				compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
			}
			texturedModel.getU().render(renderContext.getPlayer(),
					renderContext.getLimbSwing(),
					renderContext.getFlimbSwingAmount(),
					renderContext.getAgeInTicks(),
					renderContext.getNetHeadYaw(),
					renderContext.getHeadPitch(),
					renderContext.getScale());

			GL11.glPopAttrib();
			GL11.glPopMatrix();
		}

		@SuppressWarnings("unchecked")
        CustomRenderer<RenderableState> postRenderer = (CustomRenderer<RenderableState>) compatibleAttachment.getAttachment().getPostRenderer();
		if(postRenderer != null) {
			GL11.glPushMatrix();
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
			postRenderer.render(renderContext);
			GL11.glPopAttrib();
			GL11.glPopMatrix();
		}

		for(CompatibleAttachment<?> childAttachment: itemAttachment.getAttachments()) {
			renderCompatibleAttachment(childAttachment, positioner, renderContext);
		}

		GL11.glPopAttrib();
		GL11.glPopMatrix();
	}

	public boolean hasRecoilPositioning() {
		return builder.hasRecoilPositioningDefined;
	}

	protected BiConsumer<Part, RenderContext<RenderableState>> getPartDebugPositioning() {
	    return builder.partDebugPositioning;
	}

	@Override
	public final boolean isAmbientOcclusion() {
		return true;
	}

	@Override
	public final boolean isGui3d() {
		return true;
	}

	@Override
	public final boolean isBuiltInRenderer() {
		return false;
	}

	@Override
	public TextureAtlasSprite getParticleTexture() {
		return mc.getTextureMapBlocks().getMissingSprite();
	}

	@Override
	public ItemCameraTransforms getItemCameraTransforms() {
		return ItemCameraTransforms.DEFAULT;
	}

	@Override
	public ItemOverrideList getOverrides() {

		return itemOverrideList;
	}

	@Override
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
		this.transformType = cameraTransformType;
		return pair;
	}

	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		// Todo: Actually make rendering compatible with Emissive Renderer
		if (net.minecraftforge.common.ForgeModContainer.allowEmissiveItems) {
			return Collections.emptyList();
		}

		if(itemStack == null) return Collections.emptyList();
		if(transformType == ItemCameraTransforms.TransformType.GROUND
				|| transformType == ItemCameraTransforms.TransformType.GUI
				|| transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND
				|| transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND
		) {

			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder worldrenderer = tessellator.getBuffer();
			tessellator.draw();
			GlStateManager.pushMatrix();

			if (player != null) {
				if (transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {
					if (player.isSneaking()) GlStateManager.translate(0.0F, -0.2F, 0.0F);
				}
			}

			if (onGround()) {
				GlStateManager.scale(-3f, -3f, -3f);
			}

			int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
			renderItem();
			if(currentTextureId != 0) {
				GlStateManager.bindTexture(currentTextureId);
			}
			GlStateManager.popMatrix();
			worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.ITEM);
		}

		// Reset the dynamic values.
		this.player = null;
		this.itemStack = null;
		this.transformType = null;

		return Collections.emptyList();
	}

	protected boolean onGround() {
		return transformType == null;
	}

	@SideOnly(Side.CLIENT)
	public void renderItem() {

		GL11.glPushMatrix();

		RenderContext<RenderableState> renderContext = new RenderContext<>(getClientModContext(), player, itemStack);

		//float limbSwing, float flimbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale
		//0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);
		renderContext.setAgeInTicks(-0.4f);
		renderContext.setScale(0.08f);
		renderContext.setCompatibleTransformType(transformType);

		Positioner<Part, RenderContext<RenderableState>> positioner = null;
		switch (transformType)
		{
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

			case THIRD_PERSON_RIGHT_HAND: case THIRD_PERSON_LEFT_HAND:
			GL11.glScaled(-1F, -1F, 1F);
			GL11.glScaled(0.4F, 0.4F, 0.4F);
			GL11.glTranslatef(-1.33f, -2f, 0.7f);
			GL11.glRotatef(-70F, 1f, 0f, 0f);
			GL11.glRotatef(50F, 0f, 1f, 0f);
			GL11.glRotatef(0F, 0f, 0f, 1f);
			builder.getThirdPersonPositioning().accept(renderContext);
			break;

			case FIRST_PERSON_RIGHT_HAND: case FIRST_PERSON_LEFT_HAND:

            WeaponRenderer.fixVersionSpecificFirstPersonPositioning(transformType);

			GL11.glScaled(-1F, -1F, 1F);

			StateDescriptor stateDescriptor = getStateDescriptor(player, itemStack);

			renderContext.setPlayerItemInstance(stateDescriptor.instance);

			MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = stateDescriptor.stateManager.nextPositioning();

			renderContext.setTransitionProgress(multipartPositioning.getProgress());

			renderContext.setFromState(multipartPositioning.getFromState(RenderableState.class));

			renderContext.setToState(multipartPositioning.getToState(RenderableState.class));

			positioner = multipartPositioning.getPositioner();

			WeaponRenderer.renderLeftArm(player, renderContext, positioner);

			WeaponRenderer.renderRightArm(player, renderContext, positioner);

			positioner.position(Part.MAIN_ITEM, renderContext);

			if(DebugPositioner.isDebugModeEnabled()) {
				DebugPositioner.position(Part.MAIN_ITEM, renderContext);
			}

			break;
			default:
		}

		renderItem(itemStack, renderContext, positioner);

		GL11.glPopMatrix();
	}
}
