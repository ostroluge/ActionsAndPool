package action;

/**
 * This class defines a non-specific Action
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public abstract class Action {

	protected int time;

	/**
	 * Constructor of the Action class, it creates an Action and initializes the
	 * Action to the time given in parameters
	 * 
	 * @param time
	 *            Number of steps that will be done to finish the action
	 */
	public Action(int time) {
		this.time = time;
	}

	public Action() {

	}

	/**
	 * Returns the time of an action
	 * 
	 * @return the number of steps that will be done to finish the action
	 */
	public int getTime() {
		return time;
	}

	/**
	 * Indicates if an action is ready
	 * 
	 * @return true if and only if the action is ready
	 */
	public abstract boolean isReady();

	/**
	 * Indicates if an action is on progress
	 * 
	 * @return true if and only if the action is on progress
	 */
	public boolean isInProgress() {
		if (this.isFinished() == false && this.isReady()==false) {
			return true;
		}
		return false;
	}

	/**
	 * Indicates if an action is finished
	 * 
	 * @return true if and only if an action is finished
	 */
	public abstract boolean isFinished();

	/**
	 * It really realizes a step of an action
	 */
	public abstract void reallyDoStep();

	/**
	 * Creates a new Action according to the object that calls this method
	 * 
	 * @return a new Action
	 */
	public abstract Action createAction();

	/**
	 * It realizes one step for an action
	 */
	public void doStep() {
		time--;
	}
}
