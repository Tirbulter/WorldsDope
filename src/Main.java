import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Loi.LoiNormal;

public class Main {
	public static void main(String[] args) {
		//Places Argenteuil=null;
		
		LoiNormal loi= new LoiNormal();
		int loie[]=new int[1000];
		for(int i=0;i<1000;i++)
			loie[i]=(int)(loi._loi_normale(2000,250));
		
		String csvFile = "C:/Users/Bastien/workspace/WorldsDope/DopwarStat.csv";
		//chargerStatPlaces(csvFile);
		
	}}
/*
	private static PLaces chargerStatPlaces(String csvFile) {
		 BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ";";

	        try {
	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] country = line.split(cvsSplitBy);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	    }
	}*/
