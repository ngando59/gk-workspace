package gk.ngando.gktestclient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestClient {
	public static void writeClients() throws IOException {
		Client client1 = new Client();
		client1.setNom("Dupontsansn�age10");
		client1.setTelephone("0123456789");
		client1.setAge(10);
		System.out.println(client1);
		Client client2 = new Client(100);
		client2.setNom("AvecNum");
		client2.setAge(20);
		System.out.println(client2);
		FileOutputStream fos = new FileOutputStream("C://test");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(client1);
		oos.writeObject(client2);
		oos.close();
		fos.close();
	}

	public static void readClients() throws IOException {

	}

	public static void main(String[] args) {

	}
}
