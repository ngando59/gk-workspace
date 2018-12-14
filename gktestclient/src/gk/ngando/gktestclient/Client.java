package gk.ngando.gktestclient;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Client implements Serializable {
	private int numeroClient;
	private String nom;
	private String telephone;
	private transient int age;

	public Client() {
		super();
	}

	public Client(int numeroClient) {
		super();
		this.numeroClient = numeroClient;
	}

	public int getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return this.getNumeroClient() + " | " + this.getNom() + " | "
				+ this.getTelephone() + " | " + this.getAge() + " ans";
	}
}
