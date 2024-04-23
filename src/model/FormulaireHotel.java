package model;

public class FormulaireHotel extends Formulaire {
	private int jour;
	private int mois;
	private int numEntite;
	private int nbLitsSimples;
	private int nbLitsDoubles;
	
	public FormulaireHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles) {
		this.jour = jour;
		this.mois = mois;
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		numEntite = 0;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNbLitsSimples() {
		return nbLitsSimples;
	}
	
	public int getNbLitsDoubles() {
		return nbLitsDoubles;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public void setIdentificationEntite(int i) {
		this.numEntite = i;
	}

}
