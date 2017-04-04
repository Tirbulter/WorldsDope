package Interface;

public interface IPersonnages {
	int PV=100;
	double ProbaToucher=0;
	int Degat=10;
	IArmes Arme=null;
	
	/* Getter & setter*/
	public static int getDegat() { return Degat; }
	public static void setDegat(int degat) {}
	
	public static IArmes getArme() { return Arme; }
	public static void setArme(IArmes arme) {}
	
	public static int getPV() { return PV; }
	public static void setPV(int pv) {}

	public static double getProbaToucher() { return ProbaToucher; }
	public static void setProbaToucher(double probaToucher) {}
		
}