package gk.ngando.forme.domain;

abstract public class Forme {
	protected int cote;

	abstract public double aire();

	public String affiche() {
		return "Je suis une forme";
	}
}
