package gk.ngando.gestioncompte.compte;

public class Livret extends Compte implements Remunerable {

	public Livret(String numeroCompte) {
		super(numeroCompte);
	}

	@Override
	public double calculInteret(double taux) {
		return (super.getSolde() * taux) / 100;
	}

	@Override
	public String toString() {
		return super.toString() + " (Livret)";
	}
}
