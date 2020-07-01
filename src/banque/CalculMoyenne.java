package banque;

public class CalculMoyenne {
	private double[] tableau = new double[0];
	
	
	public void ajout(double valeur) {
		double[] nvTableau = new double[this.tableau.length+1];
		for(int i = 0; i < this.tableau.length; i++) {
			nvTableau[i] = this.tableau[i];
		}
		nvTableau[nvTableau.length-1] = valeur;
		this.tableau = nvTableau;
	}
	
	public double calculMoyenne() {
		double somme = 0;
		for (int i = 0; i < this.tableau.length; i++) {
			somme += this.tableau[i];
		}
		double moyenne = somme / this.tableau.length;
		return moyenne;
	}
}
