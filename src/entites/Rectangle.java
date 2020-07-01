package entites;

public class Rectangle {
	private final int longueur;
	private final int largeur;

	public Rectangle(int longueur, int largeur) {
		// TODO Auto-generated constructor stub
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public int perimetre() {
		return this.largeur*2 + this.longueur*2;
	}

	public int surface() {
		return this.largeur*this.longueur;
	}
}
