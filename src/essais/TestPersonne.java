package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				AdressePostale adresse1 = new AdressePostale(25, "rue du Faubourg Saint-Jaumes", 34, "Montpellier");
				AdressePostale adresse2 = new AdressePostale(2, "rue de l'aulnaie", 60, "Monchy Saint Eloi");
				
				Personne personne1 = new Personne("Girot", "Nathan", adresse1);
				Personne personne2 = new Personne("Pani", "Fani", adresse1);
				
				System.out.println(personne1.getNom());
				System.out.println(personne1.getPrenom());
				System.out.println(personne1.getAdresse().getVille());
				
				personne1.afficheMAJ();
				personne2.afficheMAJ();
				personne2.setNom("Panini");
				personne2.setPrenom("Fanini");
				personne2.afficheMAJ();	
	}

}
