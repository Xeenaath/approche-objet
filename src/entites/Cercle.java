package entites;

public class Cercle {
	private final double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return this.rayon*2*Math.PI;
	}
	
	public double surface() {
		return Math.pow(rayon, 2)*Math.PI;
	}
}
