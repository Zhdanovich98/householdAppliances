package com.epam.electrics;

import java.util.ArrayList;


public class NameElectrics{ 

	//collection for working with name electrics
	public ArrayList<Object> listElektrics = new ArrayList<Object>();
	//Input of five electrical appliances
	private enum Electrics {
		Television, Phone, Iron, Teapot, Coffee_machine
	}
	//add name electrics in collection
	public void addListElectrics() {
	try {
		Electrics[] allname = Electrics.values();
	for( Electrics name1 : allname) {
		listElektrics.add(name1);
	}
	}
	
	catch(NullPointerException ex) {
		ex.printStackTrace();
	} catch(ArrayStoreException ex1) {
		ex1.printStackTrace();
	} 
	}
}


