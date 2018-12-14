package gk.ngando.tpjdbc.ingenieur.dao;

import gk.ngando.tpjdbc.ingenieur.business.IngenieurDAO;
import gk.ngando.tpjdbc.ingenieur.business.impl.IngenieurDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDAOFactory extends DaoFactory {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String host = "jdbc:mysql://localhost:3306/";
	private static String database = "basesql";
	private static String user = "root";
	private static String password = "";

	public static Connection createConnection() throws SQLException {
		System.setProperty("jdbc.drivers", driver);
		return DriverManager.getConnection(host + database, user, password);
	}

	@Override
	public IngenieurDAO getIngenieurDAO() {
		return new IngenieurDAOImpl();
	}

}
