package Personnage;

public class Joueur extends IPersonnages {
	private int nbDroguePortee;

	Joueur() {
		super(0.1);
	}

	public int getNbDroguePortee() {
		return nbDroguePortee;
	}

	public void setNbDroguePortee(int nbDroguePortee) {
		this.nbDroguePortee = nbDroguePortee;
	}
}
