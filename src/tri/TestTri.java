package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tri.*;

public class TestTri {

	public static void main(String[] args) {
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
		System.out.println("avec compareTo() :");
		System.out.println("");

		System.out.println( "Non triée : " + listeVilles);
		Collections.sort(listeVilles);
		System.out.println("Triée : " + listeVilles);
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");

		
		System.out.println("avec compare() : ");
		System.out.println("");
		System.out.println("comparatorNom :");
		Collections.sort(listeVilles, new ComparatorNom());
		System.out.println(listeVilles);
		System.out.println("");
		System.out.println("comparatorHabitant :");
		Collections.sort(listeVilles, new ComparatorHabitant());
		System.out.println(listeVilles);	
	}
	

}
