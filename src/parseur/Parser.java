package parseur;

import parseur.Expression;

public class Parser {

	public static Expression parse(String chaine) {
		String operateur = "";

		if (chaine.contains("+")) {
			operateur = "+";
		}

		if (chaine.contains("-")) {
			operateur = "-";
		}

		if (chaine.contains("*")) {
			operateur = "*";
		}

		if (chaine.contains("/")) {
			operateur = "/";
		}

		String[] splitTab = chaine.split(operateur);
		return new Expression(splitTab[0], operateur, splitTab[1]);

	}

}
