package action;

/**
 * This class defines a one step action which means that this action only needs
 * one step to be finished
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class OneStepAction extends Action {

	protected boolean end = false;

	public OneStepAction() {

	}

	/**
	 * Indicates if an action is ready
	 * 
	 * @return true if and only if the action is ready
	 */
	public boolean isReady() {
		return !(this.end);
	}

	/**
	 * Indicates if an action is finished
	 * 
	 * @return true if and only if an action is finished
	 */
	public boolean isFinished() {
		return this.end;
	}

	/**
	 * It really realizes the only step of the OneStepAction so the action is
	 * finished
	 */
	public void reallyDoStep() {
		this.end = true;
	}

	/**
	 * Creates a new OneStepAction
	 */
	public OneStepAction createAction() {
		return new OneStepAction();
	}
}
