package salaire;

public class Pigiste extends Intervenant {
	private int nbJournees;
	private double salaireJournalier;
	
	public Pigiste(String nom, String prenom, int nbJournees, double salaireJournalier) {
		super(nom, prenom);
		this.nbJournees = nbJournees;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public double getSalaire() {
		return nbJournees * salaireJournalier;
	}

}
