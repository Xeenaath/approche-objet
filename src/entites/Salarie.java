package entites;

public class Salarie {
	private final String nom;
	private final String prenom;
	private final double salaire;
	public Salarie(String nom, String prenom, double salaire) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	public String toString() {
		return "Nom : " + nom + " // Prénom : " + prenom + " // Salaire : " + salaire;
		
	}

}
