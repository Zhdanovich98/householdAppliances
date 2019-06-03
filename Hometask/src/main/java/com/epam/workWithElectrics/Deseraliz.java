package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;
import com.epam.exception.ExceptionDeseraliz;
import com.epam.exception.ExceptionValueEnergy;


public class Deseraliz {
	SortingByCountry sortingByCountry;
	
	//	deserialization of sort results into txt file
	
	protected void desaraliz() throws ExceptionDeseraliz {
		try {
		FileInputStream file = new FileInputStream("D:/Epam/Hometask/src/Files/Result.ser");
		ObjectInputStream stream = new ObjectInputStream(file);
Object one = stream.readObject();
String sort = (String) one;
if((String) one !=  sort) throw new ExceptionDeseraliz("Deseraliz fail");
stream.close();
	}  catch(ExceptionDeseraliz ex2) {
			ex2.printStackTrace();
		 } catch(Exception ex) {
				ex.printStackTrace();
		 }
	}
}
