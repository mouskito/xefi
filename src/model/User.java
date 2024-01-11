package model;

public class User {

	private String prenom;
	private String nom;
	private String email;
	private String pwd;
	
	
	public User(String prenom, String nom, String email, String pwd) {
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.pwd = pwd;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
