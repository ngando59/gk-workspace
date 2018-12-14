package gk.test.domain;

import java.io.File;

public class Listeur {

	public static void litrep(File rep) {
		File r2;
		if (rep.isDirectory()) {
			String t[] = rep.list();
			for (int i = 0; i < t.length; i++) {
				r2 = new File(rep.getAbsolutePath() + "\\" + t[i]);
				if (r2.isDirectory())
					litrep(r2);
				else
					System.out.println(r2.getAbsolutePath());
			}
		}

	}

	public static void main(String[] args) {
		litrep(new File("c:\\"));
	}
}
