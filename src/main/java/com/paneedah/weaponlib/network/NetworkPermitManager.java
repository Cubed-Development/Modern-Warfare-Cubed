package com.paneedah.weaponlib.network;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.PlayerContext;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.PermitManager;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class NetworkPermitManager implements PermitManager, IMessageHandler<PermitMessage, IMessage> {

	private ModContext modContext;
	private Map<UUID, Object /*BiConsumer<Permit<?>, ?>*/> permitCallbacks = new HashMap<>();
	private Map<Class<?>, BiConsumer<Permit<?>, ?>> evaluators = new HashMap<>();

	public NetworkPermitManager() {
	}

	public NetworkPermitManager(ModContext modContext) {
		this.modContext = modContext;
	}
	
	@Override
	public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void request(P permit, E extendedState, BiConsumer<P, E> callback) {
		permitCallbacks.put(permit.getUuid(), callback);
		modContext.getChannel().sendToServer(new PermitMessage(permit, extendedState));
	}

	@Override
	public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void registerEvaluator(Class<? extends P> permitClass, Class<? extends E> esClass, BiConsumer<P, E> evaluator) {
		evaluators.put(permitClass,  (p, c) -> { 
			LOG.debug("Processing permit {} for instance {}", p, c);
			evaluator.accept(permitClass.cast(p), esClass.cast(c)); 
		});
	}
	
	@Override
	public IMessage onMessage(PermitMessage permitMessage, MessageContext messageContext) {
		if (messageContext.side == Side.SERVER)
			onServerMessage(permitMessage, messageContext);
		else if (messageContext.side == Side.CLIENT)
			onClientMessage(permitMessage, messageContext);

		return null;
	}

	public void onServerMessage(PermitMessage permitMessage, MessageContext messageContext) {
		Permit<?> permit = permitMessage.getPermit();
		Object extendedState = permitMessage.getContext();

		if(extendedState instanceof PlayerContext) // TODO: think of something better than upcasting
			((PlayerContext) extendedState).setPlayer(messageContext.getServerHandler().player);
		//serverAction.accept(permit, context);
		@SuppressWarnings("unchecked")
		BiConsumer<Permit<?>, Object> evaluator = (BiConsumer<Permit<?>, Object>) evaluators.get(permit.getClass());
		if(evaluator != null)
			evaluator.accept(permit, extendedState);
		PermitMessage message = new PermitMessage(permit, extendedState);
		modContext.getChannel().sendTo(message, messageContext.getServerHandler().player);
	}

	@SideOnly(Side.CLIENT)
	public void onClientMessage(PermitMessage permitMessage, MessageContext messageContext) {
		Permit<?> permit = permitMessage.getPermit();
		Object extendedState = permitMessage.getContext();

		mc.addScheduledTask(() -> {
			if(extendedState instanceof PlayerContext)
				((PlayerContext) extendedState).setPlayer(mc.player);
			@SuppressWarnings("unchecked")
			BiConsumer<Permit<?>, Object> callback = (BiConsumer<Permit<?>, Object>) permitCallbacks.remove(permit.getUuid());
			if(callback != null)
				callback.accept(permit, extendedState);
		});
	}
}
