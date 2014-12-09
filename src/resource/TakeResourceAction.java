package resource;
import action.Action;
import action.OneStepAction;

public class TakeResourceAction <R extends Resource> extends Action {
	
	protected ResourcePool<R> pool;
	protected ResourcefulUser<R> user;
	protected int tmp1, tmp2;

	public TakeResourceAction(ResourcePool<R> p, ResourcefulUser<R> ru){
		this.pool = p;
		this.user = ru;
	}
	
	public void reallyDoStep(){
		String display;
		display = "trying to take resource from pool ";
		display += this.user.getResource().getDescription();
		tmp1 = this.pool.resourcesInUse.size();
		if(tryAction()){
			this.user.setResource(this.pool.provideResource());
			tmp2 = this.pool.resourcesInUse.size();
			display += " succes ";
			display += this.pool.availableResources.size() + " resources available";
		} else {
			display += " failed ";
		}
		System.out.println(display);
	}
	
	public boolean tryAction(){
		return (!this.pool.availableResources.isEmpty());
	}
	
	public OneStepAction createAction() {
		return new OneStepAction();
	}

	public boolean isReady() {
		return tryAction();
	}

	public boolean isFinished() {
		return tmp2 > tmp1;
	}
}
