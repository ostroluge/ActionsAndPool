package resource;

import action.Action;

public abstract class ResourcePoolAction <R extends Resource> extends Action {

	protected ResourcePool<R> pool;
	protected ResourcefulUser<R> user;
	protected boolean finished, ready;
	
	
	public boolean isReady() {
		return ready;
	}

	public boolean isFinished() {
		return finished;
	}

	public void reallyDoStep() {
	
	}
	
	public abstract boolean tryAction();
	/* Vérifier s'il y a les ressources */ 
}

