package listes;
import listes.Ville;
import java.util.*;
public class TestListeVilles {

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
		ArrayList<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(ville1);
		listeVilles.add(ville2);
		listeVilles.add(ville3);
		listeVilles.add(ville4);
		listeVilles.add(ville5);
		listeVilles.add(ville6);
		listeVilles.add(ville7);
		listeVilles.add(ville8);		
		
		Ville villePlusPeuplee = listeVilles.get(0);
		Ville villeMoinsPeuplee = listeVilles.get(0);
		
		for (int i = 0; i < listeVilles.size(); i++) {
			if (listeVilles.get(i).getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
				villePlusPeuplee = listeVilles.get(i);
			}
			if (listeVilles.get(i).getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
				villeMoinsPeuplee = listeVilles.get(i);
			}
			if (listeVilles.get(i).getNbHabitants() > 100_000) {
				listeVilles.get(i).setNom(listeVilles.get(i).getNom().toUpperCase()) ;
			}
		}
	
		System.out.println("La ville la plus peuplée est " + villePlusPeuplee);
		listeVilles.remove(villeMoinsPeuplee);
		System.out.println(listeVilles);
	}

}
