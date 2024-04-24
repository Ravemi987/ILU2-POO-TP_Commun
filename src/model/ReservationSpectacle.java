package model;

public class ReservationSpectacle extends Reservation {
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int zone, int chaise) {
		super(jour, mois);
		this.numZone = zone;
		this.numChaise = chaise;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Chaise n�" + numChaise + " r�serv�e dans la zone " + numZone + ".\n ";
	}
}
