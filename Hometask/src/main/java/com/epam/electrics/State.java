package com.epam.electrics;



public class State extends StateElectrics {

//Specifying the connection values of electrical devices in the circuit ("on" / "off")
	
	
	
		public String[] mass = new String[5]; {
			try {
		mass[0] = new String(powerSupply="off");
		mass[1] = new String(powerSupply="on");
		mass[2] = new String(powerSupply="off");
		mass[3] = new String(powerSupply="on");
		mass[4] = new String(powerSupply="off");
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

