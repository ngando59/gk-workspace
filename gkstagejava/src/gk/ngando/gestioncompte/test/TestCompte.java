package gk.ngando.gestioncompte.test;

import gk.ngando.gestioncompte.compte.Compte;

public class TestCompte {
	static Compte monCompte;

	public static void creationDesComptes() {
		monCompte = new Compte("123456789Z");
		monCompte.depotDe(100);
		try {
			monCompte.retraitDe(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void ensembleComptes() {
		Compte comptes[] = { monCompte };
		for (Compte compte : comptes) {
			System.out.println(compte + " -> " + compte.getSolde() + "�");
			System.out.println(compte.historique());
		}
	}

	public static void main(String[] args) {
		creationDesComptes();
		ensembleComptes();
		System.out.println();
		monCompte.depotDe(1000);
		monCompte.depotDe(500);
		try {
			monCompte.retraitDe(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		monCompte.setDecouvert(100);
		try {
			monCompte.retraitDe(1500);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		monCompte.ajoutAgio(2);

		ensembleComptes();

	}
}
