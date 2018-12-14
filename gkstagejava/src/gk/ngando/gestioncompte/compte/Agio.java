package gk.ngando.gestioncompte.compte;

public class Agio extends Retrait {

	public Agio(int montant) {
		super(montant);
		super.setTypeMvt("Agio");
	}

}
