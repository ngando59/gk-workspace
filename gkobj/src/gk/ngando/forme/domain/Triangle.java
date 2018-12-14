package gk.ngando.forme.domain;

public class Triangle extends Forme {
	protected int base = 3;
	protected int hauteur = 5;

	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}
}
