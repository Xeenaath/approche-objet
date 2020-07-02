package interfaces;

public class Cercle implements ObjetGeometrique {
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return rayon*2*Math.PI;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.pow(rayon, 2)*Math.PI;
	}
	
	
}
