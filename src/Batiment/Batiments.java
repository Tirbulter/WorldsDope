package Batiment;

import Batiment.IBatiments;

public abstract class Batiments implements IBatiments {
	String Nom;
	int ID;

	public  String getNom() { return Nom; }
	public  void setNom(String nom) { Nom = nom; }

	public  int getID() { return ID; }
	public  void setID(int id) { ID=id; }
	
	/*constructeur*/
	public Batiments(int id, String nom) {
		Nom = nom;
		ID = id;
	}
}
