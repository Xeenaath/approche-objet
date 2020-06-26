package fr.diginamic.banque.entites;

public class Compte {
	int numCompte;
	int solde;
	
	public Compte(int numCompte, int solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public String  toString() {
		return "Numéro de Compte : " + this.numCompte + " Solde = " + this.solde;
	}
}
