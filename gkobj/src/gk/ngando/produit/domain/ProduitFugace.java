package gk.ngando.produit.domain;

public class ProduitFugace extends ProduitPerissable implements Saison {

	public ProduitFugace(String code) {
		super(code);
	}

	@Override
	public String getSaison() {
		return null;
	}

	@Override
	public int getRemise() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRemise(int remise) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSaison(String saison) {
		// TODO Auto-generated method stub

	}

}
