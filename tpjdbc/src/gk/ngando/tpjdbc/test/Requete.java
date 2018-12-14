package gk.ngando.tpjdbc.test;

import gk.ngando.tpjdbc.ingenieur.business.IngenieurDAO;
import gk.ngando.tpjdbc.ingenieur.business.impl.IngenieurDAOImpl;
import gk.ngando.tpjdbc.ingenieur.domain.Ingenieur;

import java.util.List;

public class Requete {

	public static void listeIngenieurs() {
		IngenieurDAO ingenieursDAO = new IngenieurDAOImpl();
		List<Ingenieur> ingenieurs = ingenieursDAO.findAll();
		for (Ingenieur ingenieur : ingenieurs) {
			System.out.println("Nom : " + ingenieur.getNom());
		}
	}

	public static void main(String[] args) {
		listeIngenieurs();

	}

}
