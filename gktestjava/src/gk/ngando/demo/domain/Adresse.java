package gk.ngando.demo.domain;

public class Adresse {
	private int numero;
	private String ville;

	public Adresse() {
		super();
		numero = 0;
		ville = "A renseigner";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
