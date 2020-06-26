package banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte(1, 2000);
		CompteTaux compte2 = new CompteTaux(1, 200, 2);
		Compte[] tabComptes = {compte1, compte2};
		for(int i = 0; i < tabComptes.length; i++) {
			System.out.println(tabComptes[i]);
		}
	}

}
