package com.epam.workWithElectrics;

import java.io.*;
import com.epam.exception.ExceptionSizeArray;

public class Seraliz  extends SortingByCountry{
	
	//	serialization of sort results into txt file
	
	protected void seralizResult() throws ExceptionSizeArray {
	try {
		FileOutputStream file= new FileOutputStream("src/main/java/resources/Result.ser");
		ObjectOutputStream stream = new ObjectOutputStream(file);
		stream.writeObject(resultSorting());	
		stream.close();
	} catch(ExceptionSizeArray  ex2) {
		 ex2.printStackTrace();
	 }catch (IOException ex) {
		ex.printStackTrace();
	}
}
}
