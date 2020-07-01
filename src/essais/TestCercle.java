package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(4);
		Cercle cercle2 = new Cercle(6);
		Cercle cercle3 = CercleFactory.creerCercle(4);
		
		System.out.println(cercle1.perimetre());
		System.out.println(cercle2.perimetre());
		System.out.println(cercle3.perimetre());
		System.out.println(cercle1.surface());
		System.out.println(cercle2.surface());
		System.out.println(cercle3.surface());
	}

}
