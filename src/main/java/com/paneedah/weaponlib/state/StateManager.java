package com.paneedah.weaponlib.state;

import com.paneedah.weaponlib.state.Permit.Status;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class StateManager<S extends ManagedState<S>, E extends ExtendedState<S>> {

	public class RuleBuilder<EE extends E> {
		
		private static final long DEFAULT_REQUEST_TIMEOUT = 10000L;
		
		private Aspect<S, EE> aspect;
		private S fromState;
		private S toState;
		private VoidAction<S, EE> prepareAction;
		private PostAction<S, EE> action;
		private BiPredicate<S, EE> predicate;
		private BiFunction<S, EE, Permit<S>> permitProvider;
		private BiFunction<S, EE, Boolean> stateUpdater;
		private PermitManager permitManager;
		private Predicate<EE> preparePredicate;
		private long requestTimeout = DEFAULT_REQUEST_TIMEOUT;
		private boolean isPermitRequired;
		
		public RuleBuilder(Aspect<S, EE> aspect) {
			this.aspect = aspect;
		}
		
		public RuleBuilder<EE> prepare(VoidAction<S, EE> prepareAction, Predicate<EE> preparePredicate) {
			this.prepareAction = prepareAction;
			this.preparePredicate = preparePredicate;
			return this;
		}

		public RuleBuilder<EE> change(S fromState) {
			this.fromState = fromState;
			return this;
		}

		public RuleBuilder<EE> to(S state) {
			this.toState = state;
			return this;
		}
		
		public RuleBuilder<EE> when(Predicate<EE> predicate) {
			this.predicate = (s, e) -> predicate.test(e);
			return this;
		}
		
		public RuleBuilder<EE> when(BiPredicate<S, EE> predicate) {
            this.predicate = predicate;
            return this;
        }
		
		public RuleBuilder<EE> withPermit(
				BiFunction<S, EE, Permit<S>> permitProvider,
				BiFunction<S, EE, Boolean> stateUpdater,
				PermitManager permitManager) {
			this.isPermitRequired = true;
			this.permitProvider = permitProvider;
			this.stateUpdater = stateUpdater;
			this.permitManager = permitManager;
			return this;
		}
		
//		public RuleBuilder<A, T> withAction(Action<S> action) {
//			this.action = action;
//			return this;
//		}
		
//		public RuleBuilder<EE> withAction(PostAction<S, EE> action) {
//            this.action = (context, from, to, permit) -> action.execute(context, from, to, permit);
//            return this;
//        }
		
		public RuleBuilder<EE> withAction(VoidPostAction<S, EE> action) {
			this.action = (context, from, to, permit) -> { action.execute(context, from, to, permit); return null;};
			return this;
		}
		
		public RuleBuilder<EE> withAction(VoidAction2<EE> action) {
			this.action = (context, from, to, permit) -> { action.execute(context); return null;};
			return this;
		}
		
//		public RuleBuilder<EE> automatically() {
//			this.auto = true;
//			return this;
//		}
		
		public StateManager<S, E> automatic() {
			return addRule(true);
		}
		
		public StateManager<S, E> manual() {
			return addRule(false);
		}
		
		private StateManager<S, E> addRule(boolean auto) {
			
			LinkedHashSet<TransitionRule<S, E>> aspectRules = StateManager.this.contextRules.computeIfAbsent(
					aspect, c -> new LinkedHashSet<>());
			
			if(predicate == null) {
				predicate = (s, c) -> true;
			}
			
			if(action == null) {
				action = (c, f, t, p) -> null;
			}
			
			/*
			 * Problem with updating state. Need to specify which update is required.
			 * 
			 * Option 1: specify what to update
			 * 	cons: need to know the state transitioning details
			 * 
			 * Option 2: introduce auto-transitioned rules.
			 * 	Auto-transitioned rule would apply when requestor does not set a target state
			 * 
			 * for example
			 * 	rule could be auto-transitioned state
			 *
			 */
			
			final S effectiveFromState;
			final BiPredicate<S, E> effectivePredicate;
			final boolean isRequestRuleAutoTransitioned;
			
			if(prepareAction != null || preparePredicate != null) {
				
				if(auto) {
					throw new IllegalStateException("Prepared transition cannot be automatic");
				}
				
				TransitionRule<S, E> prepareRule = new TransitionRule<>(fromState, toState.preparingPhase(), 
						(s, e) -> predicate.test(s, safeCast(e)), 
						(c, f, t, p) -> {
							if(prepareAction != null) {
								prepareAction.execute(safeCast(c), f, t); 
							}
							return null;
						},
						false);
				
				aspectRules.add(prepareRule);
				
				effectiveFromState = toState.preparingPhase();
				effectivePredicate = (s, e) -> preparePredicate != null ? preparePredicate.test(safeCast(e)) : true; //e -> System.currentTimeMillis() > e.getStateUpdateTimestamp() + prepareDuration;
				isRequestRuleAutoTransitioned = true; // prepare -> request transition must be automatic
			} else {
				effectiveFromState = fromState;
				effectivePredicate = (s, e) -> predicate.test(s, safeCast(e));
				isRequestRuleAutoTransitioned = false; // from -> request transtion must be manual
			}
			
			if(isPermitRequired) {
				if(auto) {
					throw new IllegalStateException("Permitted transitions cannot be automatic");
				}
				
				TransitionRule<S, E> requestPermitRule = new TransitionRule<>(effectiveFromState, toState.permitRequestedPhase(), 
						effectivePredicate, 
						(s, f, t, p) -> {
							
							//System.out.println("hi gamers " + (p != null));
							//System.out.println(t);
							permitManager.request(
								p != null ? p : permitProvider.apply(t, safeCast(s)), s, this::applyPermit);
								return null;
						}, isRequestRuleAutoTransitioned);
				
				aspectRules.add(requestPermitRule);

				TransitionRule<S, E> rollbackRule = new TransitionRule<>(toState.permitRequestedPhase(), fromState, 
						(s, c) -> System.currentTimeMillis() > c.getStateUpdateTimestamp() + requestTimeout,
						(c, f, t, p) -> action.execute(safeCast(c), f, t, p), 
						true);
				
				aspectRules.add(rollbackRule);
				
			} else {
				TransitionRule<S, E> directTransitionRule = new TransitionRule<>(effectiveFromState, toState,
						effectivePredicate, (c, f, t, p) -> action.execute(safeCast(c), f, t, p), auto);
				aspectRules.add(directTransitionRule);
			}
			
			return StateManager.this;
		}

		private void applyPermit(Permit<S> processedPermit, E updatedState) {
			// This is a permit granted callback which sets state to the final toState
			
			
			
			S updateToState = processedPermit.getStatus() == Status.GRANTED ? toState : fromState;
			LOG.debug("Applying permit with status {} to {}, changing state to {}",
			        processedPermit.getStatus(), updatedState, toState);
			
			if(stateUpdater.apply(updateToState, safeCast(updatedState))) {
				action.execute(safeCast(updatedState), fromState, toState, processedPermit);
			}
			
			//TODO: changeState(aspect, updatedState);
		}
	}
	

	
	public static interface StateComparator<S extends ManagedState<S>> {
		public boolean compare(S state1, S state2);
	}
	
	public class Result {
		private boolean stateChanged;
		private S state;
		protected Object actionResult;

		private Result(boolean stateChanged, S targetState) {
			this.stateChanged = stateChanged;
			this.state = targetState;
		}

		public boolean isStateChanged() {
			return stateChanged;
		}

		public S getState() {
			return state;
		}
		
		public Object getActionResult() {
			return actionResult;
		}
	}
	
	public static interface PostAction<S extends ManagedState<S>, EE> {
		public Object execute(EE extendedState, S fromState, S toState, Permit<S> permit);
	}
	
	public static interface VoidPostAction<S extends ManagedState<S>, EE> {
		public void execute(EE extendedState, S fromState, S toState, Permit<S> permit);
	}
	
	public static interface VoidAction<S extends ManagedState<S>, EE> {
		public void execute(EE extendedState, S fromState, S toState);
	}
	
	public static interface VoidAction2<EE> {
		public void execute(EE extendedState);
	}
	
	@SuppressWarnings("unchecked")
	private static <T, U> T safeCast(U u) {
		return (T) u;
	}
	
	private static class TransitionRule<S extends ManagedState<S>, E extends ExtendedState<S>> {
		S fromState;
		S toState;
		BiPredicate<S, E> predicate;
		PostAction<S, E> action;
		boolean auto;
		
		TransitionRule(
				S fromState, 
				S toState, 
				BiPredicate<S, E> predicate, 
				PostAction<S, E> action,
				boolean auto) {
			if(fromState == null) {
				throw new IllegalArgumentException("From-state cannot be null");
			}
			if(toState == null) {
				throw new IllegalArgumentException("To-state cannot be null");
			}
			this.fromState = fromState;
			this.toState = toState;
			this.predicate = predicate;
			this.action = action;
			this.auto = auto;
		}
		
		boolean matches(StateComparator<S> stateComparator, E context, S fromState, @SuppressWarnings("unchecked") S...targetStates) {
			
			boolean result = fromState == null || stateComparator.compare(this.fromState, fromState);
			result = result && ((auto && targetStates.length == 0) 
						|| Arrays.stream(targetStates).anyMatch(
								targetState -> 
									/*
									 *  When changeState() is invoked with "main" state as a target state,
									 *  the rule should consider prepared phase permit phase of the "main" state as well.
									 */
									stateComparator.compare(toState, targetState)
									|| stateComparator.compare(toState, targetState.preparingPhase())
									|| stateComparator.compare(toState, targetState.permitRequestedPhase())
									
								));
			
			result = result && predicate.test(toState, context);
			return result;
		}
	}
	
	private StateComparator<S> stateComparator;
	private Map<Aspect<S, ? extends E>, LinkedHashSet<TransitionRule<S, E>>> contextRules = new HashMap<>();
	
	public StateManager(StateComparator<S> stateComparator) {
		this.stateComparator = stateComparator;
	}
	
	public <EE extends E> RuleBuilder<EE> in(Aspect<S, EE> aspect) {
		return new RuleBuilder<EE>(aspect);
	}
	
	public Result changeState(Aspect<S, ? extends E> aspect, E extendedState, @SuppressWarnings("unchecked") S...targetStates) {
		return changeState(aspect, extendedState, null, targetStates);
	}
	
	public Result changeState(Aspect<S, ? extends E> aspect, E extendedState, Permit<S> permit, @SuppressWarnings("unchecked") S...targetStates) {
		S currentState = extendedState.getState();
		return changeStateFromTo(aspect, extendedState, permit, currentState, targetStates);
	}
	
	@SuppressWarnings("unchecked")
	public Result changeStateFromAnyOf(Aspect<S, ? extends E> aspect, E extendedState, Collection<S> fromStates, S...targetStates) {
		S currentState = extendedState.getState();
		if(!fromStates.contains(currentState)) {
			return new Result(false, currentState);
		}
		return changeStateFromTo(aspect, extendedState, currentState, targetStates);
	}
	
	protected Result changeStateFromTo(Aspect<S, ? extends E> aspect, E extendedState, S currentState, @SuppressWarnings("unchecked") S...targetStates) {
		return changeStateFromTo(aspect, extendedState, null, currentState, targetStates);
	}
	
	protected Result changeStateFromTo(Aspect<S, ? extends E> aspect, E extendedState, Permit<S> permit, S currentState, @SuppressWarnings("unchecked") S...targetStates) {
		
		if(extendedState == null) {
			return null;
		}
		
		if(targetStates.length == 1 && Arrays.stream(targetStates).anyMatch(target -> stateComparator.compare(currentState, target))) {
			return new Result(false, currentState);
		}
		
		Result result = null;
		
		TransitionRule<S, E> newStateRule;
		S s = currentState;
		S ts[] = targetStates;
		while((newStateRule = findNextStateRule(aspect, extendedState, s, ts)) != null) {
			extendedState.setState(newStateRule.toState);
			LOG.debug("Changed state of {} to {}", extendedState, newStateRule.toState);
			result = new Result(true, newStateRule.toState);
			if(newStateRule.action != null) {
				result.actionResult = newStateRule.action.execute(extendedState, s, newStateRule.toState, permit);
			}
			s = newStateRule.toState;
			ts = safeCast(new ManagedState[0]);
		}
		
		if(result == null) {
			result = new Result(false, s);
		}
		
		return result;
	}


	private TransitionRule<S, E> findNextStateRule(Aspect<S, ? extends E> aspect, E extendedState, S currentState, @SuppressWarnings("unchecked") S... targetStates) {
		
		return contextRules.entrySet().stream()
				.filter(e -> e.getKey() == aspect) 
				.map(e -> e.getValue()) // convert entry to a list of rules
				.flatMap(LinkedHashSet::stream) // merge the rule list
				.filter(rule -> rule.matches(stateComparator, extendedState, currentState, targetStates)) // find matching rule
				.findFirst() // stop on the first found rule
				.orElse(null); // default to null if rule not found
	}
	
//  Non-stream version to test performance
//
//	private TransitionRule<S, E> findNextStateRule(Aspect<S, ? extends E> aspect, E extendedState, S currentState, @SuppressWarnings("unchecked") S... targetStates) {
//		
//		LinkedHashSet<TransitionRule<S, E>> aspectRules = contextRules.get(aspect);
//		TransitionRule<S, E> result = null;
//		if(aspectRules != null) {
//			for(TransitionRule<S, E> rule: aspectRules) {
//				if(rule.matches(stateComparator, extendedState, currentState, targetStates)) {
//					result = rule;
//					break;
//				}
//			}
//		}
//		return result;
//	}
}
