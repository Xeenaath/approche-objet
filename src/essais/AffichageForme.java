package essais;

import formes.Carre;
import formes.Cercle;
import formes.Forme;
import formes.Rectangle;

public class AffichageForme {

	public static void afficherPerimetre(Forme forme) {
		System.out.println(forme.calculerPerimetre());
	}
	
	public static void afficherSurface(Forme forme) {
		System.out.println(forme.calculerSurface());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(4.0, 2.0);
		Carre carre = new Carre(4);
		Cercle cercle = new Cercle(4);
		AffichageForme.afficherPerimetre(rectangle);
		AffichageForme.afficherPerimetre(carre);
		AffichageForme.afficherPerimetre(cercle);
		

	}

}
