package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	int tauxRemuneration;
	
	public CompteTaux(int numCompte, int solde, int tauxRemuneration) {
		super(numCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Taux de rémunération : " + this.tauxRemuneration;
	}

}
