package recensement;

import java.util.Comparator;

import recensement.Ville;

public class ComparatorPopulation implements Comparator<Ville>{
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getPopulation() > ville2.getPopulation()) {
			return 1;
		}
		if (ville1.getPopulation() < ville2.getPopulation()) {
			return -1;
		}
		return 0;
	}
}
