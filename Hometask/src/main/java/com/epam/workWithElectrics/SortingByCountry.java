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
	
	public void sorting() throws ExceptionSizeArray {
		try {
			sereliz();
		  desareliz();
		} catch(NullPointerException ex) {
			ex.printStackTrace();
		}
	}
	
protected Object resultSorting() throws ExceptionSizeArray{
	try {
	ProducingCountry producingCountry = new ProducingCountry();
	nameElectrics.addListElectrics();
	  for (int i = 0; i != nameElectrics.listElektrics.size(); i++) {
		  if(nameElectrics.listElektrics.size() != 5) throw new ExceptionSizeArray("check size array");
		      if ("Germany".equals(mass[i])) {
	         
	          System.out.println("Result search:" + nameElectrics.listElektrics.get(i));
	       Object result = nameElectrics.listElektrics.get(i);
	       Object  name =  nameElectrics.listElektrics.get(i);
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

		     


private void sereliz() throws ExceptionSizeArray {
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

