package action;

/**
 * This class defines a foreseeable action, which means that we know how many
 * steps this action is made of.
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class ForeseeableAction extends Action {

	protected int timeRemaining, stepNumber=1;
	protected String name;

	/**
	 * Constructor of a ForeseeableAction that initializes a foreseeable action
	 * with a time and a time remaining given in parameters
	 * 
	 * @param time
	 *            Number of steps to finish the action
	 * @param timeRemaining
	 *            Number of steps to finish the foreseeable action
	 */
	public ForeseeableAction(int time, int timeRemaining, String name) {
		super(time);
		if (time <= 0) {
			throw new IllegalArgumentException();
		}
		this.timeRemaining = timeRemaining;
		this.name = name;
	}

	public ForeseeableAction() {

	}

	/**
	 * Indicates if an action is ready
	 * 
	 * @return true if and only if the action is ready
	 */
	public boolean isReady() {
		return timeRemaining == time;
	}

	/**
	 * Indicates if an action is finished
	 * 
	 * @return true if and only if an action is finished
	 */
	public boolean isFinished() {
		return timeRemaining <= 0;
	}

	/**
	 * It really realizes a step of a foreseeable action
	 */
	public void reallyDoStep() {
		timeRemaining--;
		System.out.println("\t" + this.name + "(" + stepNumber + "/" + super.time + ")");
		if(stepNumber < super.time){
			stepNumber++;
		}
	}

	/**
	 * Creates a new ForeseeableAction
	 */
	public ForeseeableAction createAction() {
		return new ForeseeableAction();
	}
}
