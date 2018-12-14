package gk.ngando.gestioncompte.compte;

@SuppressWarnings("serial")
public class CompteException extends Exception {

	public CompteException() {
		super();
	}

	public CompteException(String message) {
		super(message);
	}

	public CompteException(String message, Throwable cause) {
		super(message, cause);
	}

	public CompteException(Throwable cause) {
		super(cause);
	}

}
