package essais;

import banque.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calculMoyenne = new CalculMoyenne();
		calculMoyenne.ajout(12);
		calculMoyenne.ajout(15);
		calculMoyenne.ajout(18);
		calculMoyenne.ajout(11);
		calculMoyenne.ajout(17);
		calculMoyenne.ajout(19);
		System.out.println(calculMoyenne.calculMoyenne());
	}

}
