package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.Db;
import model.User;

public class UserDao implements IDao {

	Connection connect = Db.getConnection();
	PreparedStatement sql;
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
