package model;

public class ReservationRestaurant extends Reservation {
	private int jour;
	private int mois;
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		this.jour = jour;
		this.mois = mois;
		this.numService = numService;
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		String service;
		switch (numService) {
		case 1: {
			service = "premier";
			break;
		}
		case 2: {
			service = "deuxième";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + numService);
		}
		return "Le " + jour + "/" + mois +"\nTable " + numTable + " pour le " + service + " service.";
	}
	
	public static void main(String[] args) {
		ReservationRestaurant res = new ReservationRestaurant(10, 12, 1, 2);
		System.out.println(res.toString());
	}
}
