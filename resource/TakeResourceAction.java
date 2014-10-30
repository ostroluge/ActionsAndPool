package resource;

import action.Action;

public class TakeResourceAction extends ResourcePoolAction <Resource>{
	
	public TakeResourceAction(){
		
	}
	
	public boolean isReady(){
		return true;
	}

	public boolean isInProgress(){
		return true;
	}
	
	public boolean isFinished(){
		return true;
	}
	
	public void doStep(){
		
	}
	
	public void reallyDoStep(){
		
	}
	
	public boolean tryAction(){
		return (!super.pool.availableResources.isEmpty());
	}
/*	
	public Resource provideResource(){
	}
*/
	public Action createAction() {
		return null;
	}
}
