package gk.ngando.produit.domain;

public class ProduitSaisonnier extends Produit implements Saison {

	private String saison;
	private int remise;

	public ProduitSaisonnier(String code) {
		super(code);
	}

	@Override
	public String getSaison() {
		return saison;
	}

	@Override
	public void setSaison(String saison) {
		this.saison = saison;
	}

	@Override
	public int getRemise() {
		return remise;
	}

	@Override
	public void setRemise(int remise) {
		this.remise = remise;
	}

	@Override
	public int getPrix() {
		return super.getPrix() - remise;
	}

}
