package scheduler;

import java.util.List;

import action.Action;

public class SequentialScheduler extends Scheduler {

	public SequentialScheduler(List<Action> l) {
		super(l);
	}

	public void reallyDoStep() {
		listAct.get(0).reallyDoStep();

	}

	

}
