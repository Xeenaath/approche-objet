package formes;

public class Cercle extends Forme {
	private double rayon;

	public Cercle(double rayon) {
		// TODO Auto-generated constructor stub
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.pow(rayon, 2)*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*rayon*Math.PI;
	}

}
