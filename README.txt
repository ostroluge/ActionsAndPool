Project 2 : Simulation of a  Pool
==============
Names:
LEFEBVRE Alexandre
OSTROWSKI Thomas

05/11/2014

Summary :
1) Description of the application
2) Code Samples
3) Known bugs


1) Description of the application
  It's an application which simulates the organization of a swimming pool.


2)
ReallyDoStep of the Fair Scheduler

public void reallyDoStep() {
		if(!currentAction.isFinished()){
			currentAction.doStep();
			currentAction = nextAction();
		}else {
			listAct.remove(currentAction);
			if(!isFinished()){
			currentAction= nextAction();}
		
		}
  }
		
		
	
		
		ReallyDoStep of the TakeResourceAction
		
		public void reallyDoStep() {
		String display;
		display = "\ttrying to take resource from pool";
		tmp1 = this.pool.resourcesInUse.size();
		if (tryAction()) {
			this.user.setResource(this.pool.provideResource());
			display += this.user.getResource().getDescription();
			tmp2 = this.pool.resourcesInUse.size();
			display += "... succes ";
		} else {
			display += "... failed ";
		}
		System.out.println(display);
	}
	
	3)  When a swimmer finishes his actions he stays and make 2 more steps before he leaves the swimming which leads
	         to a number of steps of 259.
