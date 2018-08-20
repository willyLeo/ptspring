package com.tesis.ptspring.businessController;

public class BusBusinessController {
	
	static public boolean validateCapacidadTotal(Integer capTotal) {
		
		if(capTotal<0) {
			return false;
		}else {
			return true;
		}
	}
	
	

}
