package com.epam.exception;

public class ExceptionValueEnergy extends Exception {
	private int exValueEnergy;
	public int getExValueEnergy(){
		return 0;
		}
public ExceptionValueEnergy(String message, int valueEnergy) {
	 super(message);
	 exValueEnergy=valueEnergy;
	 
}
}
