package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville1 = new Ville("Nice", 343_000);
		Ville ville2 = new Ville("Carcassonne", 47_800);
		Ville ville3 = new Ville("Narbonne", 53_400);
		Ville ville4 = new Ville("Lyon", 484_000);
		Ville ville5 = new Ville("Foix", 9_700);
		Ville ville6 = new Ville("Pau", 77_200);
		Ville ville7 = new Ville("Marseille", 850_700);
		Ville ville8 = new Ville("Tarbes", 40_600);
		
		List<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(ville1);
		listeVilles.add(ville2);
		listeVilles.add(ville3);
		listeVilles.add(ville4);
		listeVilles.add(ville5);
		listeVilles.add(ville6);
		listeVilles.add(ville7);
		listeVilles.add(ville8);
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
		for (Ville ville : listeVilles) {
			mapVilles.put(ville.getNom(), ville);
		}
		
		System.out.println(mapVilles);
		
		int minHabitants = mapVilles.values().iterator().next().getNbHabitants();
		String villeMoinsPeuplee = "";
		for (String key : mapVilles.keySet()) {
			int nbHabitants = mapVilles.get(key).getNbHabitants();
			if (minHabitants > nbHabitants) {
				minHabitants = nbHabitants;
				villeMoinsPeuplee = key;
			}
		}
		
		System.out.println(villeMoinsPeuplee);
		mapVilles.remove(villeMoinsPeuplee);
		System.out.println(mapVilles);
	}

}
