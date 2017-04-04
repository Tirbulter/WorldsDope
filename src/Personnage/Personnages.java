package Personnage;

import Armes.Armes;
import Interface.IArmes;
import Interface.IPersonnages;

public abstract class Personnages implements IPersonnages{
	static int PV=100;
	static double ProbaToucher=0;
	static int Degat=10;
	static Armes Arme=null;
	
	public static int getDegat() { return Degat; }
	public static void setDegat(int degat) {}
	
	public static IArmes getArme() { return Arme; }
	public static void setArme(IArmes arme) {}
	
	public static int getPV() { return PV; }
	public static void setPV(int pv) {}

	public static double getProbaToucher() { return ProbaToucher; }
	public static void setProbaToucher(double probaToucher) {}
	
	/*constructeur*/
	Personnages(double probaTouch){ ProbaToucher=probaTouch; }
	
	public static int tirer(){
		if(Math.random()>ProbaToucher){
			return Degat + (Arme==null?0:Arme.getDegat());
		}else{
			return 0;
		}
	}
}
