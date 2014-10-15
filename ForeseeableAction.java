package action;


public class ForeseeableAction extends Action {

	protected int  timeRemaining;
	
	public ForeseeableAction(int time, int timeRemaining){
		super(time);
		if(time <= 0){
			throw new IllegalArgumentException();
		}
		this.timeRemaining = timeRemaining;
		
	}
	
	public boolean isReady(){
		return timeRemaining == time;
	}

	public boolean isFinished(){
		return timeRemaining <= 0;
	}

	public void reallyDoStep(){
		timeRemaining --;
	}

}
