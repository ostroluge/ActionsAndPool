package scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;



import action.Action;

public abstract class Scheduler extends Action {
	
	protected List<Action> listAct = new ArrayList<Action>();
	protected Iterator<Action> itr = listAct.iterator(); 
	
	
	public Scheduler(List<Action> l){
		this.listAct = l;
	}

	public Scheduler(){
		
	}
	
	public void add(Action a){
		this.listAct.add(a);
	}
	
	public void remove(Action a){
		this.listAct.remove(a);
	}

	public List<Action> getListAction(){
		return this.listAct;
	}

	public void update(){
		for(int i=0;i<listAct.size();i++){
			if (listAct.get(i).isFinished()){
				remove(listAct.get(i));
			}
		}
	}
	public boolean isFinished(){
		if(listAct.size()==1){
			return listAct.get(0).isFinished();
		}
		return false;
	}
	
	public void doStep(){
		if(listAct.get(0).getTime()==0){
			throw new NoSuchElementException();
		}
		listAct.get(0).reallyDoStep();
	}

	public boolean isReady(){
		return listAct.get(0).isReady();
	}

	public boolean isInProgress(){
		return listAct.get(0).isInProgress();
	}
 
	public Action nextAction(){
		if(itr.hasNext()){
			return itr.next();
		}
		throw new NoSuchElementException("No more Actions available");
	}

}
