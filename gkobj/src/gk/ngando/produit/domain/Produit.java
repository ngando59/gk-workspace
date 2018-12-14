package gk.ngando.produit.domain;


public class Produit {

	private String code;
	private Denomination denomination;
	private int prix;

	public Produit(String code) {
		this.code = code;
		denomination = new Denomination();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Denomination getDenomination() {
		return denomination;
	}

	public void setDenomination(Denomination denomination) {
		this.denomination = denomination;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String afficheLibelle() {
		return denomination.getLibelleCourt() + " "
				+ denomination.getLibelleLong();
	}

	public void modifLibelle(String libelleCourt, String libelleLong) {
		denomination.setLibelleCourt(libelleCourt);
		denomination.setLibelleLong(libelleLong);
	}
}
