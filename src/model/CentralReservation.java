package model;

public class CentralReservation <E extends EntiteReservable<F>, F extends Formulaire> {
	private E[] tabEntites;
	private int nbEntites;
	
	public CentralReservation(E[] tabEntites) {
		this.tabEntites = tabEntites;
		nbEntites = 0;
	}
	
	public int ajouterEntite(E entite) {
		tabEntites[nbEntites++] = entite;
		return nbEntites;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] tabDispo = new int[nbEntites];
		for (int i = 0; i < nbEntites; i++) {
			if (tabEntites[i].compatible(formulaire)) {
				tabDispo[i] = tabEntites[i].getIdentificationEntite();
			} else {
				tabDispo[i] = 0;
			}
		}
		return tabDispo;
	}
	
	public Reservation reserver(int idEntite, F formulaire) {
		for (int i = 0; i < nbEntites; i++) {
			if (tabEntites[i].getIdentificationEntite() == idEntite) {
				formulaire.setIdentificationEntite(idEntite);
				return tabEntites[i].reserver(formulaire);
			}
		}
		return null;
	}
}
