package gk.ngando.produit.domain;

public class Client {
	private int numero;
	private String raisonSociale;
	private String telephone;

	public Client(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String afficheInfo() {
		return "Client N°" + numero + " - " + raisonSociale + " - " + telephone;
	}
}
