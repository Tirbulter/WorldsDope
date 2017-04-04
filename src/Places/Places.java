package Places;

import java.io.FileReader;

import Batiment.Batiments;

public abstract class Places implements IPlaces {
	private int ID;
	private String nomPlace;
	private double[] proba;
	//    0 ,   1   ,     2     ,   3    ,    4   ,    5   ,   6    ,     7    ,   8  ,  9 ,  10  ,   11
	// Acide, Amphet, Champignon, Cocaïne, Extasie, Hashish, Heroine, Mescaline, Opium, PCP, Shunk, SpecialK
	Batiments batiment;

	// Constructeur
	public Places(String NomPlace, int index) {
		nomPlace = NomPlace;
		setID(index);
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
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public Batiments getBatiment() {
		return batiment;
	}
	
	public void setBatiment(Batiments batiment) {
		this.batiment = batiment;
	}

	public double[] recupStat(FileReader FR, int ligne) {
		// To Do lecture du fichier texte pour proba
		return null;
	}
}
