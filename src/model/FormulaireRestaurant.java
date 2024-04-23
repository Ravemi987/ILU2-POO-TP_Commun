package model;

public class FormulaireRestaurant extends Formulaire {
	private int jour;
	private int mois;
	private int numEntite;
	private int nbPersonnes;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nbPersonnes = nbPers;
		this.numService = numService;
		numEntite = 0;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public void setIdentificationEntite(int i) {
		this.numEntite = i;
	}

}
