package essais;
import maison.*;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chambre chambre1 = new Chambre(15, 1);
		Chambre chambre2 = new Chambre(15, 1);
		Chambre chambre3 = new Chambre(15, 1);
		Chambre chambre4 = new Chambre(15, 2);
		SalleDeBain salleDeBain1 = new SalleDeBain(10, 0);
		SalleDeBain salleDeBain2 = new SalleDeBain(10, 1);
		WC wc = new WC(5, 0);
		Salon salon = new Salon(30, 0);
		Cuisine cuisine = new Cuisine(20, 0);
		Maison maison = new Maison();
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(chambre4);
		maison.ajouterPiece(salleDeBain1);
		maison.ajouterPiece(salleDeBain2);
		maison.ajouterPiece(wc);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(cuisine);
		System.out.println(maison.getSuperficieTotale());
		System.out.println(maison.getSuperficieParEtage(1));
		System.out.println(maison.getSuperficieParTypePiece(chambre1));
		System.out.println(maison.getNbPiecesParTypePiece(chambre1));

	}

}
