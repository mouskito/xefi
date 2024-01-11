package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connect.Db;
import model.User;

public class UserDao implements IDao {

	Connection connect = Db.getConnection();
	PreparedStatement sql;
	
	public static User currentUser ;
	

	/*
	 * Check si le mail passé en param existe dans la BDD
	 * Cette méthode retourne TRUE sil existe sinon elle retourne FALSE
	 */
	public Boolean isExist(String email) {
		
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM user WHERE email=?");//test@test.fr
			
			sql.setString(1, email);
			
			ResultSet rs = sql.executeQuery();
			
			
			if (rs.next()) {
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public User connection(String email, String pwd) {
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM user WHERE email=? AND pwd=PASSWORD(?)");
			
			sql.setString(1, email);
			sql.setString(2, pwd);
			
			System.out.println(sql);
			ResultSet rs = sql.executeQuery();
			if (rs.next()) {
				
				currentUser = new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("pwd"));
				//currentUser = userLogged;
				System.out.println(currentUser);
				return currentUser;
				//return new User(rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),pwd);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Boolean create(User objet) {
		
		try {
			 sql = connect.prepareStatement("INSERT INTO user "
					+ "(prenom,nom, email,pwd) VALUES (?,?,?,PASSWORD(?))");
			
			sql.setString(1, objet.getPrenom());
			sql.setString(2, objet.getNom());
			sql.setString(3, objet.getEmail());
			sql.setString(4, objet.getPwd());

			sql.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	

}
