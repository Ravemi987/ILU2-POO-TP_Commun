package model;

public class ReservationSpectacle extends Reservation {
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int zone, int chaise) {
		this.jour = jour;
		this.mois = mois;
		this.numZone = zone;
		this.numChaise = chaise;
	}
	
	@Override
	public String toString() {
		return "Le " + jour + "/" + mois + "\nchaise n°" + numChaise + " réservée dans la zone " + numZone + ".\n ";
	}
}
