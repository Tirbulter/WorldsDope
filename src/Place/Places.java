package Place;

import java.io.FileReader;

import Batiment.Batiments;

public abstract class Places {
	private String nomPlace;
	private double[] proba;
	// Acide, Amphet, Champignon, Cocaïne, Extasie, Hashish, Heroine, Mescaline,
	// Opium, PCP, Shunk, SpecialK
	private Batiments batiment = null;

	// Constructeur
	public Places(String NomPlace, int index) {
		nomPlace = NomPlace;
		FileReader FR = null;
		proba = recupStat(FR, index);
	}

	public String getNomPlace() {
		return nomPlace;
	}

	public void setNomPlace(String nomPlace) {
		this.nomPlace = nomPlace;
	}

	public double[] getProba() {
		return proba;
	}

	public void setProba(double[] proba) {
		this.proba = proba;
	}
  
	public Batiments getBatiment() {
		return batiment;
	}

	public void setBatiment(Batiments batiment) {
		this.batiment = batiment;
	}

	private double[] recupStat(FileReader FR, int ligne) {
		// To Do lecture du fichier texte pour proba

		return null;
	}
}
