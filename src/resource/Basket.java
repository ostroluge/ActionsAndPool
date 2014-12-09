package resource;

/**
 * This class defines a basket that will be used by the swimmers to put their
 * clothes inside
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class Basket implements Resource {

	public Basket() {

	}

	/**
	 * It gives a description of the basket
	 * 
	 * @return the description of a basket
	 */
	public String getDescription() {
		return "basket";
	}
}
