package falreLePlein;

public class Voiture extends Vehicule {
	public Voiture(int vitesseMax, String typeCarburant, int contenanceReservoir, int contenuReservoir) {
		super(vitesseMax, typeCarburant, contenanceReservoir, contenuReservoir);
		// TODO Auto-generated constructor stub
		super.nbRoues =4;
	}
}
