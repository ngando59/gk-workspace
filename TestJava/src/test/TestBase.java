package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBase {

	public static void main(String[] args) {
		String nomDriverMySQL = "com.mysql.jdbc.Driver";
		String nomURL = "jdbc:mysql://localhost:3306/basesql";
		String requeteSQL = "SELECT mle, nom, datnais, notel  FROM Ingenieur";
		Connection connex;
		Statement requete;
		ResultSet resultat;
		try{
			// Enregistrement du driver
			Class.forName(nomDriverMySQL);
			
			// Connexion
			connex = DriverManager.getConnection(nomURL, "root", "");
			// Cr�ation d'un objet requ�te
			requete = connex.createStatement();
			
			//Ex�cution de la requ�te � partir d'une requ�te SQL
			resultat = requete.executeQuery(requeteSQL);
			
			// Exploitation du resultset
			while (resultat.next())
			{
			System.out.println(" Matricule : " + resultat.getInt("mle")
			+    " - Nom : " + resultat.getString("nom")
			+    " - Num�ro de t�l�phone : " + resultat.getString("notel")
			+    " - Date de naissance : " + resultat.getDate("datnais"));
			}	
			// Fermeture de la connexion
			connex.close();	} 
		catch (ClassNotFoundException e)
		{
			System.out.println("Probl�me ClassNotFoundException");
			System.out.println("Erreur SQL : " + e.getMessage());
		}
		catch (SQLException e)
		{
			System.out.println("Probl�me ClassNotFoundException");
			System.out.println("Erreur SQL : " + e.getMessage());
			System.out.println("State      : " + e.getSQLState());
			System.out.println("Code       : " + e.getErrorCode());
		}
	}

}
