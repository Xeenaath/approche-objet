package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> listePays = new ArrayList<>();
		Pays pays1 = new Pays("France", 65_000_000, "Europe");
		Pays pays2 = new Pays("Allemagne", 80_000_000, "Europe");
		Pays pays3 = new Pays("Belgique", 10_000_000, "Europe");
		Pays pays4 = new Pays("Russie", 150_000_000, "Asie");
		Pays pays5 = new Pays("Chine", 1_400_000_000, "Asie");
		Pays pays6 = new Pays("Indonesie", 220_000_000, "Oceanie");
		Pays pays7 = new Pays("Australie", 20_000_000, "Oceanie");
		listePays.add(pays1);
		listePays.add(pays2);
		listePays.add(pays3);
		listePays.add(pays4);
		listePays.add(pays5);
		listePays.add(pays6);
		listePays.add(pays7);
		
		// 1 : on initialise une map
		
		HashMap<String, Integer> mapPaysParContinent = new HashMap<>();
		
		// 2 : on parcourt la liste de pays
		for (Pays pays : listePays) {
			
			// 3 : on regarde s'il existe déjà un compteur pour le continent du pays
			Integer compteur = mapPaysParContinent.get(pays.getContinent());
			
			// 4a : s'il n'existe pas, on l'initialise à 1
			if(compteur == null) {
				mapPaysParContinent.put(pays.getContinent(), 1);
			}
			// 4b : s'il existe on incrémente ce compteur et on le restocke dans la map avec sa nouvelle valeur
			else {
				compteur++;
				mapPaysParContinent.put(pays.getContinent(), compteur);

			}
		}
		
		System.out.println(mapPaysParContinent);






	}

}
