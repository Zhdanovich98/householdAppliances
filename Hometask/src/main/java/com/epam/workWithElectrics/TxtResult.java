package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;



public class TxtResult extends SortingByCountry {
	

//	reading sorting to txt file
	
	protected void  resultSearch() {
		
		 try {
		  		File file = new File("D:/Epam/Hometask/src/Files/Name.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
				
				System.out.println("Result from file:"+reader.readLine());
				reader.close();
					  		}
				  		 
					      catch(IOException ex) {
					  			ex.printStackTrace();
					  		}
				  
}
}