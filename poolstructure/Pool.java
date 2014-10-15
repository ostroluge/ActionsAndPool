package poolStructure;

import resource.BasketPool;
import resource.CubiclePool;
import scheduler.FairScheduler;
import action.ActionFinishedException;

public class Pool {

	public static void main(String[] args) throws ActionFinishedException {

		BasketPool baskets = new BasketPool(6);
		CubiclePool cubicles = new CubiclePool(3);
		FairScheduler s = new FairScheduler();
	
		s.addAction(new Swimmer("Jacky", baskets, cubicles, 6, 4, 8));
		s.addAction(new Swimmer("Maurice", baskets, cubicles, 6, 4, 8));
		s.addAction(new Swimmer("Eliot", baskets, cubicles, 6, 4, 8));
		s.addAction(new Swimmer("Charles", baskets, cubicles, 6, 4, 8));
		s.addAction(new Swimmer("Mouloud", baskets, cubicles, 6, 4, 8));
		s.addAction(new Swimmer("Momo", baskets, cubicles, 6, 4, 8));
		
		int nbSteps = 0;
		
		while(!s.isFinished()){
			nbSteps++;
			s.doStep();
		}
		
		System.out.println("Finished in " + nbSteps + " steps");
		
	}
}
