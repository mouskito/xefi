package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connection.Db;
import model.User;

public class UserDao implements IDao<User> {

	//Permet de se connecter à la base de données xefi 
	Connection connect = Db.getConnection();
	
	PreparedStatement sql;
	@Override
	public Boolean create(User objet) {
		
		try {
			sql = connect.prepareStatement("INSERT INTO user "
					+ "(prenom,nom, email,pwd) VALUES (?,?,?,?)");
			
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

	@Override
	public List<User> read() {
		ResultSet rs = null;
		try {
			sql = connect.prepareStatement("SELECT * FROM user");
			rs = sql.executeQuery();
			
			System.out.println("Liste des utilisateurs");
			
			while(rs.next()) {
					System.out.println("\t"+
						rs.getString("id")+ " " +
						rs.getString("prenom")+ " " +
						rs.getString("nom"));
				
			}

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
}
