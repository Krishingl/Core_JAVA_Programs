package com.krush.java_8_features.interface_default_method.elc;
import com.krush.java_8_features.interface_default_method.blc.*;
public class NewFeatureWithInterface {
	
	public static void main(String[] args) {
		   
		
		Vehicle v= new Bike();
		
		
		v.horn();
		v.run();
		
		v=new Car();
		
		
		v.horn();
		v.run();
			
	}

}
/*

OutPut 
:
Bike Has a Horn.
Bike Is running.
Car Is Having Horn.
Car Is running.
 -------now its ok but i want to add  car inside one feature then if added inside the interface then its a kind of boundation 
 because if we write inside interface digitalMetter() 
 then its forceing the all implimeter classes you mast be override this method if not override then your abstract class.
 in over mind then one idea is there its a comman method then we can directly write inside the Car class but if we Write inside Car class directly then its not visible to end-user 
 its not showing on the user Interface thats problem Before java 8 Version.
  



*/