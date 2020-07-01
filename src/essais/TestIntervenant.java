package essais;

import salaire.Pigiste;
import salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie salarie = new Salarie("Jean", "Pierre", 1200);
		Pigiste pigiste = new Pigiste ("Pierre", "Jean", 10, 40);
		System.out.println(salarie.getSalaire());
		System.out.println(pigiste.getSalaire());
		salarie.afficherDonnees();
		pigiste.afficherDonnees();
	}

}
