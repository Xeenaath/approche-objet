package maps;

public class Pays {
	private String nom, continent;
	private double nbHabitants;
	
	public Pays(String nom, double nbHabitants, String continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public double getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
}
