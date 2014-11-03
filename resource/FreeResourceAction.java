package resource;

import action.Action;
import action.OneStepAction;

public class FreeResourceAction<R extends Resource> extends Action {
		
	
	protected int tmp1,tmp2;
	protected ResourcePool<R> rp;
	protected ResourcefulUser<R> ru;
	public FreeResourceAction(ResourcePool<R> rp,ResourcefulUser<R>ru){
		this.rp=rp;
		this.ru=ru;
	}
	/*public FreeResourceAction(Resource r){
		this.r = r;
	}*/

	public void reallyDoStep() {
		tmp1=this.rp.resourcesInUse.size();
		rp.freeResource(this.ru.getResource());
		tmp2=this.rp.resourcesInUse.size();
	}
	
	public boolean tryAction(){
		return !(this.rp.availableResources.isEmpty());
	}
	
	/*public void freeResource(){
		
	}*/

	public OneStepAction createAction() {
		return new OneStepAction();
	}
	@Override
	public boolean isReady() {
		return true;
	}
	@Override
	public boolean isFinished() {
		return tmp1>tmp2;
	}
}
