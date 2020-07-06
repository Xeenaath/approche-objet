package sets;

import java.util.HashSet;
import java.util.Set;
import sets.Pays;

public class TestPays {

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

		double plusGrandPIBparHabitant = 0.0;
		double plusGrandPIBtotal = 0.0;
		Pays paysAvecPlusGrandPIB;
		for (Pays pays : setPays) {
			if (pays.getPibParHabitant() > plusGrandPIBparHabitant) {
				paysAvecPlusGrandPIB = pays;
			}
		}
	}

}
