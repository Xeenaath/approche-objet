package interfaces;
import interfaces.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] tabOG =  {new Cercle(5), new Rectangle(4, 7)};
		for (int i = 0; i < tabOG.length; i++) {
			System.out.println("Périmètre : " + tabOG[i].perimetre());
			System.out.println("Surface : " + tabOG[i].surface());
			System.out.println("");
		}
	}
}
