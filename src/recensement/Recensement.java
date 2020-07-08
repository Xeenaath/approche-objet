package recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Recensement {
	private ArrayList<Ville> listeVilles = new ArrayList<>();
	
	public Recensement() {
		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			for (int i = 1; i < lignes.size(); i++) {
				String[] morceaux = lignes.get(i).split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				int population = Integer.parseInt(morceaux[7].replace(" ", "").trim());
				
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
				listeVilles.add(ville);

			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public ArrayList<Ville> getListeVilles() {
		return listeVilles;
	}

	public void setListeVilles(ArrayList<Ville> listeVilles) {
		this.listeVilles = listeVilles;
	}

}
