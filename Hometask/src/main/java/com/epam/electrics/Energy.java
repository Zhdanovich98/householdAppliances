package com.epam.electrics;

//import com.epam.electrics.BehaviorElectrics;


public class Energy extends StateElectrics {


//Input of power values of electrical appliances	
	public Integer[] mass = new Integer[5] ;
	{
		try {
		mass[0] = new Integer(valueEnergy=7); 
		mass[1] = new Integer(valueEnergy=65);
		mass[2] = new Integer(valueEnergy=12);
		mass[3] = new Integer(valueEnergy=67);
		mass[4] = new Integer(valueEnergy=23);
		}
		
		catch(NullPointerException ex) {
			ex.printStackTrace();
		} catch(ArrayStoreException ex1) {
			ex1.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException  ex2) {
			ex2.printStackTrace();
	
		}
}
	}
