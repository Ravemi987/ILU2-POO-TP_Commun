package model;

public class CalendrierAnnuel {
	private Mois[] tabMois = new Mois[12];
	
	public CalendrierAnnuel() {
		tabMois[0] = new Mois("Janvier", 31);
		tabMois[1] = new Mois("Février", 28);
		tabMois[2] = new Mois("Mars", 31);
		tabMois[3] = new Mois("Avril", 30);
		tabMois[4] = new Mois("Mai", 31);
		tabMois[5] = new Mois("Juin", 30);
		tabMois[6] = new Mois("Juillet", 31);
		tabMois[7] = new Mois("Août", 31);
		tabMois[8] = new Mois("Septembre", 30);
		tabMois[9] = new Mois("Octobre", 31);
		tabMois[10] = new Mois("Novembre", 30);
		tabMois[11] = new Mois("Décembre", 31);
	}
	
	public boolean estLibre(int jour, int mois) {
		return tabMois[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		boolean estReservable = false;
		try {
			tabMois[mois-1].reserver(jour);
			estReservable = true;
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		return estReservable;
	}
	
	private class Mois {
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
			for (int i = 0; i < jours.length; i++)
				jours[i] = true;
		}
		
		private boolean estLibre(int jour) {
			return jours[jour-1];
		}
		
		private boolean reserver(int jour) throws IllegalStateException {
			if (estLibre(jour)) {
				jours[jour-1] = false;
				return true;
			} else {
				throw new IllegalStateException();
			}
		}
	}
}
