package gk.ngando.demo.domain;

public class ThreadAffichageCompteur extends Thread {
	private int nbMax;

	public ThreadAffichageCompteur() {
		super();
		this.nbMax = 7;
	}

	public ThreadAffichageCompteur(String name, int nbMax) {
		super(name);
		this.nbMax = nbMax;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.nbMax; i++) {
			System.out.println(this.getName() + " vaut " + i);
		}
		try {
			Thread.sleep(nbMax);
		} catch (InterruptedException e) {
			System.out.println("Thread r�activ� avant la fin du temps " + nbMax
					+ " " + e.getMessage());
		}
	}

}
