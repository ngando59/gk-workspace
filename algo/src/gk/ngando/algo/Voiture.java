package gk.ngando.algo;

public class Voiture {
	// Attributs - proprietés
	int nbPortes;
	String marque;
	String couleur;

	public Voiture() {
		this.nbPortes = 3;
		this.marque = "Ferrari";
		this.couleur = "Rouge";
	}

	public Voiture(String couleur) {
		this();
		this.couleur = couleur;
	}

	public String demarrer() {
		return "Vroooooooooooooouuuuuuuuum";
	}

	public void peindre(String couleur) {
		System.out.println("Voiture peint en " + couleur);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture:[" + this.marque + "-" + this.couleur + " "
				+ this.nbPortes + " portes ]";
	}
}
