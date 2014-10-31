package resource;

import action.OneStepAction;

public class FreeResourceAction extends ResourcePoolAction<Resource> {
		
	protected Resource r;
	
	public FreeResourceAction(){
		
	}
	
	public FreeResourceAction(Resource r){
		this.r = r;
	}

	public void reallyDoStep(){
		super.user.resetResource();
	}
	
	public boolean tryAction(){
		return true;
	}
	
	public void freeResource(){
		
	}

	public OneStepAction createAction() {
		return new OneStepAction();
	}
}
