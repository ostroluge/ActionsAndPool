package action;

/**
 * Exception class that is used when an action is finished
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

@SuppressWarnings("serial")
public class ActionFinishedException extends Exception {

	/**
	 * Constructor of the ActionFinishedException, it initializes the exception
	 * with a message given in parameters
	 * 
	 * @param msg
	 *            Message that will be displayed when the exception will trigger
	 */
	public ActionFinishedException(String msg) {
		super(msg);
	}

	public ActionFinishedException() {

	}
}
