package poolstructure;

import action.ForeseeableAction;
import resource.Basket;
import resource.BasketPool;
import resource.Cubicle;
import resource.CubiclePool;
import resource.FreeResourceAction;
import resource.ResourcefulUser;
import resource.TakeResourceAction;
import scheduler.SequentialScheduler;

/**
 * This class defines a swimmer that will have to use several resources when he
 * will go to the pool
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class Swimmer extends SequentialScheduler {

	protected String name;
	protected BasketPool basket;
	protected CubiclePool cubicle;
	protected ResourcefulUser<Basket> b;
	protected ResourcefulUser<Cubicle> c;
	protected int timeToGetUndressed, swimmingTime, timeToGetDressed;

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
	public Swimmer(String name, BasketPool basket, CubiclePool cubicle,
			int timeToGetUndressed, int swimmingTime, int timeToGetDressed) {
		this.name = name;
		this.basket = basket;
		this.cubicle = cubicle;
		this.timeToGetUndressed = timeToGetDressed;
		this.swimmingTime = swimmingTime;
		this.timeToGetDressed = timeToGetDressed;
		
		this.b = new ResourcefulUser<Basket>();
		this.c = new ResourcefulUser<Cubicle>();
		
		initializeActions();
	}

	public void initializeActions(){
		
		TakeResourceAction<Basket> takeBasket = new TakeResourceAction<Basket>(this.basket, this.b);
		TakeResourceAction<Cubicle> takeCubicleBeforeGoingToThePool = new TakeResourceAction<Cubicle>(this.cubicle, this.c);
		FreeResourceAction<Cubicle> freeCubicleBeforeGoingToThePool = new FreeResourceAction<Cubicle>(this.cubicle, this.c);
		TakeResourceAction<Cubicle> takeCubicleAfterSwimming = new TakeResourceAction<Cubicle>(this.cubicle, this.c);
		FreeResourceAction<Cubicle> freeCubicle = new FreeResourceAction<Cubicle>(this.cubicle, this.c);
		FreeResourceAction<Basket> freeBasket = new FreeResourceAction<Basket>(this.basket, this.b);
	
		this.addAction(takeBasket.createAction());
		this.addAction(takeCubicleBeforeGoingToThePool.createAction());
		this.addAction(new ForeseeableAction(timeToGetUndressed, timeToGetUndressed, "undressing"));
		this.addAction(freeCubicleBeforeGoingToThePool.createAction());
		this.addAction(new ForeseeableAction(swimmingTime, swimmingTime, "swimming"));
		this.addAction(takeCubicleAfterSwimming.createAction());
		this.addAction(new ForeseeableAction(timeToGetDressed, timeToGetDressed, "dressing"));
		this.addAction(freeCubicle.createAction());
		this.addAction(freeBasket.createAction());
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
		System.out.println(this.name+"'s turn");
		super.doStep();
	}

	/**
	 * Creates a new Swimmer
	 */
	public Swimmer createAction() {
		return new Swimmer();
	}
}
