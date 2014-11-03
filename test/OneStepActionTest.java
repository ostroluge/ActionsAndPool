package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;
import action.OneStepAction;

public class OneStepActionTest  extends ActionTest{

	@Test
	public void OneStepActiontest() {
		OneStepAction osa=new OneStepAction();
		osa.createAction();
		assertTrue(osa.isReady());
		assertFalse(osa.isFinished());
		osa.reallyDoStep();
		assertFalse(osa.isReady());
		assertTrue(osa.isFinished());
	}

	
	public Action createAction() {
	
		return new OneStepAction();
	}
}
