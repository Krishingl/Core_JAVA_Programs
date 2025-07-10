package com.krush.interface_deom1.blc;

public class Restuarent {
	
	
	public static void prepareHotDrink(HotDrink hd) {  
		//Upcasting 
		//loose coupling because we can pass here any inplemeter class Object 
		                                             
		hd.prepare();
	}

}
