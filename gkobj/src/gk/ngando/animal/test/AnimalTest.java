package gk.ngando.animal.test;

import gk.ngando.animal.domain.Chat;
import gk.ngando.animal.domain.Chien;

public class AnimalTest {

	public static void main(String[] args) {
		Chat chat = new Chat();
		Chien chien = new Chien();

		// Animal chien2 = new Chien();

		System.out.println(chat.communiquer());
		System.out.println(chien.communiquer());
	}

}
