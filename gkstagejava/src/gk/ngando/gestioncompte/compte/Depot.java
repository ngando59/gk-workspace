package gk.ngando.gestioncompte.compte;


public class Depot extends Mouvement {

	public Depot(int montant) {
		super(montant);
		super.setTypeMvt("Dépot");
	}

	@Override
	public int getPlus() {
		return this.getMontant();
	}

}
