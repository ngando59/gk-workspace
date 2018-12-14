package gk.ngando.gestioncompte.compte;


public class Retrait extends Mouvement {

	public Retrait(int montant) {
		super(montant);
		super.setTypeMvt("Retrait");
	}

	@Override
	public int getMoins() {
		return this.getMontant();
	}

}
