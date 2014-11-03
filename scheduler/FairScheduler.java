package scheduler;

import java.util.List;

import action.Action;

/**
 * This class defines a fair scheduler that has a current action once this
 * action is finished the fair scheduler will take care of the first
 * non-finished action that is next to this current action
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class FairScheduler extends Scheduler {

	protected Action currentAction;
	
	public FairScheduler() {
		//this.currentAction = super.listAct.get(0);
	}

	public void setCurrentAction(Action currentAction) {
		this.currentAction = currentAction;
	}

	/**
	 * Constructor of a fair scheduler which initializes a fair scheduler with a
	 * list of actions and a current action given in parameters
	 * 
	 * @param l
	 *            List of actions of the scheduler
	 * @param currentAction
	 *            Current action of the fair scheduler
	 */
	public FairScheduler(List<Action> l, Action currentAction) {
		super(l);
		this.currentAction = currentAction;
	}

	/**
	 * Realizes a step of the current action's fair scheduler
	 */
	public void reallyDoStep() {
		currentAction.reallyDoStep();
	}

	public FairScheduler createAction() {
		return new FairScheduler();
	}
}
