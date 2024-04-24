package model;

public class FormulaireRestaurant extends Formulaire {
	private int jour;
	private int mois;
	private int nbPersonnes;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int numService) {
		super(jour, mois);
		this.nbPersonnes = nbPers;
		this.numService = numService;
	}
	
	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	
	public int getNumService() {
		return numService;
	}
}
