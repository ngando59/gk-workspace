package gk.ngando.tpjdbc.ingenieur.dao;

import gk.ngando.tpjdbc.ingenieur.business.IngenieurDAO;

public abstract class DaoFactory {

	public enum TypeDAO {
		MSACCESS, ORACLE, DB2_AS400, MYSQL
	};

	public abstract IngenieurDAO getIngenieurDAO();

	// public abstract ProjetDAO getProjetDAO();

	public static DaoFactory getDAOFactory(TypeDAO type) {
		switch (type) {
		case MSACCESS:
			// return new MSAccessDAOFactory();
			return null;
		case ORACLE:
			// return new OracleDAOFactory();
			return null;
		case MYSQL:
			return new MySQLDAOFactory();
		default:
			return null;
		}
	}

}
