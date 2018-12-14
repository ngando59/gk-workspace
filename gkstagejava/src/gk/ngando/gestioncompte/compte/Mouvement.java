package gk.ngando.gestioncompte.compte;

import java.util.Date;

abstract class Mouvement {

	private int montant;
	private Date dateMvt;
	private String typeMvt;

	public Mouvement() {
		super();
	}

	public Mouvement(int montant) {
		super();
		this.montant = montant;
		this.dateMvt = new Date();
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public String getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(String typeMvt) {
		this.typeMvt = typeMvt;
	}

	public int getPlus() {
		return 0;
	}

	public int getMoins() {
		return 0;
	}

	@Override
	public String toString() {
		return this.getDateMvt() + "[" + this.typeMvt + "]" + "->"
				+ this.montant + "�";
	}
}
