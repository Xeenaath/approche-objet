package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adresse1 = new AdressePostale(25, "rue du Faubourg Saint-Jaumes", 34, "Montpellier");
		AdressePostale adresse2 = new AdressePostale(2, "rue de l'aulnaie", 60, "Monchy Saint Eloi");
		
		System.out.println(adresse1.codePostal);
	}

}
