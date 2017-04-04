package Loi;

import java.util.Random;

public class LoiNormal {
	public LoiNormal(){}
	
	// LOI UNIFORME
	public static double loi_uniforme() {
	   Random r = new Random();
	   double i = r.nextInt(100);
	   return i;
	}
	// LOI NORMALE
	public static double _loi_normale(double m, double s){
	     double x1,x2,y;
	     x1 = loi_uniforme();
	     x2 = loi_uniforme();

	     // methode de Boc-Muller
	     y = (double)(Math.pow(2*Math.log(x1),0.5)*Math.cos(2.* 3.*x2));
	     return (double)(m + s*y);
	}
}
