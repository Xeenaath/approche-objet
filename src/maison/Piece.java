package maison;

public abstract class Piece {
	private double superficie; 
	private int numEtage;
	
	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.numEtage = numEtage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
}
