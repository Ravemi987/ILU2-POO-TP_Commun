package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {
	private CentralReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> central;
	
	public Restaurant(int nbTables) {
		return;
	}

	@Override
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation reserver(int idEntite, FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static class Table extends EntiteReservable<FormulaireRestaurant> {

		public Table(CalendrierAnnuel calendrier, FormulaireRestaurant formulaire, int idEntite) {
			super(calendrier, formulaire, idEntite);
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
