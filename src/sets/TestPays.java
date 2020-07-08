package sets;

import java.util.HashSet;
import java.util.Set;
import sets.Pays;

public class TestPays {

	private static double getPIBTotal(Pays premierPaysDuSet) {
		return premierPaysDuSet.getPibParHabitant() * premierPaysDuSet.getNbHabitants();
	}
	
	public static void main(String[] args) {
		Set<Pays> setPays = new HashSet<>();
		setPays.add(new Pays("USA", 330.0, 63.0));
		setPays.add(new Pays("France", 67.0, 41.5));
		setPays.add(new Pays("Allemagne", 83.0, 47.6));
		setPays.add(new Pays("UK", 66.0, 42.9));
		setPays.add(new Pays("Italie", 60.0, 34.4));
		setPays.add(new Pays("Japon", 126.0, 39.2));
		setPays.add(new Pays("Chine", 1390.0, 9.7));
		setPays.add(new Pays("Russie", 144.0, 11.2));
		setPays.add(new Pays("Inde", 1350.0, 2.0));

		Pays premierPaysDuSet = setPays.iterator().next();
		double plusGrandPIBparHabitant = premierPaysDuSet.getPibParHabitant();
		double plusGrandPIBTotal = getPIBTotal(premierPaysDuSet);
		double plusPetitPIBTotal = getPIBTotal(premierPaysDuSet);
		
		Pays paysAvecPlusGrandPIBparHabitant = new Pays();
		Pays paysAvecPlusGrandPIB = new Pays();
		Pays paysAvecPlusPetitPIB = new Pays();
		for (Pays pays : setPays) {
			if (pays.getPibParHabitant() > plusGrandPIBparHabitant) {
				paysAvecPlusGrandPIBparHabitant = pays;
				plusGrandPIBparHabitant = pays.getPibParHabitant();
			}
			
			double paysPIB = getPIBTotal(pays);
			if (paysPIB > plusGrandPIBTotal) {
				paysAvecPlusGrandPIB = pays;
				plusGrandPIBTotal = paysPIB;
			}
			
			if (paysPIB < plusPetitPIBTotal) {
				paysAvecPlusPetitPIB = pays;
				plusPetitPIBTotal = paysPIB;
			}
		}
		System.out.println("Pays avec le plus grand PIB par hab : " + paysAvecPlusGrandPIBparHabitant.getNom() + " avec " + plusGrandPIBparHabitant);
		System.out.println("Pays avec le plus grand PIB : " + paysAvecPlusGrandPIB.getNom() + " avec " + plusGrandPIBTotal);
		paysAvecPlusPetitPIB.setNom(paysAvecPlusPetitPIB.getNom().toUpperCase());
		for (Pays pays : setPays) {
			System.out.println(pays.getNom());
		}
		System.out.println("");
		setPays.remove(paysAvecPlusPetitPIB);
		System.out.println(setPays);
		for (Pays pays : setPays) {
			System.out.println("Nom du pays : " + pays.getNom() + " | Nombre d'hab. en Millions : " + pays.getNbHabitants() + " | PIB : " + pays.getNbHabitants()*pays.getPibParHabitant());
		}
	}

	

}
