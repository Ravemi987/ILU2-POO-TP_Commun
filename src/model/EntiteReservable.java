package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private F formulaire;
	protected CalendrierAnnuel carnetReservation;
	private int idEntite;
	
	public EntiteReservable(CalendrierAnnuel calendrier, F formulaire, int idEntite) {
		this.carnetReservation = calendrier;
		this.formulaire = formulaire;
		this.idEntite = idEntite;
	}
	
	public int getIdentificationEntite() {
		return idEntite;
	}
	
	public void setIdentificationEntite(int i) {
		this.idEntite = i;
	}
	
	public boolean estLibre() {
		return carnetReservation.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
