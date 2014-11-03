package test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import scheduler.Scheduler;
import action.Action;
import action.OneStepAction;

public  abstract class SchedulerTest extends ActionTest{

	@Override
	public abstract Action createAction();
	

	@Test
	public void Schedulertest() {
		
	}

}
