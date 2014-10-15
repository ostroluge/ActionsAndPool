package resource;

public class BasketPool extends ResourcePool<Basket> {
	
	public BasketPool(int nbRes){
		super(nbRes);
	}

	public Basket createResource(){
		return new Basket();
	}
}
