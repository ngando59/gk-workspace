package gk.ngando.tpjdbc.ingenieur.domain;

public class Ingenieur {
	private int mle;
	private String nom;
	private String prenom;
	private String noss;
	private String datnais;
	private String notel;
	private String adresse;
	private String codepost;
	private String ville;
	private char sexe;
	private char situation;
	private double cpt;

	public Ingenieur() {
		super();
	}

	public Ingenieur(int mle, String nom, String prenom, String noss,
			String datnais, String notel, String adresse, String codepost,
			String ville, char sexe, char situation, double cpt) {
		super();
		this.mle = mle;
		this.nom = nom;
		this.prenom = prenom;
		this.noss = noss;
		this.datnais = datnais;
		this.notel = notel;
		this.adresse = adresse;
		this.codepost = codepost;
		this.ville = ville;
		this.sexe = sexe;
		this.situation = situation;
		this.cpt = cpt;
	}

	public int getMle() {
		return mle;
	}

	public void setMle(int mle) {
		this.mle = mle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNoss() {
		return noss;
	}

	public void setNoss(String noss) {
		this.noss = noss;
	}

	public String getDatnais() {
		return datnais;
	}

	public void setDatnais(String datnais) {
		this.datnais = datnais;
	}

	public String getNotel() {
		return notel;
	}

	public void setNotel(String notel) {
		this.notel = notel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodepost() {
		return codepost;
	}

	public void setCodepost(String codepost) {
		this.codepost = codepost;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public char getSituation() {
		return situation;
	}

	public void setSituation(char situation) {
		this.situation = situation;
	}

	public double getCpt() {
		return cpt;
	}

	public void setCpt(double cpt) {
		this.cpt = cpt;
	}

}
