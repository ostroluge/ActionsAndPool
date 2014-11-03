package poolstructure;

import resource.BasketPool;
import resource.CubiclePool;
import scheduler.FairScheduler;
import action.Action;
import action.ActionFinishedException;

/**
 * This class is the main class of the program, it uses the actions, resources
 * and schedulers altogether to solve the pool problem
 * 
 * @author Alexandre LEFEBVRE - Thomas OSTROWSKI
 */

public class Pool {

	public static void main(String[] args) throws ActionFinishedException {

		BasketPool baskets = new BasketPool(6);
		CubiclePool cubicles = new CubiclePool(3);
		FairScheduler s = new FairScheduler();

		
		s.addAction(new Swimmer("Camille", baskets, cubicles, 6, 4, 8));
		s.addAction(new Swimmer("Loïs", baskets, cubicles, 2, 10, 4));
		s.addAction(new Swimmer("Maé", baskets, cubicles, 10, 18, 10));
		s.addAction(new Swimmer("Ange", baskets, cubicles, 3, 7, 5));
		s.addAction(new Swimmer("Louison", baskets, cubicles, 18, 3, 3));
		s.addAction(new Swimmer("Charlie", baskets, cubicles, 3, 6, 10));
		s.addAction(new Swimmer("Alexis", baskets, cubicles, 6, 5, 7));

		
		System.out.println("scheduler est pret : "+ s.isReady());
		System.out.println("paniers disponibles : "+ baskets.getAvailableResources().size());
		System.out.println("cabines disponibles : "+ cubicles.getAvailableResources().size());
		
		System.out.println("liste d'actions : "+ s.getListAction().size());
		
		int nbSteps = 0;

		while (!s.isFinished()) {
			nbSteps++;
			s.doStep();
		}

		System.out.println("Finished in " + nbSteps + " steps");
	}
}
