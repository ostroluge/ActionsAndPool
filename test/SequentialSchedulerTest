package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import scheduler.SequentialScheduler;
import action.Action;
import action.OneStepAction;

public class SequentialSchedulerTest extends SchedulerTest{
	protected List<Action> listAct = new ArrayList<Action>();
	@Test
	public void test() {
		SequentialScheduler sqs = new SequentialScheduler(listAct);
		Action a1 = new OneStepAction();
		Action a2 = new OneStepAction();
		sqs.addAction(a1);
		sqs.addAction(a2);
		assertTrue(sqs.isReady());
		assertFalse(sqs.isInProgress());
		assertFalse(sqs.isFinished());
		sqs.reallyDoStep();
		assertFalse(sqs.isReady());
		assertFalse(sqs.isInProgress());
		assertFalse(sqs.isFinished());
		sqs.update();
		assertTrue(sqs.isReady());
		assertFalse(sqs.isInProgress());
		assertFalse(sqs.isFinished());
		sqs.reallyDoStep();
		assertFalse(sqs.isReady());
		assertFalse(sqs.isInProgress());
		assertTrue(sqs.isFinished());
		
		
		
	}

	@Override
	public Action createAction() {
		return new SequentialScheduler(listAct);
	}

}
