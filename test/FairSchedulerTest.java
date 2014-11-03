package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import action.Action;
import action.OneStepAction;
import scheduler.FairScheduler;
import scheduler.Scheduler;
import scheduler.SequentialScheduler;

public class FairSchedulerTest extends SchedulerTest{
	protected List<Action> listAct = new ArrayList<Action>();
	@Test
	public void test() {
		Action a1 = new OneStepAction();
		Action a2 = new OneStepAction();
		FairScheduler fs = new FairScheduler(listAct,a1);
		fs.addAction(a1);
		System.out.println(fs.getListAction());
		fs.addAction(a2);
		assertTrue(fs.isReady());
		assertFalse(fs.isInProgress());
		assertFalse(fs.isFinished());
		fs.reallyDoStep();
		assertFalse(fs.isReady());
		assertFalse(fs.isInProgress());
		assertFalse(fs.isFinished());
		fs.update();
		assertTrue(fs.isReady());
		assertFalse(fs.isInProgress());
		assertFalse(fs.isFinished());
		System.out.println(fs.getListAction());
		fs.reallyDoStep();
		assertTrue(fs.isReady());
		assertFalse(fs.isInProgress());
		assertFalse(fs.isFinished());
		}

	public FairScheduler createAction() {
		return new FairScheduler();
	}

}
