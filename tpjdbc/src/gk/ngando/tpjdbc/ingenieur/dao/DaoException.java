package gk.ngando.tpjdbc.ingenieur.dao;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class DaoException extends Exception {

	public DaoException(String message) {
		super(message);
	}

	public DaoException() {
		super();
	}

	public DaoException(String message, SQLException cause) {
		super(message, cause);
	}

	public DaoException(SQLException cause) {
		super(cause);
	}

}
