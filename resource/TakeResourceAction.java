package resource;
import action.OneStepAction;

public class TakeResourceAction extends ResourcePoolAction <Resource>{
	
	protected Resource r;
	
	public TakeResourceAction(){
		
	}
	
	public TakeResourceAction(Resource r){
		this.r = r;
	}
	
	public void reallyDoStep(){
		if(tryAction()){
			super.user.setResource(super.pool.provideResource());
		}
	}
	
	public boolean tryAction(){
		return (!super.pool.availableResources.isEmpty());
	}
/*	
	public Resource provideResource(){
	}
*/
	public OneStepAction createAction() {
		return new OneStepAction();
	}
}
