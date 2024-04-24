package model;

public class FormulaireSpectacle extends Formulaire {
	private int jour;
	private int mois;
	private int numZone;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour, mois);
		this.numZone = numZone;
	}
	
	public int getNumZone() {
		return numZone;
	}
}
