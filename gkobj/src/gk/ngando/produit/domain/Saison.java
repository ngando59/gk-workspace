package gk.ngando.produit.domain;

public interface Saison {
	public String getSaison();

	public int getRemise();

	public int getPrix();

	public void setPrix(int prix);

	public void setRemise(int remise);

	public void setSaison(String saison);
}
