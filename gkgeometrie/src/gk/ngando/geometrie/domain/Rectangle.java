package gk.ngando.geometrie.domain;

public class Rectangle implements Courbe, Surface {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double surface() {
		return (this.longueur * this.largeur * 2);
	}

	@Override
	public double longueur() {
		return this.longueur;
	}

	@Override
	public void doubler() {
		// TODO Auto-generated method stub
	}

}
