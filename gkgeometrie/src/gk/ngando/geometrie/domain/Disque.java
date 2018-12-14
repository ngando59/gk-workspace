package gk.ngando.geometrie.domain;

public class Disque implements Courbe, Surface {

	private double rayon;

	public Disque(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double surface() {
		return (PI * this.rayon * this.rayon);
	}

	@Override
	public double longueur() {
		return 0;
	}

	@Override
	public void doubler() {

	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
