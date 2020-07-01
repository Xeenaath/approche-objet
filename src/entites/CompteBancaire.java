package entites;

public class CompteBancaire {
	private final String numCompte;
	private double solde;
	private Personne proprio;
	
	public CompteBancaire(String numCompte, double solde, Personne proprio) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.proprio = proprio;
	}
	
	public void crediterMontant (double montant) {
		this.solde += montant;
	}
	
	public void debiterMontant (double montant) {
		this.solde -= montant;
	}
	
	public String toString() {
		return "Le compte n° " + numCompte +
				" de " + proprio.getNom() + " " + proprio.getPrenom() +
				" a un solde de " + solde;
	}

}
