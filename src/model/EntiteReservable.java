package model;

public class EntiteReservable <F extends Formulaire, T> {
	private F formulaire;
	protected CalendrierAnnuel carnetReservation;
	private int id;
	private T entite;
	
	public EntiteReservable(T entite) {
		this.entite = entite;
		carnetReservation = new CalendrierAnnuel();
		id = 0;
	}
	
	public int getIdentificationEntite() {
		return id;
	}
	
	public void setIdentificationEntite(int i) {
		this.id = i;
	}
	
	public boolean estLibre() {
		return carnetReservation.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
}
