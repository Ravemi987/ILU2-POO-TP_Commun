package model;

public class FormulaireSpectacle extends Formulaire {
	private int jour;
	private int mois;
	private int numEntite;
	private int numZone;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		this.jour = jour;
		this.mois = mois;
		this.numZone = numZone;
		numEntite = 0;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNumZone() {
		return numZone;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public void setIdentificationEntite(int i) {
		this.numEntite = i;
	}

}
