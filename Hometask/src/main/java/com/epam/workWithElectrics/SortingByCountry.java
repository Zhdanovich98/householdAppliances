package com.epam.workWithElectrics;

import java.io.FileWriter;
import java.io.IOException;

import com.epam.electrics.NameElectrics;
import com.epam.electrics.ProducingCountry;
import com.epam.exception.ExceptionDeseraliz;
import com.epam.exception.ExceptionSizeArray;


 public class SortingByCountry extends ProducingCountry{

	NameElectrics nameElectrics = new NameElectrics();
	
	//sorting electrical equipment according to the country of manufacturer (Germany)
	
	public void sorting() {
		try {
		write();
		test();
		sereliz();
		desareliz();
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		}
	}
	
public String resultSorting() throws ExceptionSizeArray{
	try {
	ProducingCountry producingCountry = new ProducingCountry();
		int index = -1;
	  for (int i = 0; i < mass.length; i++) {
		  if(mass.length != 5) throw new ExceptionSizeArray("check size array");
		      if ("Germany".equals(mass[i])) {
	          index = i;
	          System.out.println("Result search:" + nameElectrics.mass[i]);
	          String result = nameElectrics.mass[i];
	         name =  nameElectrics.mass[i];
		  		} 
	  }
	 }  catch(IndexOutOfBoundsException  ex1) {
		 ex1.printStackTrace();
	 }
	catch(ExceptionSizeArray  ex2) {
		 ex2.printStackTrace();
	 }
	catch(Exception ex) {
		 ex.printStackTrace();
	 }
	return name;
	}

		     
private void write() {
	Writer writer = new Writer();
	writer.writeSearch();
}

private void test() {
	TxtResult txtResult = new TxtResult();
	txtResult.resultSearch();
}

private void sereliz() {
	Seraliz seraliz = new Seraliz();
	seraliz.seralizResult();
}

private void desareliz() {
	try {
	Deseraliz deseraliz = new Deseraliz();
	deseraliz.desaraliz();
} catch(ExceptionDeseraliz ex2) {
	
}
}
 }

