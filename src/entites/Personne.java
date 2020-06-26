package entites;

import entites.AdressePostale;

public class Personne {
	private String nom, prenom;
	private AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void afficheMAJ() {		
		System.out.println((this.nom + " " + this.prenom).toUpperCase());
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom () {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
	
	 
	
	
}
