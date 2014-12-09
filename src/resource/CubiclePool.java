package resource;

public class CubiclePool extends ResourcePool<Cubicle> {

	public CubiclePool(int nbRes){
		super(nbRes);
	}

	public Cubicle createResource() {
		return new Cubicle();
	}
}
