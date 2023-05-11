package com.paneedah.weaponlib.network;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.PlayerContext;
import com.paneedah.weaponlib.compatibility.IMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.PermitManager;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class NetworkPermitManager
implements PermitManager, CompatibleMessageHandler<PermitMessage, IMessage>  {

	private ModContext modContext;
	private Map<UUID, Object /*BiConsumer<Permit<?>, ?>*/> permitCallbacks = new HashMap<>();
	private Map<Class<?>, BiConsumer<Permit<?>, ?>> evaluators = new HashMap<>();
	
	public NetworkPermitManager(ModContext modContext) {
		this.modContext = modContext;
	}
	
	@Override
	public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void request(
			P permit, E extendedState, BiConsumer<P, E> callback) {
		
		permitCallbacks.put(permit.getUuid(), callback);
		modContext.getChannel().getChannel().sendToServer(new PermitMessage(permit, extendedState));
	}

	@Override
	public <S extends ManagedState<S>, P extends Permit<S>, E extends ExtendedState<S>> void registerEvaluator(
			Class<? extends P> permitClass,
			Class<? extends E> esClass,
			BiConsumer<P, E> evaluator) {
		evaluators.put(permitClass,  (p, c) -> { 
			log.debug("Processing permit {} for instance {}", p, c);
			evaluator.accept(permitClass.cast(p), esClass.cast(c)); 
		});
	}
	
	@Override
	public <T extends IMessage> T onCompatibleMessage(PermitMessage permitMessage,
													  MessageContext messageContext) {
		
		Permit<?> permit = permitMessage.getPermit();
		Object extendedState = permitMessage.getContext();
		
		if(messageContext.side == Side.SERVER) {
			if(extendedState instanceof PlayerContext) { // TODO: think of something better than upcasting
				((PlayerContext) extendedState).setPlayer(messageContext.getServerHandler().player);
			}
			compatibility.runInMainClientThread(() -> {
				//serverAction.accept(permit, context);
				@SuppressWarnings("unchecked")
				BiConsumer<Permit<?>, Object> evaluator = (BiConsumer<Permit<?>, Object>) evaluators.get(permit.getClass());
				if(evaluator != null) {
					evaluator.accept(permit, extendedState);
				}
				PermitMessage message = new PermitMessage(permit, extendedState);
				//System.out.println("Sending out permit");
				modContext.getChannel().getChannel().sendTo(message, (EntityPlayerMP) messageContext.getServerHandler().player);
			});
		} else {
			compatibility.runInMainClientThread(() -> {
				if(extendedState instanceof PlayerContext) {
					((PlayerContext) extendedState).setPlayer(compatibility.clientPlayer());
				}
				@SuppressWarnings("unchecked")
				BiConsumer<Permit<?>, Object> callback = (BiConsumer<Permit<?>, Object>) permitCallbacks.remove(permit.getUuid());
				if(callback != null) {
					callback.accept(permit, extendedState);
				}
			});
		}
		
		return null;
	}



	
}
