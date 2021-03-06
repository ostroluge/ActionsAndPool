package resource;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public abstract class ResourcePool<R extends Resource> {

	protected List<R> resourcesInUse;
	protected List<R> availableResources;

	
	public List<R> getResourcesInUse() {
		return resourcesInUse;
	}

	public List<R> getAvailableResources() {
		return availableResources;
	}

	public ResourcePool(int nbRes){
		availableResources = new ArrayList<R>();
		resourcesInUse = new ArrayList<R>();
		
		for(int i=0; i<nbRes; i++){
			availableResources.add(createResource());
		}
	}
	
	public R provideResource() throws NoSuchElementException {
		R res;
		if (availableResources.size() > 0) {
			res = availableResources.get(0);
			resourcesInUse.add(res);
			availableResources.remove(res);
			return res;
		} else {
			throw new NoSuchElementException("No resources available");
		}
	}

	public void freeResource(R res) throws IllegalArgumentException {
		availableResources.add(res);
		resourcesInUse.remove(res);
	}

	public abstract R createResource();
	
	public String getDescription() {
		return "All the resources of the pool";
	}
}
