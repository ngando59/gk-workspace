package gk.ngando.gestioncompte.compte;


public class Depot extends Mouvement {

	public Depot(int montant) {
		super(montant);
		super.setTypeMvt("D�pot");
	}

	@Override
	public int getPlus() {
		return this.getMontant();
	}

}
