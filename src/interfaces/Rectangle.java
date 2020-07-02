package interfaces;

public class Rectangle implements ObjetGeometrique {
	int largeur, longueur;
	
	
	public Rectangle(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return largeur*2 + longueur*2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

}
