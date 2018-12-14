package gk.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Ecrire {

	static Scanner in = new Scanner(System.in);

	public static String lire() {
		String str = "";
		System.out.print("Ecris un truc : ");
		str = in.nextLine();
		return str;
	}

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:\\test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			boolean encore = true;
			while (encore) {
				String str = lire();
				bw.newLine();
				bw.write(str);
				System.out.println("Ecrire ? O/N : ");
				String rep = in.next();
				if (rep.equals("o") || (rep.equals("O"))) {
					encore = true;
				} else {
					encore = false;
				}
			}
			bw.close();
		} catch (Exception e) {
			System.out.println("Erreur " + e);
		}
	}
}
