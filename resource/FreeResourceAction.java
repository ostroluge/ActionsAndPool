package resource;

import action.Action;
import action.OneStepAction;

public class FreeResourceAction <R extends Resource> extends Action {
		
	protected ResourcePool<R> pool;
	protected ResourcefulUser<R> user;
	protected int tmp1, tmp2;
	
	public FreeResourceAction(ResourcePool<R> p, ResourcefulUser<R> ru){
		this.pool = p;
		this.user = ru;
	}
	
	public void reallyDoStep(){
		this.user.resetResource();
	}
	
	public boolean tryAction(){
		return true;
	}
	
	public void freeResource(){
		
	}

	public OneStepAction createAction() {
		return new OneStepAction();
	}

	public boolean isReady() {
		return tryAction();
	}

	public boolean isFinished() {
		return false;
	}
}
