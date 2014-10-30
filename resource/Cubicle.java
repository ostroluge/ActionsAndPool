package resource;

/**
 * This class defines a cubicle where the swimmers will change their clothes
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class Cubicle implements Resource {

	public Cubicle() {

	}

	/**
	 * It gives a description of the cubible
	 * 
	 * @return the description of a cubicle
	 */
	public String getDescription() {
		return "A place to change clothes";
	}
}
