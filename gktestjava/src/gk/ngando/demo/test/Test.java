package gk.ngando.demo.test;

import gk.ngando.demo.domain.ThreadAffichageCompteur;

public class Test {
	static int un, deux;

	static int ajouter(int a, String str) throws Exception {
		int c = 0;
		int b = Integer.parseInt(str);
		c = a + b;
		return c;
	}

	public static void main(String[] agrs) {
		/*
		 * Boolean ok = true; char monChar; double monDouble; int resultat;
		 * 
		 * un = 1; deux = 2;
		 * 
		 * resultat = un + deux; monChar = 'A'; monDouble = 100;
		 * 
		 * System.out.println("int " + resultat + " valeur du bool�en : " + ok);
		 * System.out.println("Char " + monChar + " double " + monDouble);
		 */
		// CarteAJouer as = CarteAJouer.AS;
		// CarteAJouer roi = CarteAJouer.ROI;
		// CarteAJouer valet = CarteAJouer.VALET;
		//
		// if (roi.compareTo(as) < 0) {
		// System.out.println("roi avant as " + roi.compareTo(as));
		// }
		// if (roi.compareTo(valet) > 0) {
		// System.out.println("roi apr�s valet " + roi.compareTo(valet));
		// }
		// System.out.println(roi.compareTo(roi));
		//
		// PointCard direction = PointCard.EST;
		// if (!direction.equals(PointCard.SUD)) {
		// System.out.println("direction " + direction);
		// switch (direction) {
		// case SUD:
		// System.out.println("BIMMMMMMMMM");
		// break;
		// case OUEST:
		// System.out.println("les chapeaux ronds");
		// break;
		// default:
		// System.out.println("Vive les bretons");
		// break;
		// }
		// }
		// String s;
		// boolean b;
		// int i;
		// long l;
		// float f;
		// double d;
		//
		// s = "false";
		// b = new Boolean(s).booleanValue();
		// System.out.println("b->" + b);
		//
		// s = "1234";
		// i = Integer.parseInt(s);
		// System.out.println("i->" + i);
		// System.out.println("i->" + new Integer(s).intValue());
		// ;
		//
		// s = "6789";
		// l = Long.parseLong(s);
		// System.out.println("l->" + l);
		//
		// s = "6.78";
		// f = new Float(s).floatValue();
		// System.out.println("f->" + f);
		//
		// s = "3.1e5";
		// d = new Double(s).doubleValue();
		// System.out.println("d->" + d);
		// Vector maListe = new Vector();
		// for (int i = 0; i < 3; i++) {
		// maListe.addElement(i);
		// }
		//
		// for (char c = 'a'; c < 'i'; c++) {
		// maListe.addElement(c);
		// }
		//
		// for (Object o : maListe) {
		// System.out.println(o);
		// }
		// int a = 0;
		// // ajouter(a, "A22");
		// try {
		// a = ajouter(12, "A22");
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// System.out.println(a);
		ThreadAffichageCompteur ta = new ThreadAffichageCompteur("A", 10);
		ThreadAffichageCompteur tb = new ThreadAffichageCompteur("	B", 5);
		ThreadAffichageCompteur tc = new ThreadAffichageCompteur("		C", 4);

		ta.start();
		tb.start();
		tc.start();
	}
}
