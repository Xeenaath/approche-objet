package salaire;

public abstract class Intervenant {
	String nom, prenom;
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();
	
	public void afficherDonnees() {
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Salaire : " + this.getSalaire());
	}
}
