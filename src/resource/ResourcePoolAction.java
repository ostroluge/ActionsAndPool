package resource;

import action.Action;

public abstract class ResourcePoolAction <R extends Resource> extends Action {

	protected ResourcePool<R> pool;
	protected ResourcefulUser<R> user;
	protected boolean finished, ready;
	
	
	public ResourcePoolAction(ResourcePool<R> p, ResourcefulUser<R> ru){
		this.pool = p;
		this.user = ru;
	}
	
	public ResourcePoolAction(){
		
	}
	
	public boolean isReady() {
		return ready;
	}

	public boolean isFinished() {
		return finished;
	}

	public void reallyDoStep() {
	
	}
	
	public abstract boolean tryAction();
	/* VÃ©rifier s'il y a les ressources */ 
}

