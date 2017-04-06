package Personnage;

import Armes.IArmes;

public interface IPersonnages {
	int PV=100;
	int Degat=10;
	IArmes Arme=null;
	
	/* Getter & setter*/
	public static int getDegat() { return Degat; }
	public static void setDegat(int degat) {}
	
	public static IArmes getArme() { return Arme; }
	public static void setArme(IArmes arme) {}
	
	public static int getPV() { return PV; }
	public static void setPV(int pv) {}
		
}