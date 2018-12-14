package gk.ngando.produit.test;

import gk.ngando.produit.domain.Client;

public class ClientTest {

	public static void main(String[] args) {
		Client client1 = new Client(1000);
		client1.setRaisonSociale("Société A");
		client1.setTelephone("0102030405");
		System.out.println(client1.afficheInfo());
	}

}
