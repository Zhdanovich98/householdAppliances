package com.epam.electrics;



public class ProducingCountry extends StateElectrics implements BehaviorElectrics{
	
	//Specifying manufacturer country values
	
	public String[] mass = new String[5];
	{ try {
		mass[0] = new String(producingCountry = "Japan");
		mass[1] = new String(producingCountry = "China");
		mass[2] = new String(producingCountry = "China");
		mass[3] = new String(producingCountry = "Germany");
		mass[4] = new String(producingCountry = "Japan");
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
