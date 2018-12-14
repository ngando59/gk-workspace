package gk.ngando.forme.domain;

public class Carre extends Forme {
	protected int cote = 4;

	@Override
	public double aire() {
		return cote * cote;
	}
}
