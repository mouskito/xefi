package falreLePlein;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture voiture = new Voiture(250,"Diesel",50,30);
		
		Pompe pompe1 = new Pompe("Diesel", 2500,500);

		
		System.out.println("Avant Faire le plein \n \t Contenance " 
		+voiture.contenanceReservoir()+" "
				+ " Contenu " +voiture.contenuReservoir());
		//System.out.println(voiture);
		
		// Appel methode fairePlein
				voiture.fairePlein(pompe1);
				
		System.out.println("Apres Faire le plein \n \t Contenance " +voiture.contenanceReservoir()+" "
						+ " Contenu " +voiture.contenuReservoir());
	
		Db.getConnection();
	}

}
