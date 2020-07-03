package tri;

public class Ville implements Comparable<Ville>{
	String nom;
	Integer nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	public String toString() {
		return  nom + " (" + nbHabitants + " habitants)";
	}
	
//	@Override
//	public int compareTo(Ville autreVille) {
//		return this.nom.compareTo(autreVille.getNom());
//	}
	
	@Override
	public int compareTo(Ville autreVille) {
		return this.getNbHabitants().compareTo(autreVille.getNbHabitants());
//		if (this.nbHabitants > autreVille.getNbHabitants()) {
//			return 1;
//		}
//		if (this.nbHabitants < autreVille.getNbHabitants()) {
//			return -1;
//		}
//		return 0;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
