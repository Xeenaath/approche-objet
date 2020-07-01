package maison;
import maison.Piece;

public class Maison {
	private Piece[] tableauPieces;
	
	public Maison() {
		this.tableauPieces = new Piece[0];
	}
	
	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getNumEtage() >= 0 && piece.getSuperficie() >= 0) {
			Piece[] nvTableau = new Piece[this.tableauPieces.length+1];
			for(int i = 0; i < this.tableauPieces.length; i++) {
				nvTableau[i] = this.tableauPieces[i];
			}
			nvTableau[nvTableau.length-1] = piece;
			this.tableauPieces = nvTableau;
		}
		
	}
	
	public double getSuperficieTotale() {
		double superficieTotale = 0;
		for(int i = 0; i < this.tableauPieces.length; i++) {
			superficieTotale += this.tableauPieces[i].getSuperficie();
		}
		return superficieTotale;
	}
	
	public double getSuperficieParEtage(int numEtage) {
		double superficieParEtage = 0;
		for(int i = 0; i < this.tableauPieces.length; i++) {
			if (numEtage == this.tableauPieces[i].getNumEtage()) {
				superficieParEtage += this.tableauPieces[i].getSuperficie();
			}
		}
		return superficieParEtage;
	}
	
	public double getSuperficieParTypePiece(Piece typePiece) {
		double superficieParTypePiece = 0;
		for(int i = 0; i < this.tableauPieces.length; i++) {
			if (typePiece.getClass().equals(this.tableauPieces[i].getClass())) {
				superficieParTypePiece += this.tableauPieces[i].getSuperficie();
			}
		}
		return superficieParTypePiece;
	}
	
	public int getNbPiecesParTypePiece(Piece typePiece) {
		int nbPieces = 0;
		for(int i = 0; i < this.tableauPieces.length; i++) {
			if (typePiece.getClass().equals(this.tableauPieces[i].getClass())) {
				nbPieces++;
			}
		}
		return nbPieces;
	}
	
}
