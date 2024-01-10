package falreLePlein;

public class Vehicule implements Ivehicule {

	protected int vitesseMax;
	protected int nbRoues;
	protected String typeCarburant;
	
	protected int contenanceReservoir;
	protected int contenuReservoir;

	
	
	
	public Vehicule(int vitesseMax, String typeCarburant, int contenanceReservoir, int contenuReservoir) {
	
		this.vitesseMax = vitesseMax;
		this.typeCarburant = typeCarburant;
		this.contenanceReservoir = contenanceReservoir;
		this.contenuReservoir = contenuReservoir;
	}


	public void  fairePlein(Pompe pompe) {
		/*
		 *  vérifier qu'on fait le plein à une pompe du même type de carburant que le véhicule
		 */
		if (this.typeCarburant.equalsIgnoreCase(pompe.getTypeCarburant())) {
			System.out.println("Autoriser à faire le plein");
			/*
			 * prend une Pompe en paramètre, qui remplit le réservoir du Véhicule et enlève 
			 * autant d'essence à la Pompe
			 */
			int besoinCarburantVehi = this.contenanceReservoir - this.contenuReservoir;
			
			if (pompe.getContenu() < besoinCarburantVehi) {
				System.out.println("Pas assez de carburant !");
			} else {
				pompe.setContenu(pompe.getContenu() - besoinCarburantVehi);
				this.contenuReservoir += besoinCarburantVehi; 
			}
		}else {
			System.err.println("Pas le meme type carburant !");
		}
		
		
	}



	@Override
	public int nbreRoues() {
		// TODO Auto-generated method stub
		return nbRoues;
	}



	@Override
	public String vitesseMax() {
		// TODO Auto-generated method stub
		return vitesseMax();
	}



	@Override
	public String typeCarburant() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int contenanceReservoir() {
		// TODO Auto-generated method stub
		return contenanceReservoir;
	}



	@Override
	public int contenuReservoir() {
		// TODO Auto-generated method stub
		return contenanceReservoir;
	}
}
