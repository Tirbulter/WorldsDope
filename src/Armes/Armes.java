package Armes;

import Interface.IArmes;

public abstract class Armes implements IArmes {
	static int DegatMax;
	static int DegatMin;
	static int Degat;

	public static int getDegatMax() {
		return DegatMax;
	}

	public static void setDegatMax(int degatMax) {
		DegatMax = degatMax;
	}

	public static int getDegatMin() {
		return DegatMin;
	}

	public static void setDegatMin(int degatMin) {
		DegatMin = degatMin;
	}

	public static int getDegat() {
		return Degat;
	}

	public static void setDegat(int degat) {
		if (degat <= Armes.getDegatMax() && degat >= Armes.getDegatMin())
			Degat = degat;
	}

	/* constructeur */
	protected Armes(int degatMax, int degatMin) {
		if (degatMax > degatMin) {
			setDegatMax(degatMax);
			setDegatMin(degatMin);
			setDegat(CalcDegat());
		}
	}

	/* Calcule les dégats qu'apporte l'arme */
	int CalcDegat() {
		return (int) (getDegatMin() + Math.random() * (getDegatMax() - getDegatMin()));
	}
}
