package com.epam.workWithElectrics;

import com.epam.electrics.Energy;
import com.epam.electrics.NameElectrics;
import com.epam.electrics.State;
import com.epam.exception.ExceptionValueEnergy;
import com.epam.exception.ExceptionDeseraliz;
import java.util.ArrayList;

public class SummEnergy extends State {
	NameElectrics nameElectrics = new NameElectrics();
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	//display of electrical equipment connected to the circuit and display of their power
	
	public void workingNow() throws ExceptionValueEnergy{
		try {
		State state = new State();
		Energy energy = new Energy();
		int index = -1;
		  for (int i = 0; i < mass.length; i++) {
			  if (energy.mass[i] <0) throw new ExceptionValueEnergy("Can not be negative", 0);
			   if ("on".equals(mass[i])) {
			    	  index = i;
			    	   System.out.println("Work: "+nameElectrics.mass[i] );
		          arrayList.add(energy.mass[i]);
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
	private int summ() {
		 int sum = 0; 

 	     for (int i : arrayList)
 	         sum = sum + i;

 	     return sum;
}
}