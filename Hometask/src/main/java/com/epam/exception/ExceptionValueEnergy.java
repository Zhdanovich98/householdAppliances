package com.epam.exception;

public class ExceptionValueEnergy extends Exception {
	private int exValueEnergy;
	public int getExValueEnergy(){
		return 0;
		}
	
	//Exception for work with energy value
	
public ExceptionValueEnergy(String message, int valueEnergy) {
	 super(message);
	 exValueEnergy=valueEnergy;
	 
}
}
