package poolStructure;

import resource.BasketPool;
import resource.CubiclePool;

public class Swimmer {

	protected String name;
	protected BasketPool basket;
	protected CubiclePool cubicle;
	protected int timeToGetUndressed, swimmingTime, timeToGetDressed;

	public Swimmer() {

	}

	public Swimmer(String name, BasketPool b, CubiclePool c,
			int timeToGetUndressed, int swimmingTime, int timeToGetDressed) {
		this.name = name;
		this.basket = b;
		this.cubicle = c;
		this.timeToGetUndressed = timeToGetDressed;
		this.swimmingTime = swimmingTime;
		this.timeToGetDressed = timeToGetDressed;
	}
}
