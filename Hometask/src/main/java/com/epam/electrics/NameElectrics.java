package com.epam.electrics;



public class NameElectrics extends StateElectrics implements BehaviorElectrics{

	//Input of five electrical appliances
	
	
	
	public String[] mass = new String[5];
	{ 
		try {
		mass[0] = new String(name="Television");
		mass[1] = new String(name="Phone");
		mass[2] = new String(name="Iron");
		mass[3] = new String(name="Teapot");
		mass[4] = new String(name="Coffee machine");
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


