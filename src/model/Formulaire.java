package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int id;
	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
		this.id = 0;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getIdentificationEntite() {
		return id;
	}
	
	public void setIdentificationEntite(int i) {
		this.id = i;
	}
}
