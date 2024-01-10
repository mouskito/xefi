package crud;

import java.util.Scanner;

import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Choisissez un nombre.");
		//Scanner scanner = new Scanner(System.in);
		//String nom = scanner.next();

		
		//CRUD --- C --> create
		//User user = new User("Bart",nom,"test@test","test");
		
		UserDao userDao = new UserDao();
		
		/*
		if (userDao.create(user) != null) {
			System.out.println("Bravo, "+user.getPrenom() + " ton compte a été créé");
		} else {
			System.err.println("Oups, ");
		}*/
		
		userDao.read();

	}

}
