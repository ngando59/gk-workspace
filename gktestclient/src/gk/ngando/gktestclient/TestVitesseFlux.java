package gk.ngando.gktestclient;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestVitesseFlux {

	public static void main(String[] args) {
		FileInputStream fis;
		BufferedInputStream bis;
		try {
			fis = new FileInputStream(new File("C://test.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File(
					"C://test.txt")));
			byte[] buf = new byte[8];
			long startTime = System.currentTimeMillis();
			while (fis.read(buf) != -1)
				;
			System.out.println("Temps de lecture avec FileInputStream : "
					+ (System.currentTimeMillis() - startTime));
			startTime = System.currentTimeMillis();
			while (bis.read(buf) != -1)
				;
			System.out.println("Temps de lecture avec BufferedInputStream : "
					+ (System.currentTimeMillis() - startTime));
			fis.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
