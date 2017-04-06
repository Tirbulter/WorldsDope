package Personnage;

import Armes.Armes;
import Armes.IArmes;

public abstract class Personnages implements IPersonnages{
	static int PV=100;
	static int Degat=10;
	static Armes Arme=null;
	
	public static int getDegat() { return Degat; }
	public static void setDegat(int degat) {}
	
	public static IArmes getArme() { return Arme; }
	public static void setArme(IArmes arme) {}
	
	public static int getPV() { return PV; }
	public static void setPV(int pv) {}
	
	/*constructeur*/
	Personnages(){}
	
	public static int tirer(){
		//70% de chance de toucher pour les personnages
		if(Math.random()>0.3){
			return Degat + (Arme==null?0:Armes.getDegat());
		}else{
			return 0;
		}
	}
}
