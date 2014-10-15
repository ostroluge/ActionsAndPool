package resource;

public class FreeResourceAction extends ResourcePoolAction<Resource> {
		
	public FreeResourceAction(){
		
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
	
	public void freeAction(){
		
	}
}
