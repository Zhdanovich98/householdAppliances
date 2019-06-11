package com.epam.main;


import com.epam.workWithElectrics.SummEnergy;
import com.epam.workWithElectrics.SortingByCountry;
import com.epam.exception.ExceptionValueEnergy;
import com.epam.electrics.NameElectrics;
import com.epam.exception.ExceptionDeseraliz;
import com.epam.exception.ExceptionSizeArray;
import com.epam.workWithElectrics.ReedValueEnergyFromTxt;

public class main {


		public static void main(String[] args) throws ExceptionDeseraliz, ExceptionSizeArray {
			// TODO Auto-generated method stub
		try {

		 System.out.println("Work now  : ");
			SummEnergy summEnergy = new SummEnergy ();
			summEnergy.workingNow();
			 System.out.println("Sorting by country(Germany) with save txt result and serialization : ");	
			SortingByCountry sortingByCountry = new SortingByCountry();
	        sortingByCountry.sorting();
		} catch (ExceptionValueEnergy ex) {
			ex.printStackTrace();
		}  

	}
	}
