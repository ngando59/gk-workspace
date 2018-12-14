package gk.ngando.produit.test;

import gk.ngando.produit.domain.Produit;
import gk.ngando.produit.domain.ProduitFugace;
import gk.ngando.produit.domain.ProduitPerissable;
import gk.ngando.produit.domain.ProduitSaisonnier;

import java.util.Calendar;
import java.util.Date;

public class ProduitTest {

	public static void main(String[] args) {
		Produit produit1 = new Produit("produit100");
		produit1.setPrix(1);
		produit1.modifLibelle("Crayon", "Crayon de papier");

		Produit produit2 = new Produit("produit200");
		produit2.setPrix(2);
		produit2.modifLibelle("Crayon", "Crayon de couleur");

		ProduitPerissable produit3 = new ProduitPerissable("produit300");
		produit3.setPrix(3);
		produit3.modifLibelle("Pack de lait",
				"Carton de lait contenant 6 boîtes");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 4);
		Date dateFabrication = cal.getTime();
		produit3.setDateFabrication(dateFabrication);
		produit3.setDureeConservation(7);

		ProduitSaisonnier produit4 = new ProduitSaisonnier("produit400");
		produit4.modifLibelle("Gants rouges",
				"Paire de gant en laine de couleur rouge");
		produit4.setPrix(5);
		produit4.setSaison("Hivers");
		produit4.setRemise(1);

		ProduitFugace produit5 = new ProduitFugace("produit500");
		produit5.modifLibelle("Fine de claire",
				"Huitres fines de claire taille2");
		produit5.setPrix(9);
		produit5.setRemise(8);

		Produit[] produits = new Produit[5];
		produits[0] = produit1;
		produits[1] = produit2;
		produits[2] = produit3;
		produits[3] = produit4;
		produits[4] = produit5;

		for (int i = 0; i < produits.length; i++) {
			System.out.println("Affichage " + i + " : " + produits[i].getCode()
					+ " " + produits[i].afficheLibelle() + " "
					+ produits[i].getPrix() + "€");
		}

	}
}
