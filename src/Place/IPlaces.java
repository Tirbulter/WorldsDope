package Place;

import java.io.FileReader;

import Batiment.Batiments;

public interface IPlaces {
	String nomPlace=null;
	double[] proba=null;
	// Acide, Amphet, Champignon, Cocaïne, Extasie, Hashish, Heroine, Mescaline,
	// Opium, PCP, Shunk, SpecialK
	Batiments batiment = null;
	
	//Parser
	double[] recupStat(FileReader FR, int ligne);
}
