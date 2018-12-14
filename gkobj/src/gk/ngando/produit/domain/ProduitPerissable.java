package gk.ngando.produit.domain;

import java.util.Date;

public class ProduitPerissable extends Produit {

	private int dureeConservation;
	private Date dateFabrication;

	public ProduitPerissable(String code) {
		super(code);
	}

	public int getDureeConservation() {
		return dureeConservation;
	}

	public void setDureeConservation(int dureeConservation) {
		this.dureeConservation = dureeConservation;
	}

	public Date getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

}
