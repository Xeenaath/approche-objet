package formes;

public class Rectangle extends Forme {
	double longueur, largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return largeur * longueur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*longueur + 2*largeur;
	}
	
}
