package Personnage;

public class Joueur extends Personnages {
	private int nbDroguePortee;

	Joueur() {
		super();
	}

	public int getNbDroguePortee() {
		return nbDroguePortee;
	}

	public void setNbDroguePortee(int nbDroguePortee) {
		this.nbDroguePortee = nbDroguePortee;
	}
}
