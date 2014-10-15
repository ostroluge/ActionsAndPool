package action;


public class OneStepAction extends Action {

	protected boolean end = false;

	public OneStepAction() {
		
	}

	public boolean isReady() {
		return !(this.end);
	}

	public boolean isFinished() {
		return this.end;
	}

	public void reallyDoStep() {
		this.end = true;
	}

}
