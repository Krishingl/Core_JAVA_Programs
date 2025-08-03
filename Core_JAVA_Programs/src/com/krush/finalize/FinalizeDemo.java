package com.krush.finalize;

import java.awt.Label;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

record Product(int id,String name)
{
	
	
	@Override
	public void finalize()//came from Object class from sence 1.0
	{//where it will invoked just before the Object distraction it will invoked by gc.
		//we can write all the resource closing statement inside finalized method method but from java 9 version its daprecated with try with resources.
		
		System.out.println("Garbage Collector are Invoked then First it call internaly our finalized method based on wich object are eligible for gc.");
		
	}
}

public class FinalizeDemo {

	public static void main(String[] args) 
	{
            //Product object are Created
		Product product = new Product(111,"Krushna");
		product = null;//here Our product object are eligeble for gc 
		/*
		 * but gc are invoked only three conditions 
		    1) if our heap memory threashold limit is 60 to 70%
		    2) if we Take our thread into waiting maens sleep stated that time gc wich is demon thread its invoked and its called the finalize method.
		    3) also one way explicity also we can call gc by using java.lang.System class  in there one gc() static and native method are there we using this method call the gc in our heap memory
		    
*/
		   //now down side no any code means gc not invoked becase any contion not match.
		//blank;
		
		//now we are taking our thread as sleeping state 
  System.gc();
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		    
		    
		    Date date =new Date();
		    System.out.println(date);
			
		System.out.println(LocalDate.now());
	System.out.println(LocalTime.now());	
	System.out.println(LocalDateTime.now());
	
	System.out.println(ZonedDateTime.now());
	}

}
