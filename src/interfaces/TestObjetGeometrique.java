package interfaces;
import interfaces.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(4, 7);
		ObjetGeometrique[] tabOG =  {cercle, rectangle};
		
		for (int i = 0; i < tabOG.length; i++) {
			System.out.println("Périmètre : " + tabOG[i].perimetre());
			System.out.println("Surface : " + tabOG[i].surface());
			System.out.println("");
		}
	}

}
