package banque.entite;

public class Compte {
	int numCompte;
	int solde;
	
	public Compte(int numCompte, int solde) {
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public String  toString() {
		return "Num�ro de Compte : " + this.numCompte + " Solde = " + this.solde;
	}
}
