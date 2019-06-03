package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;
import com.epam.exception.ExceptionSizeArray;
import com.epam.workWithElectrics.SortingByCountry;


public class Writer {
 
	//	recording sort results in txt file
	
	protected void  writeSearch() {
		SortingByCountry sortingByCountry = new SortingByCountry();
		 try {
				FileWriter wr = new FileWriter("D:/Epam/Hometask/src/Files/Name.txt");
		  		wr.write(sortingByCountry.resultSorting());
		  		wr.close();
				
		} catch(IOException ex) {
			ex.printStackTrace();
	} catch(ExceptionSizeArray  ex2) {
		 ex2.printStackTrace();
	 }
				  
}
	
}
