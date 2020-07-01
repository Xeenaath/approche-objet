package chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
//		System.out.println(chaine.charAt(0));
//		System.out.println(chaine.length());
//		System.out.println(chaine.indexOf(';'));
//		String nom = chaine.substring(chaine.indexOf('D'),chaine.indexOf(';'));
//		System.out.println(nom);
//		System.out.println(nom.toUpperCase());
//		System.out.println(nom.toLowerCase());
		String[] splitTab = chaine.split(";");
		for(int i = 0; i < splitTab.length; i++) {
			System.out.println(splitTab[i]);
		}
		String nom = splitTab[0];
		String prenom = splitTab[1];
		String salaire = splitTab[2];
		salaire = salaire.replaceAll(" ","");
		System.out.println(salaire);
		Salarie salarie = new Salarie(nom, prenom, Double.parseDouble(salaire));
		System.out.println(salarie);
		
		
	}

}
