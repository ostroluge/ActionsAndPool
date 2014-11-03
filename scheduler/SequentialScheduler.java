package scheduler;

import java.util.List;

import action.Action;

/**
 * This class defines a sequential scheduler which takes care of the actions
 * sequentially
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class SequentialScheduler extends Scheduler {

	public SequentialScheduler(){
		
	}
	
	/**
	 * Constructor of a sequential scheduler which initializes a sequential
	 * scheduler with the list of actions given in parameters
	 * 
	 * @param l
	 *            List of actions
	 */
	public SequentialScheduler(List<Action> l) {
		super(l);
	}

	/**
	 * Realizes the step of the first action of the list
	 */
	public void reallyDoStep() {
		update();
		listAct.get(0).reallyDoStep();
	}

	
	
	public SequentialScheduler createAction() {
		return new SequentialScheduler();
	}
}
