package com.krush.interface_deom1.elc;

import com.krush.interface_deom1.blc.*;

public class LooseCouplingWithInterfaceHotDrink {
	
	
	
	public static void main(String[] args) {
		    
		    Restuarent.prepareHotDrink(new Tea());

		    Restuarent.prepareHotDrink(new Coffee());
		    Restuarent.prepareHotDrink(new Boost());
		
	}

}
