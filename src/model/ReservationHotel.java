package model;

public class ReservationHotel extends Reservation {
	private int jour;
	private int mois;
	private int nbLitsSimples;
	private int nbLitsDoubles;
	private int numChambre;
	
	 public ReservationHotel(int jour, int mois, int litsSimples, int litsDoubles, int numChambre) {
		super(jour, mois);
		this.nbLitsSimples = litsSimples;
		this.nbLitsDoubles = litsDoubles;
		this.numChambre = numChambre;
	 }
	 
	 @Override
	 public String toString() {
		 return super.toString() + "n°" + numChambre + " pour " 
				 + nbLitsSimples + " lits simples et "
				 + nbLitsDoubles + " lits doubles.\n";
	 }
}
