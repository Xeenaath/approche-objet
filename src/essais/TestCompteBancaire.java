package essais;

import entites.AdressePostale;
import entites.CompteBancaire;
import entites.Personne;

public class TestCompteBancaire {

	public static void main(String[] args) {		
		AdressePostale adresse1 = new AdressePostale(221, "B Baker Street", 122, "Londres");
		Personne personne1 = new Personne("Holmes", "Sherlock", adresse1);
		CompteBancaire compte1 = new CompteBancaire("221B", 14785, personne1);
		CompteBancaire compte2 = new CompteBancaire("222B", 14765, personne1);
		compte1.debiterMontant(9.9);
		compte2.crediterMontant(9.9);
		System.out.println(compte1);
		System.out.println(compte2);
	}

}
