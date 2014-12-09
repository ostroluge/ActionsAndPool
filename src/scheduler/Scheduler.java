package scheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import action.Action;

/**
 * This class defines a scheduler that will manage actions by using a list of
 * actions
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public abstract class Scheduler extends Action {

	protected List<Action> listAct = new ArrayList<Action>();
	protected Iterator<Action> itr = listAct.iterator();

	/**
	 * Constructor of a scheduler which initializes a scheduler with a list of
	 * actions given in parameters
	 * 
	 * @param l
	 *            List of actions of the scheduler
	 */
	public Scheduler(List<Action> l) {
		this.listAct = l;
	}

	public Scheduler() {

	}

	/**
	 * It adds an action to the scheduler
	 * 
	 * @param a
	 *            The action that will be added to the scheduler
	 */
	public void addAction(Action a) {
		this.listAct.add(a);
	}

	/**
	 * It removes an action from the scheduler
	 * 
	 * @param a
	 *            The action that will be removed from the scheduler
	 */
	public void removeAction(Action a) {
		this.listAct.remove(a);
	}

	/**
	 * It returns the list of action of a scheduler
	 * 
	 * @return the list of actions of the scheduler
	 */
	public List<Action> getListAction() {
		return this.listAct;
	}

	/**
	 * It updates the list of actions by removing the ones which are finished
	 */
	public void update() {
		for (int i = 0; i < listAct.size(); i++) {
			if (listAct.get(i).isFinished()) {
				removeAction(listAct.get(i));
			}
		}
	}

	/**
	 * Indicates if there is still an action in the scheduler
	 * 
	 * @return true if and only if there is no more action to do in the
	 *         scheduler
	 */
	public boolean isFinished() {
		if (listAct.size() == 1) {
			return listAct.get(0).isFinished();
		}
		return false;
	}

	/**
	 * Does a step of an action of the scheduler
	 */
	public void doStep() {
		if (listAct.get(0).getTime() == 0) {
			throw new NoSuchElementException("No more steps to do");
		}
		listAct.get(0).reallyDoStep();
	}

	/**
	 * Indicates if a scheduler is ready
	 * 
	 * @return true if and only if the first action of the scheduler is ready
	 */
	public boolean isReady() {
		return listAct.get(0).isReady();
	}

	/**
	 * Indicates if a scheduler is on progress
	 * 
	 * @return true if and only if the first action of the scheduler is on
	 *         progress
	 */
	public boolean isInProgress() {
		return listAct.get(0).isInProgress();
	}

	/**
	 * Returns the next action of the scheduler if there is still one action to
	 * do
	 * 
	 * @return the next action of the scheduler
	 */
	public Action nextAction() {
		if (itr.hasNext()) {
			return itr.next();
		}
		throw new NoSuchElementException("No more Actions available");
	}
}
