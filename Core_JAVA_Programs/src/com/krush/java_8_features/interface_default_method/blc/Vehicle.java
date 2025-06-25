package com.krush.java_8_features.interface_default_method.blc;

public interface Vehicle {

	int MAX_SPEED=120;
	
	     void run();
	     void horn();
	     
	   /*  -------now its ok but i want to add  car inside one feature then if added inside the interface then its a kind of boundation 
	     because if we write inside interface digitalMetter() 
	     then its forceing the all implimeter classes you mast be override this method if not override then your abstract class.
	     in over mind then one idea is there its a comman method then we can directly write inside the Car class but if we Write inside Car class directly then its not visible to end-user 
	     its not showing on the user Interface thats problem Before java 8 Version.
	      
	      
	     then in java 8 version : the java software people are introduced one extra ordernary solution that is default method.
	     
	    * default : is keyword not a Access modifier.
	    
	     ** default method we can declare inside only the interface only and its contain Body.
	     *** default method access modifire is public 
	     **** this not compulsary to override all the implementer classes only they have this feature they can override (no kind of Boundation)
	     *****we cannot declare the default method inside the class and abstract class.
	     ****** defualt method cannot be static , final , abstract, priavte.
	     

	     */
	     
	     default void degitalMetter() {
	    	 
	    	 System.out.println("Digital Metter facility comming soon.........");
	    	 
	     }
	     
}
