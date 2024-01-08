package demo;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * @author: "MOussa 
 * */

public class Main {
/*
 * CIem
 */
	public static void main(String[] args) {
		System.out.println("EXERCICE 1: Annee Bissextile");
		
		int annee = 2033;
		
		if ((annee%4==0 && annee %100 != 0) || annee %400==0) {
			System.out.println("\t L'année " +annee +" est une année bissextile");
		} else {
			System.out.println("\t L'année " +annee +" n'est pas une année bissextile");
		}
		
		System.out.println("EXERCICE 2: Tableau semaine");
		System.out.println("Version 1 : tableau classique");
		String [] semaine = {"Lundi","Mar","Mercredi","Jeudi","Vendredi","Samedi","Dimanc"};
		// 1- Retirer la dernière valeur du tableau
		String [] nouvelle = new String [semaine.length-1];
		
		System.out.println(Arrays.toString(semaine));
		System.out.println(nouvelle);
		
		System.out.println("Version 2: collection : ArrayList");
		ArrayList<String> semaine1 = new ArrayList<>();
		semaine1.add("Lundi");
		semaine1.add("Mar");
		semaine1.add("Mercredi");
		semaine1.add("Jeudi");
		
		ArrayList<String> semaine2 = new ArrayList<>(
				Arrays.asList(
						"Lundi","Mar","Mercredi","Jeudi","Vendredi",
						"Samedi", "Dimanc"));
		// 1.	Retirer la dernière valeur du tableau
		semaine2.remove(semaine2.size()-1);
		
		// 2.	Afficher les valeurs du tableau
		System.out.println(semaine2);
		
		// 3.	Ajouter  la valeur ‘dimanche’ à la fin du tableau
		semaine2.add("Dimanche");
		System.out.println(semaine2);
		// 4.	Remplacer le mar par mardi
		//semaine2.set(1, "Mardi");
		System.out.println(semaine2.indexOf("Mardi"));
		semaine2.set(semaine2.indexOf("Mar"), "Mardi");
		// 5.	Afficher le nombre de valeurs du tableau
		System.out.println(semaine2.size());
		
		// 6.	Afficher la 5éme valeur
		System.out.println(semaine2.get(4));
		
		
		System.out.println(semaine2);
	}
	
}
