package com.epam.electrics;




public class Energy extends StateElectrics {


//	Entering the power values ​​of electrical devices 	
	public Integer[] mass = new Integer[5] ;
	{
		try {
		mass[0] = new Integer(valueEnergy); 
		mass[1] = new Integer(valueEnergy);
		mass[2] = new Integer(valueEnergy);
		mass[3] = new Integer(valueEnergy);
		mass[4] = new Integer(valueEnergy);
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
