package action;

public abstract class Action {

	protected int time;
	
	public Action(int time){
		this.time = time;
	}
	
	public Action(){
		
	}
	
	public int getTime() {
		return time;
	}

	public abstract boolean isReady();
	
	public boolean isInProgress(){
		if(this.isFinished() == false){
			return true;
		}
		return false;
	}
	
	public abstract boolean isFinished();

	public abstract void reallyDoStep();
	
	public  void doStep(){
		time--;
	}
}
