package poolStructure;

import action.Action;
import resource.BasketPool;
import resource.CubiclePool;
import scheduler.SequentialScheduler;

/**
 * This class defines a swimmer that will have to use several resources when he
 * will go to the pool
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class Swimmer extends Action {

	protected String name;
	protected BasketPool basket;
	protected CubiclePool cubicle;
	protected int timeToGetUndressed, swimmingTime, timeToGetDressed;
	protected SequentialScheduler sqs;

	public Swimmer() {

	}

	/**
	 * Constructor of the Swimmer class which initializes a swimmer with a name,
	 * a basket, a cubicle, a time to get undressed, a swimming time and a time
	 * to get dressed
	 * 
	 * @param name
	 *            Name of the swimmer
	 * @param b
	 *            Basket that will be used by the swimmer
	 * @param c
	 *            Cubicle that will be used by the swimmer
	 * @param timeToGetUndressed
	 *            The time he needs to get undressed
	 * @param swimmingTime
	 *            His swimming time
	 * @param timeToGetDressed
	 *            The time he needs to get dressed
	 */
	public Swimmer(String name, BasketPool b, CubiclePool c,
			int timeToGetUndressed, int swimmingTime, int timeToGetDressed) {
		this.name = name;
		this.basket = b;
		this.cubicle = c;
		this.timeToGetUndressed = timeToGetDressed;
		this.swimmingTime = swimmingTime;
		this.timeToGetDressed = timeToGetDressed;
	}

	/**
	 * Indicates if a swimmer is ready
	 * 
	 * @return true if and only if a swimmer is ready
	 */
	public boolean isReady() {
		return false;
	}

	/**
	 * Indicates if a swimmer has finished what he wanted to do
	 * 
	 * @return true if and only if the swimmer has finished
	 */
	public boolean isFinished() {
		return false;
	}

	/**
	 * It really realizes a step of an action
	 */
	public void reallyDoStep() {
	}

	/**
	 * Creates a new Swimmer
	 */
	public Swimmer createAction() {
		return new Swimmer();
	}
}
