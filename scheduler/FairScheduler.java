package scheduler;


import java.util.List;

import action.Action;

public class FairScheduler extends Scheduler {

	protected Action currentAction;
	
	public FairScheduler(List<Action> l, Action currentAction){
		super(l);
		this.currentAction = currentAction;
	}

	
	

	// TO-DO
	@Override
	public void reallyDoStep() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
