package com.krush.interface_deom1;


sealed  abstract interface Moveable {
	     int x=120;  //thats by default public final static field 
	    void  run();   //this method is public +abstract method

}



final class Car implements Moveable{
	
	
public  void run()
         {
	        System.out.println("Car is runnig");
	       
	    }
	
}
final class Bike implements Moveable{
	
	
public  void run()
         {
	        System.out.println("Bike is Running ");
	       
	    }
	
}