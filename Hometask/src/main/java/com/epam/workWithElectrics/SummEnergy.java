package com.epam.workWithElectrics;

import com.epam.electrics.Energy;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.State;
import com.epam.exception.ExceptionSizeArray;
import com.epam.exception.ExceptionValueEnergy;
import java.util.ArrayList;
import com.epam.workWithElectrics.ReedValueEnergyFromTxt;


public class SummEnergy extends State {
	
	NameElectrics nameElectrics = new NameElectrics();
	ArrayList<Integer> valueStateList = new ArrayList<Integer>();
	Energy energy = new Energy();
	
//inicialization mass
	
	private void inicialization() {
		try {
		ReedValueEnergyFromTxt ReedValueEnergyFromTxt = new ReedValueEnergyFromTxt();
		ReedValueEnergyFromTxt.result();
		for (int i = 0; ReedValueEnergyFromTxt.listEnergy.size()!=i; i++) {
			energy.mass[i] = ReedValueEnergyFromTxt.listEnergy.get(i);
		}
		}catch(ArrayStoreException ex) {
			ex.printStackTrace();
		} 
	}
	
	//display of electrical equipment connected to the circuit and display of their power
	
	public void workingNow() throws ExceptionValueEnergy, ExceptionSizeArray{
		try {	
			nameElectrics.addListElectrics();
		inicialization();
		  for (int i = 0; i < mass.length; i++) {
			  if (energy.mass[i] <0) throw new ExceptionValueEnergy("Can not be negative", 0);
			   if ("on".equals(mass[i])) {
			      System.out.println("Work: "+ nameElectrics.listElektrics.get(i) );
			      valueStateList.add(energy.mass[i]);
		          System.out.println("State value : "+ energy.mass[i]);  
		          System.out.println("Result : " + summ());
		          
		 } 	
	}
}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace(); 
		} catch(IndexOutOfBoundsException ex1) {
			ex1.printStackTrace();
		} catch (NullPointerException ex2) {
			ex2.printStackTrace();
		} catch (ExceptionValueEnergy ex3) {
			ex3.printStackTrace();
		} 
	}
	
	//value the sum energy
	
	protected int summ() {
		try {
		 int sum = 0; 

 	     for (int i : valueStateList)
 	         sum = sum + i;

 	     return sum;
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
			 return 0;
		}
}
	
	
}