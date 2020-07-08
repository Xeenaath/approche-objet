package recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import recensement.Ville;

import org.apache.commons.io.FileUtils;

public class Application {

	private static List<Ville> creerListeVilles(List<String> lignes) {
		// Recensement recensement = new Recensement();
		List<Ville> listeVilles = new ArrayList<Ville>();

		for (int i = 1; i < lignes.size(); i++) {
			String[] morceaux = lignes.get(i).split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			int population = Integer.parseInt(morceaux[7].replace(" ", "").trim());

			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
			listeVilles.add(ville);

		}
		return listeVilles;
	}

	private static Ville getVilleByNomVille(List<Ville> listeVilles, String nomVille) {
		Ville villeRecherchee = new Ville();
		for (Ville ville : listeVilles) {
			if (ville.getNomCommune().equals(nomVille)) {
				villeRecherchee = ville;
			}
		}
		return villeRecherchee;
	}

	private static int getPopulationByDepartement(List<Ville> listeVilles, String codeDepartement) {
		int compteurPopulation = 0;
		for (Ville ville : listeVilles) {
			if (ville.getCodeDepartement().equals(codeDepartement)) {
				compteurPopulation += ville.getPopulation();
			}
		}
		return compteurPopulation;
	}

	private static int getPopulationByRegion(List<Ville> listeVilles, String nomRegion) {
		int compteurPopulation = 0;
		for (Ville ville : listeVilles) {
			if (ville.getNomRegion().equals(nomRegion)) {
				compteurPopulation += ville.getPopulation();
			}
		}
		return compteurPopulation;
	}

	private static Ville getPlusPetiteVilleByDepartement(List<Ville> listeVilles, String codeDepartement) {
		ArrayList<Ville> listeVillesByDepartement = new ArrayList<>();
		for (Ville ville : listeVilles) {
			if (ville.getCodeDepartement().equals(codeDepartement)) {
				listeVillesByDepartement.add(ville);
			}
		}
		Collections.sort(listeVillesByDepartement, new ComparatorPopulation());
		return listeVillesByDepartement.get(0);

	}

	private static List<Ville> get10PlusPetitesVillesByDepartement(List<Ville> listeVilles, String codeDepartement) {

		ArrayList<Ville> listeVillesByDepartement = new ArrayList<>();
		for (Ville ville : listeVilles) {
			if (ville.getCodeDepartement().equals(codeDepartement)) {
				listeVillesByDepartement.add(ville);
			}
		}
		Collections.sort(listeVillesByDepartement, new ComparatorPopulation());

		List<Ville> liste10VillesPlusPetites = listeVillesByDepartement.subList(0, 10);
		return liste10VillesPlusPetites;

	}

	private static List<Ville> get10PlusGrandesVillesByDepartement(List<Ville> listeVilles, String codeDepartement) {
		ArrayList<Ville> listeVillesByDepartement = new ArrayList<>();
		for (Ville ville : listeVilles) {
			if (ville.getCodeDepartement().equals(codeDepartement)) {
				listeVillesByDepartement.add(ville);
			}
		}
		Collections.sort(listeVillesByDepartement, new ComparatorPopulation());

		List<Ville> liste10VillesPlusGrandes = listeVillesByDepartement.subList(listeVillesByDepartement.size() - 10,
				listeVillesByDepartement.size());
		return liste10VillesPlusGrandes;

	}

	private static List<Ville> get10PlusGrandesVillesByRegion(List<Ville> listeVilles, String nomRegion) {
		ArrayList<Ville> listeVillesByRegion = new ArrayList<>();
		for (Ville ville : listeVilles) {
			if (ville.getNomRegion().equals(nomRegion)) {
				listeVillesByRegion.add(ville);
			}
		}
		Collections.sort(listeVillesByRegion, new ComparatorPopulation());

		List<Ville> liste10VillesPlusGrandes = listeVillesByRegion.subList(listeVillesByRegion.size() - 10,
				listeVillesByRegion.size());
		return liste10VillesPlusGrandes;
	}

	private static String getPlusGrandDepartementByRegion(List<Ville> listeVilles, String nomRegion) {
		HashMap<String, Integer> mapDepartementPopulation = new HashMap<>();
		for (Ville ville : listeVilles) {
			if (ville.getNomRegion().equals(nomRegion)) {
				Integer compteur = mapDepartementPopulation.get(ville.getCodeDepartement());
				if (compteur == null) {
					mapDepartementPopulation.put(ville.getCodeDepartement(), ville.getPopulation());
				} else {
					compteur += ville.getPopulation();
					mapDepartementPopulation.put(ville.getCodeDepartement(), compteur);
				}
			}
		}
		int popMax = 0;
		String keyPopMax = "";
		for (String key : mapDepartementPopulation.keySet()) {
			if (popMax < mapDepartementPopulation.get(key)) {
				popMax = mapDepartementPopulation.get(key);
				keyPopMax = key;
			}
		}
		return keyPopMax;
	}

	private static ArrayList<String> getDixRegionsPlusPeuplees(List<Ville> listeVilles) {
		HashMap<String, Integer> mapRegionPopulation = new HashMap<>();
		for (Ville ville : listeVilles) {
			Integer compteur = mapRegionPopulation.get(ville.getNomRegion());
			if (compteur == null) {
				mapRegionPopulation.put(ville.getNomRegion(), ville.getPopulation());
			} else {
				compteur += ville.getPopulation();
				mapRegionPopulation.put(ville.getNomRegion(), compteur);
			}
		}

		int cmpt = 0;
		ArrayList<String> dixRegions = new ArrayList<>();
		while(cmpt < 10) {
			int maxPopulation = 0;
			String regionMax = "";
			for (String key : mapRegionPopulation.keySet()) {
				if(mapRegionPopulation.get(key) > maxPopulation && !dixRegions.contains(key)) {
					maxPopulation = mapRegionPopulation.get(key);
					regionMax = key;
				}
			}
			dixRegions.add(regionMax);
			cmpt++;
		}
		return dixRegions;
	}

	private static ArrayList<String> getDixDepartementsPlusPeuples(List<Ville> listeVilles) {
		HashMap<String, Integer> mapDeptPopulation = new HashMap<>();
		for (Ville ville : listeVilles) {
			Integer compteur = mapDeptPopulation.get(ville.getNomRegion());
			if (compteur == null) {
				mapDeptPopulation.put(ville.getCodeDepartement(), ville.getPopulation());
			} else {
				compteur += ville.getPopulation();
				mapDeptPopulation.put(ville.getCodeDepartement(), compteur);
			}
		}
		
		int cmpt = 0;
		ArrayList<String> dixDepts = new ArrayList<>();
		while(cmpt < 10) {
			int maxPopulation = 0;
			String regionMax = "";
			for (String key : mapDeptPopulation.keySet()) {
				if(mapDeptPopulation.get(key) > maxPopulation && !dixDepts.contains(key)) {
					maxPopulation = mapDeptPopulation.get(key);
					regionMax = key;
				}
			}
			dixDepts.add(regionMax);
			cmpt++;
		}
		return dixDepts;
	}
	
	private static ArrayList<String> getDixVillesPlusPeuples(List<Ville> listeVilles) {
		HashMap<String, Integer> mapVillePopulation = new HashMap<>();
		for (Ville ville : listeVilles) {
			Integer compteur = mapVillePopulation.get(ville.getNomRegion());
			if (compteur == null) {
				mapVillePopulation.put(ville.getNomCommune(), ville.getPopulation());
			} else {
				compteur += ville.getPopulation();
				mapVillePopulation.put(ville.getNomCommune(), compteur);
			}
		}
		
		int cmpt = 0;
		ArrayList<String> dixVilles = new ArrayList<>();
		while(cmpt < 10) {
			int maxPopulation = 0;
			String villeMax = "";
			for (String key : mapVillePopulation.keySet()) {
				if(mapVillePopulation.get(key) > maxPopulation && !dixVilles.contains(key)) {
					maxPopulation = mapVillePopulation.get(key);
					villeMax = key;
				}
			}
			dixVilles.add(villeMax);
			cmpt++;
		}
		return dixVilles;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			List<Ville> listeVilles = creerListeVilles(lignes);
//			System.out.println("Infos pour la ville Montpellier : " + getVilleByNomVille(listeVilles, "Montpellier"));
//			System.out.println("Population département Hérault : " + getPopulationByDepartement(listeVilles, "34"));
//			System.out.println("Ville la plus petite de l'Hérault : " + getPlusPetiteVilleByDepartement(listeVilles, "34"));
//			System.out.println("Les 10 plus petites villes de l'Hérault : ");
//			System.out.println("");
//			List<Ville> liste10PlusPetitesVillesHerault = get10PlusPetitesVillesByDepartement(listeVilles, "34");
//			for (Ville ville : liste10PlusPetitesVillesHerault) {
//				System.out.println(ville.getNomCommune());
//			}
//			System.out.println("");
//			
//			System.out.println("Les 10 plus grandes villes de l'Hérault : ");
//			System.out.println("");
//			List<Ville> liste10PlusGrandesVillesHerault = get10PlusGrandesVillesByDepartement(listeVilles, "34");
//			for (Ville ville : liste10PlusGrandesVillesHerault) {
//				System.out.println(ville.getNomCommune());
//			}
//			System.out.println("");
//			
//			System.out.println("Population région Occitanie : " + getPopulationByRegion(listeVilles, "Occitanie")); 
//			
//			System.out.println("");
//			
//			System.out.println("Les 10 plus grandes villes d'Occitanie : ");
//			System.out.println("");
//			List<Ville> liste10PlusGrandesVillesOccitanie = get10PlusGrandesVillesByRegion(listeVilles, "Occitanie");
//			for (Ville ville : liste10PlusGrandesVillesOccitanie) {
//				System.out.println(ville.getNomCommune());
//			}
//			System.out.println("");

//			System.out.println(getPlusGrandDepartementByRegion(listeVilles, "Occitanie"));
			
			System.out.println(getDixRegionsPlusPeuplees(listeVilles));
			System.out.println(getDixDepartementsPlusPeuples(listeVilles));
			System.out.println(getDixVillesPlusPeuples(listeVilles));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
