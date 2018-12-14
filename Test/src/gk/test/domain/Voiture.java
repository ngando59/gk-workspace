package gk.test.domain;

public class Voiture {

	private String marque;
	private String couleur;
	private int nbPortes;

	@Override
	public String toString() {
		return "Marque:" + marque + " Couleur:" + couleur + " nbPortes:"
				+ nbPortes;
	}

}
