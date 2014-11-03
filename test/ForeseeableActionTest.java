package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;
import action.ForeseeableAction;

public class ForeseeableActionTest extends ActionTest{
	protected int timeRemaining=2;
	protected String name = "Forseeable";
	@Test
	public void ForeseeableActiontest() {
		
		ForeseeableAction fa =new ForeseeableAction(timeRemaining, timeRemaining, name);
		assertTrue(fa.isReady());
		assertFalse(fa.isInProgress());
		assertFalse(fa.isFinished());
		fa.reallyDoStep();	
		assertFalse(fa.isReady());
		assertTrue(fa.isInProgress());
		assertFalse(fa.isFinished());
		fa.reallyDoStep();
		assertFalse(fa.isReady());
		assertFalse(fa.isInProgress());
		assertTrue(fa.isFinished());
		
		
	}
	
	
	public Action createAction() {
		return new ForeseeableAction(timeRemaining,timeRemaining, name);
	}

}
