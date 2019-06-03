package com.epam.workWithElectrics;

import java.io.*;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;
import com.epam.exception.ExceptionSizeArray;

public class Seraliz {
	
	//	serialization of sort results into txt file
	
	protected void seralizResult() {
	try {
		FileOutputStream file= new FileOutputStream("D:/Epam/Hometask/src/Files/Result.ser");
		ObjectOutputStream stream = new ObjectOutputStream(file);
		SortingByCountry sortingByCountry = new SortingByCountry();
		stream.writeObject(sortingByCountry.resultSorting());	
		stream.close();
	} catch(ExceptionSizeArray  ex2) {
		 ex2.printStackTrace();
	 }catch (IOException ex) {
		ex.printStackTrace();
	}
}
}
