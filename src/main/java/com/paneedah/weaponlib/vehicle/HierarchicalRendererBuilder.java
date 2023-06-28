package com.paneedah.weaponlib.vehicle;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.animation.MultipartRenderStateManager;
import com.paneedah.weaponlib.animation.MultipartTransition;
import com.paneedah.weaponlib.animation.MultipartTransitionProvider;
import com.paneedah.weaponlib.vehicle.HierarchicalPartRenderer.SinglePart;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class HierarchicalRendererBuilder<Part, State extends RenderState> {

    protected static final int DEFAULT_DURATION = 100;
    protected static final int DEFAULT_ANIMATION_DURATION = 350;

    protected class TransitionDescriptor {
        protected Consumer<PartRenderContext<State>> positionFunction;
        protected long duration;

        protected TransitionDescriptor(Consumer<PartRenderContext<State>> positionFunction, long duration) {
            this.positionFunction = positionFunction;
            this.duration = duration;
        }

    }

    protected class PartConfiguration {
        protected StatefulRenderer<State> modelRenderer = c -> {};
        protected State initialState;
        protected Supplier<Long> currentTimeProvider = System::currentTimeMillis;
        protected Function<PartRenderContext<State>, Float> currentProgressProvider; // = c -> 0f;
        protected BiConsumer<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>, PartRenderContext<State>> stateSetter =
                (stateManager, renderContext) -> {
                    State state = renderContext.getState();
                    if(state.isContinous()) {
                        stateManager.setContinousState(state, true, false, false);
                    } else {
                        stateManager.setState(state, true, false, true);
                    }
                };

                //protected Map<State, List<MultipartTransition<SinglePart, PartRenderContext<State>>>> transitions = new HashMap<>();
                protected Map<State, List<TransitionDescriptor>> transitionDescriptors = new HashMap<>();

                protected String textureName = "unknown";        
    }

    protected Map<Part, PartConfiguration> partConfigurations = new HashMap<>();
    protected State initialState;
    protected long animationDuration = DEFAULT_ANIMATION_DURATION;

    public HierarchicalRendererBuilder<Part, State> withPartTexture(Part part, String textureName) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        partConfiguration.textureName = textureName.toLowerCase();
        return this;
    }

    public HierarchicalRendererBuilder<Part, State> withPartModel(Part part, ModelBase model) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        partConfiguration.modelRenderer = new StatefulRenderer<State>() {
            @Override
            public void render(PartRenderContext<State> context) {
                model.render(context.getEntity(), context.getLimbSwing(), context.getFlimbSwingAmount(), context.getAgeInTicks(), 
                        context.getNetHeadYaw(), context.getHeadPitch(), context.getScale());
            }};
            return this;
    }

    public HierarchicalRendererBuilder<Part, State> withPartModelProvider(Part part, Supplier<ModelBase> modelProvider) {
        ModelBase model = modelProvider.get();
        withPartModel(part, model);
        return this;
    }

    public HierarchicalRendererBuilder<Part, State> withPartTexturedModel(Part part, Supplier<ModelBase> modelProvider, String textureName) {
        ModelBase model = modelProvider.get();
        withPartModel(part, model);
        withPartTexture(part, textureName);
        return this;
    }


    public HierarchicalRendererBuilder<Part, State> withPartRenderer(Part part, StatefulRenderer<State> modelRenderer) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        partConfiguration.modelRenderer = modelRenderer;
        return this;
    }

    public HierarchicalRendererBuilder<Part, State> withInitialState(State initialState) {
        this.initialState = initialState;
        return this;
    }

    public HierarchicalRendererBuilder<Part, State> withPartProgressProvider(Part part, Function<PartRenderContext<State>, Float> currentProgressProvider) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        partConfiguration.currentProgressProvider = currentProgressProvider;
        return this;
    }


    public HierarchicalRendererBuilder<Part, State> withContinousStateSetter(State initialState) {
        this.initialState = initialState;
        return this;
    } 

    public HierarchicalRendererBuilder<Part, State> withPartStateSetter(Part part, BiConsumer<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>, PartRenderContext<State>> stateSetter) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        partConfiguration.stateSetter = stateSetter;
        return this;
    } 

    public HierarchicalRendererBuilder<Part, State> withInitialState(Part part, State initialState) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        partConfiguration.initialState = initialState;
        return this;
    }

    public HierarchicalRendererBuilder<Part, State> withAnimationDuration(long animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public HierarchicalRendererBuilder<Part, State> withPartPosition(Part part, State state, Consumer<PartRenderContext<State>> positionFunction) {
        return withPartPosition(part, state, positionFunction, DEFAULT_DURATION);
    }

    public HierarchicalRendererBuilder<Part, State> withPartPosition(Part part, State state, Consumer<PartRenderContext<State>> positionFunction, long duration) {
        PartConfiguration partConfiguration = partConfigurations.computeIfAbsent(part, p -> new PartConfiguration());
        List<HierarchicalRendererBuilder<Part, State>.TransitionDescriptor> partStateDescriptors = partConfiguration.transitionDescriptors.computeIfAbsent(state, s -> new ArrayList<>());
        partStateDescriptors.add(new TransitionDescriptor(positionFunction, duration));
        
        //        List<MultipartTransition<SinglePart, PartRenderContext<State>>> singleStateTransitions = partConfiguration.transitions.computeIfAbsent(state, s -> new ArrayList<>());
        //        MultipartTransition<SinglePart, PartRenderContext<State>> mt = new MultipartTransition<>(duration);
        //        mt.withPartPositionFunction(SinglePart.MAIN, positionFunction);
        //        singleStateTransitions.add(mt);
        return this;
    }
    
    

    public HierarchicalRendererBuilder<Part, State> withPartPosition( Part part, 
            Consumer<PartRenderContext<State>> positionFunction, 
            @SuppressWarnings("unchecked") State...states)  {
    	
        for(State state: states) {
            withPartPosition(part, state, positionFunction, DEFAULT_DURATION);
        }
        return this;
    }

    protected void prebuild() {}

    
    public StatefulRenderer<State> build(ModContext modContext, Part mainPart) {

        prebuild();
        
        Map<Part, HierarchicalPartRenderer<Part, State>> partRenderers = new HashMap<>();

        partConfigurations.forEach((part, partConfiguration) -> {

            Map<State, List<MultipartTransition<SinglePart, PartRenderContext<State>>>> transitions = new HashMap<>();

            partConfiguration.transitionDescriptors.forEach((state, partStateDescriptors) -> {
                List<MultipartTransition<SinglePart, PartRenderContext<State>>> singleStateTransitions = new ArrayList<>();
                for(HierarchicalRendererBuilder<Part, State>.TransitionDescriptor descriptor: partStateDescriptors) {
                    MultipartTransition<SinglePart, PartRenderContext<State>> mt = new MultipartTransition<>(descriptor.duration);
                    mt.withPartPositionFunction(SinglePart.MAIN, descriptor.positionFunction);
                    singleStateTransitions.add(mt);                    
                }
                transitions.put(state, singleStateTransitions);
            });

            MultipartTransitionProvider<State, SinglePart, PartRenderContext<State>> transitionProvider = new MultipartTransitionProvider<State, SinglePart, PartRenderContext<State>>() {

                @Override
                public List<MultipartTransition<SinglePart, PartRenderContext<State>>> getTransitions(State state) {
                    return transitions.get(state);
                }
            };
            
            

            ResourceLocation textureResource = new ResourceLocation(ModReference.ID,
                    "textures/entity/" + partConfiguration.textureName + ( partConfiguration.textureName.endsWith(".png") ? "" : ".png"));

            Supplier<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>> stateManagerSupplier = 
                    () -> new MultipartRenderStateManager<>(
                            part.toString(),
                            partConfiguration.initialState != null ? partConfiguration.initialState : initialState, 
                                    transitionProvider, 
                                    partConfiguration.currentTimeProvider, 
                                    partConfiguration.currentProgressProvider);

                    HierarchicalPartRenderer<Part, State> renderer = new HierarchicalPartRenderer<>(part, 
                            partConfiguration.modelRenderer, 
                            textureResource, partRenderers, 
                            stateManagerSupplier, 
                            partConfiguration.stateSetter,
                            partConfiguration.currentProgressProvider);
                    partRenderers.put(part, renderer);
        });

        return partRenderers.get(mainPart);
    }
}
