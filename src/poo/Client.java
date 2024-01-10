package poo;

public class Client {
	
	//Les attributs
	private String prenom;
	private String nom ;
	private String email;
	private String pwd;
	
	public Client(String nouveau, String password) {
		this.setNom(nouveau);
		this.setPwd(password);
	}
	public Client() {
		
	}
	
	public Client(String nouveau, String password,String prenom) {
		this.setNom(nouveau);
		this.setPwd(password);
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString() {
		return prenom +""+getNom()+""+email;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
