package scheduler;


import java.util.List;

import action.Action;

public class FairScheduler extends Scheduler {

	protected Action currentAction;
	
	public FairScheduler(){
		
	}
	
	public FairScheduler(List<Action> l, Action currentAction){
		super(l);
		this.currentAction = currentAction;
	}
		
	public void reallyDoStep() {
		currentAction.reallyDoStep();
	}
}
