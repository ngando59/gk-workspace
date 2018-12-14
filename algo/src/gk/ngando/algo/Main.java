package gk.ngando.algo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static boolean estPalindrome(String str) {
		boolean result = true;
		int nbCaracteres = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((Character.isAlphabetic(c)) || (Character.isDigit(c))) {
				nbCaracteres++;
			}
		}
		char[] lettres = new char[nbCaracteres];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((Character.isAlphabetic(c)) || (Character.isDigit(c))) {
				lettres[i] = c;
			}
		}
		if (lettres.length == 1) {
			return true;
		} else if ((lettres.length % 2) == 0) {
			for (int i = 0; i <= lettres.length; i++) {
				if (lettres[i] != lettres[lettres.length - i]) {
					return false;
				}
			}
		} else {
			for (int i = 0; i <= (lettres.length / 2) - 1; i++) {
				if (lettres[i] != lettres[lettres.length - i]) {
					return false;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "NON";
		System.out.println("Palindrome ?" + estPalindrome(str));

	}

}
