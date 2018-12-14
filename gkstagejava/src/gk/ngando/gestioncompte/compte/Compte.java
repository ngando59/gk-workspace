package gk.ngando.gestioncompte.compte;

import java.util.Enumeration;
import java.util.Vector;

public class Compte {
	private String numeroCompte;
	private Vector<Mouvement> operations;
	private int decouvert;

	public Compte(String numeroCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.decouvert = 0;
		this.operations = new Vector<Mouvement>();
	}

	public Compte(String nom, int decouvert) {
		this(nom);
		this.decouvert = decouvert;
	}

	public int getSolde() {
		return this.getSommeDepots() - this.getSommeRetraits();
	}

	public int getSommeDepots() {
		int somme = 0;
		Enumeration<Mouvement> listeSomme = operations.elements();
		while (listeSomme.hasMoreElements()) {
			Mouvement mvt = listeSomme.nextElement();
			somme += mvt.getPlus();
		}
		return somme;
	}

	public int getSommeRetraits() {
		int somme = 0;
		Enumeration<Mouvement> listeSomme = operations.elements();
		while (listeSomme.hasMoreElements()) {
			Mouvement mvt = listeSomme.nextElement();
			somme += mvt.getMoins();
		}
		return somme;
	}

	public void depotDe(int montant) {
		operations.add(new Depot(montant));
	}

	public void retraitDe(int montant) throws CompteException {
		if (verifDecouvert(montant)) {
			operations.add(new Retrait(montant));
		} else {
			throw new CompteException("Attention ! <<retrait impossible>>");
		}
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	private boolean verifDecouvert(int montant) {
		return ((this.getSolde() + this.getDecouvert()) - montant >= 0);
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return "Compte N� " + this.numeroCompte;
	}

	public String historique() {
		String historique = "------------------------\n";
		historique += "****** Historique ******\n";
		historique += "------------------------\n";
		Enumeration<Mouvement> listeSomme = operations.elements();
		while (listeSomme.hasMoreElements()) {
			Mouvement mvt = listeSomme.nextElement();
			historique += mvt.toString() + "\n";
		}
		historique += "------------------------\n";
		return historique;
	}

	public void ajoutAgio(int montant) {
		operations.add(new Agio(montant));
	}
}
