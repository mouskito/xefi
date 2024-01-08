package demo;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Choisissez un mot.");
		Scanner scanner = new Scanner(System.in);
		String choix = scanner.next();

		System.out.println("Voici ton choix: " +choix);
		
		//mot_inverse("Moussa");
		if (choix.equalsIgnoreCase(mot_inverse(choix))) {
			System.out.println(choix +" est un palindrome");
		} else {
			System.err.println(choix + " n'est pas un palindrome");
		}
		//Ternaire
		System.out.println(choix.equalsIgnoreCase(mot_inverse(choix)) ? 
				choix +" est un palindrome"
				: 
					choix +" n'est pas un palindrome"	
				);
		
		//OPTION2: STringBuilder
		System.out.println("StringBulder: Choisissez un mot.");
		Scanner scanner1 = new Scanner(System.in);
		String choix1 = scanner1.next();
	
		StringBuilder builder = new StringBuilder();
		builder.append(choix1);
		builder = builder.reverse();
		
		String mot = builder.toString();
		
		String mot2 = new StringBuilder(choix1).reverse().toString();
		
		if (choix1.equalsIgnoreCase(mot2)) {
			System.out.println("est un palindrome");
		} else {
			System.out.println("n'est pas un palindrome");
		}
	}
	
	public static String mot_inverse(String chaine) {
		 String inverse = "";
		for (int i = 0; i < chaine.length(); i++) {
			inverse += chaine.charAt(chaine.length()-i -1);
		}
		return inverse;
	}
	

	
}
