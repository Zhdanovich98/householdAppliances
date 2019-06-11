package com.epam.workWithElectrics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReedValueEnergyFromTxt {

	//collection for working with value energy
	
	protected ArrayList<Integer> listEnergy = new ArrayList<Integer>();

	//	function to read energy values ​​from EnergyValue.txt
	
	protected void  result() {
		
		 try {
		  		File file = new File("src/main/java/resources/EnergyValue.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
				String line;
				while((line=reader.readLine())!=null) {
					listEnergy.add(Integer.parseInt(line));
				}
				reader.close();
					  		}
						 
					      catch(IOException ex) {
					  			ex.printStackTrace();
					  		}
				  
}


}