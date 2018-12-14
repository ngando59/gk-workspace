package gk.ngando.demo.test;

import gk.ngando.demo.domain.Adresse;
import gk.ngando.demo.domain.Client;
import gk.ngando.demo.domain.ClientSociete;

public class TestClient {

	public static void main(String[] args) {
		Client c1 = new Client(1, "Kaaris");
		Client c2 = new Client(2, "Booba");
		ClientSociete c3 = new ClientSociete();
		Adresse adressec3 = new Adresse();
		adressec3.setNumero(14);
		adressec3.setVille("rue de Cond�, Lille");
		c3.setAdresse(adressec3);
		c1.setMails("boobzer@gmail.com");
		String info1 = c1.retourneInfo("Info c1 : ");
		String info2 = c2.retourneInfo("Info c2 : ");
		String info3 = c3.retourneInfo("Info client societe : ");

		System.out.println(info1);
		System.out.println(info2);
		System.out.println(info3);

		if (c1 instanceof Client) {
			System.out.println("c1 est un client");
		}
		if (c3 instanceof Client) {
			System.out.println("c3 est un client");
		}
		if (c1 instanceof ClientSociete) {
			System.out.println("c1 est un client societe");
		} else {
			System.out.println("c1 n'est pas un client societe");
		}

	}
}
