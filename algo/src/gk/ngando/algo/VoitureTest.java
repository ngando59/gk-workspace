package gk.ngando.algo;

public class VoitureTest {

	public static void main(String[] args) {
		int cpt;
		Voiture v1, x;

		cpt = 0;
		v1 = new Voiture();
		x = new Voiture("15");
		// x.peindre("Blanc");
		x.marque = "Audi";
		x.nbPortes = 8;
		x.couleur = "rouge";

		Voiture garage[] = { v1, x };
		for (int i = 0; i < garage.length; i++) {
			String moteur = garage[i].demarrer();
			System.out.println(moteur + " " + garage[i]);
		}
	}
}
