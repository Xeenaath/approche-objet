package salaire;

public class Salarie extends Intervenant {
	private double salaireMensuel;
	
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}
}
