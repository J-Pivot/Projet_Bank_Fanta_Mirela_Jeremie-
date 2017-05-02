package com.ib.beans;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class UserCons {

	// cette fonction permet d'ajouter des comptes utilisateurs
	
	public static void Ajout_Account(String External_ID,String firstname,String lastname,String email,String password,String dob,String phone){
        Connection cnx = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            
            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test","root","root");
            System.out.println("Connexion ok");
            
            Statement stat = (Statement)cnx.createStatement();
            System.out.println("Statement ok");
            System.out.println("------------------");
          
           String query = "INSERT INTO sac_person (person_external_id,person_firstname,person_lastname,person_email,person_password,person_dob,person_phone_number) VALUES (?,?,?,?,?,?,?)";
           PreparedStatement preparedStmt = (PreparedStatement) cnx.prepareStatement(query);
           
           preparedStmt.setString(1, External_ID);
           preparedStmt.setString(2, firstname);
           preparedStmt.setString(3, lastname);
           preparedStmt.setString(4, email);
           preparedStmt.setString(5, password);
           preparedStmt.setString(6, dob);
           preparedStmt.setString(7, phone);
           
           
           preparedStmt.executeUpdate();
            
            
            ResultSet resultat = stat.executeQuery("person_external_id,person_firstname,person_lastname,person_email,person_password,person_dob,person_phone_number");
          
            
            resultat.close();
            stat.close();
            cnx.close();
            
        }catch(Exception e){
            System.out.println("erreur");
        }
	}
	
	//ajout d'un compte client
	public static void Ajout_Account_Customer(String account_customer_id,float account_balance,String account_type,int account_is_default){
        Connection cnx = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            
            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test","root","root");
            System.out.println("Connexion ok");
            
            Statement stat = (Statement)cnx.createStatement();
            System.out.println("Statement ok");
            System.out.println("------------------");
          
           String query = "INSERT INTO sac_accounts (account_customer_id,account_balance,account_type,account_is_default) VALUES (?,?,?,?)";
           PreparedStatement preparedStmt = (PreparedStatement) cnx.prepareStatement(query);
           
           preparedStmt.setString(1, account_customer_id);
           preparedStmt.setFloat(2, account_balance);
           preparedStmt.setString(3, account_type);
           preparedStmt.setInt(4, account_is_default);
           
           
           preparedStmt.executeUpdate();
            
            
            ResultSet resultat = stat.executeQuery("account_customer_id,account_balance,account_type,account_is_default");
          
            
            resultat.close();
            stat.close();
            cnx.close();
            
        }catch(Exception e){
            System.out.println("erreur");
        }
	}

	// Fonction de suppression de compte
	public static void Suppr_Account(String External_ID){
        Connection cnx = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            
            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test","root","root");
            System.out.println("Connexion ok");
            
            Statement stat = (Statement)cnx.createStatement();
            System.out.println("Statement ok");
            System.out.println("------------------");
          
           String query = "DELETE FROM sac_person WHERE person_external_id='?'";
           PreparedStatement preparedStmt = (PreparedStatement) cnx.prepareStatement(query);
           
           preparedStmt.setString(1, External_ID);
           
           
           preparedStmt.executeUpdate();
            
            
            ResultSet resultat = stat.executeQuery("person_external_id");
		
            
            resultat.close();
            stat.close();
            cnx.close();
            
        }catch(Exception e){
            System.out.println("erreur");
        }
	}

	// Fonction de visibilité de compte
	public static void See_Account(int person_advisor_id){
        Connection cnx = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            
            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test","root","root");
            System.out.println("Connexion ok");
            
            Statement stat = (Statement)cnx.createStatement();
            System.out.println("Statement ok");
            System.out.println("------------------");
          
           String query = "SELECT * FROM sac_person WHERE person_advisor_id='?'";
           PreparedStatement preparedStmt = (PreparedStatement) cnx.prepareStatement(query);
           
           preparedStmt.setLong(1, person_advisor_id);
           
           
           preparedStmt.executeUpdate();
            
            
            ResultSet resultat = stat.executeQuery("*");

            
            resultat.close();
            stat.close();
            cnx.close();
            
        }catch(Exception e){
            System.out.println("erreur");
        }
	}

}
