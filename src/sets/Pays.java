package sets;

public class Pays {
	String nom;
	double nbHabitantsEnMillions, pibParHabitant;
	
	public Pays() {
		
	}

	public Pays(String nom, double nbHabitantsEnMillions, double pibParHabitant) {
		this.nom = nom;
		this.nbHabitantsEnMillions = nbHabitantsEnMillions;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitantsEnMillions=" + nbHabitantsEnMillions + ", pibParHabitant="
				+ pibParHabitant + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNbHabitants() {
		return nbHabitantsEnMillions;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitantsEnMillions = nbHabitants;
	}

	public double getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

}
