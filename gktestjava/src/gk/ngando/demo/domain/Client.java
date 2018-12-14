package gk.ngando.demo.domain;

public class Client {
	private int numero;
	private String nom;
	private Adresse adresse;
	private String[] mails;
	private int nbMails;

	public Client() {
		nom = "Inconnu";
		numero = 0;
		this.adresse = new Adresse();
		nbMails = 0;
		mails = new String[3];
	}

	public Client(int numero, String nom) {
		this();
		this.numero = numero;
		this.nom = nom;
		this.adresse = new Adresse();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String retourneInfo() {
		return "Client N�" + this.getNumero() + " - " + this.getNumero()
				+ "; il habite : " + this.getAdresse().getVille()
				+ "; ses mails : " + this.getMails();
	}

	public String retourneInfo(String info) {
		return info + this.retourneInfo();
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setMails(String mail) {
		this.mails[nbMails] = mail;
		this.nbMails++;
	}

	public String getMails() {
		if (nbMails == 0)
			return "Aucun mail !";
		String chaine = "";
		for (int i = 0; i < nbMails; i++) {
			chaine += mails[i] + " | ";
		}
		return chaine;
	}
}
