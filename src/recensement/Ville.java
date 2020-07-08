package recensement;

public class Ville {
	String codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune;
	int population;

	public Ville () {
	}
	
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int population) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}

	@Override
	public String toString() {
		return "Ville [codeRegion = " + codeRegion + ", nomRegion = " + nomRegion + ", codeDepartement = " + codeDepartement
				+ ", codeCommune = " + codeCommune + ", nomCommune = " + nomCommune
				+ ", population = " + population + "]";
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	
	public String getNomCommune() {
		return nomCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	

}
