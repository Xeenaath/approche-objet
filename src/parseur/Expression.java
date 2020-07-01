package parseur;

public class Expression {
	private String membreGauche, membreDroit;
	private String operateur;

	public Expression(String membreGauche, String operateur, String membreDroit) {
		this.membreGauche = membreGauche;
		this.operateur = operateur;
		this.membreDroit = membreDroit;
	}

	public double evaluer(String nom, double valeur) {
		if(this.membreGauche.matches("[a-z]")) {

			switch (operateur) {
			case "+": {
				return valeur + Double.parseDouble(this.membreDroit);
			}
			case "-": {
				return valeur - Double.parseDouble(this.membreDroit);
			}
			case "/": {
				return valeur / Double.parseDouble(this.membreDroit);
			}
			case "*": {
				return valeur * Double.parseDouble(this.membreDroit);
			}	
		
			default:
				throw new IllegalArgumentException("Unexpected value: " + operateur);
			}
			
		} else {
			switch (operateur) {
			case "+": {
				return Double.parseDouble(this.membreGauche) + valeur;
			}
			case "-": {
				return Double.parseDouble(this.membreGauche) - valeur;
			}
			case "/": {
				return Double.parseDouble(this.membreGauche) / valeur;
			}
			case "*": {
				return Double.parseDouble(this.membreGauche) * valeur;
			}	
			default:
				throw new IllegalArgumentException("Unexpected value: " + operateur);
			}

		}
	}
}
