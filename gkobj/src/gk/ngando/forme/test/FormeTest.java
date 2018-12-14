package gk.ngando.forme.test;

import gk.ngando.forme.domain.Carre;
import gk.ngando.forme.domain.Forme;
import gk.ngando.forme.domain.Triangle;

public class FormeTest {

	public static void main(String[] args) {
		Forme carre = new Carre();
		Forme triangle = new Triangle();
		System.out.println(carre.aire());
		System.out.println(carre.affiche());
		System.out.println(triangle.aire());
	}

}
