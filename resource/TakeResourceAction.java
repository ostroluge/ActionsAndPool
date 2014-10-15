package resource;

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
	
	public Resource provideResource(){
		
	}

}
