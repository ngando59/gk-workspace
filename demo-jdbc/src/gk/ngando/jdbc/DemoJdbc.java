package gk.ngando.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class DemoJdbc {

	static String nomDriverMySQL = "com.mysql.jdbc.Driver";
	static String nomURL = "jdbc:mysql://localhost:3306/basesql";
	static Scanner in = new Scanner(System.in);
	static Connection connex;
	static PreparedStatement preparedStatement;

	public static void getIngenieurByVille(String ville) {
		String requeteSQL = "SELECT mle, nom, ville FROM Ingenieur WHERE ville = ?";
		try {
			Class.forName(nomDriverMySQL);
			connex = DriverManager.getConnection(nomURL, "root", "");
			preparedStatement = (PreparedStatement) connex
					.prepareStatement(requeteSQL);
			preparedStatement.setString(1, ville);
			ResultSet resultat = preparedStatement.executeQuery();
			while (resultat.next()) {
				System.out.println(" Matricule : " + resultat.getInt("mle")
						+ " - Nom : " + resultat.getString("nom")
						+ " - Ville : " + resultat.getString("Ville"));
			}
			connex.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Probl�me ClassNotFoundException");
			System.out.println("Erreur SQL : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Probl�me ClassNotFoundException");
			System.out.println("Erreur SQL : " + e.getMessage());
			System.out.println("State : " + e.getSQLState());
			System.out.println("Code : " + e.getErrorCode());
		}
	}

	public static void main(String[] args) {
		System.out.print("Entrez ville : ");
		String reponse = in.nextLine();
		getIngenieurByVille(reponse);
	}
}
