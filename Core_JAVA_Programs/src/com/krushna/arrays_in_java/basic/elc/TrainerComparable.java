package com.krushna.arrays_in_java.basic.elc;


import java.util.Arrays;
import java.util.Scanner;

import com.krushna.arrays_in_java.basic.blc.Trainer;

public class TrainerComparable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
             System.out.print("Eneter the Tariner Size : ");
		                 

		     Trainer [] trainers = new Trainer[Integer.parseInt(sc.nextLine())];
		               
		     
		          for (int i=0; i<trainers.length;i++) {
		        	  System.out.print("Enter the Trainer Id : ");
		        	  int id = Integer.parseInt(sc.nextLine());
		        	  System.out.print("Enter the Trainer Name : ");
		        	  String name = sc.nextLine();
		        	  System.out.print("Enter the Trainer Salary : ");
		        	  Double salary = Double.parseDouble(sc.nextLine());

		        	  System.out.print("Enter the Trainer Experience : ");
		        	  Integer experience = Integer.parseInt(sc.nextLine());
		        	  trainers[i]=new Trainer(id,name,salary,experience);
		        	  
		          }
		     
		     
		     
		     
//		     
//		             trainers[0]=new Trainer(1,"Ravi Sir",200000D,20);   
//		             trainers[1]=new Trainer(2,"Kishor Sir",180000D,18); 
//		             trainers[2]=new Trainer(3,"Natrajan Sir",300000D,16); 
//		            
		             
		      // ORIGNAL Trainer Array Object  DATA    
		   System.out.println("You are Entered Data Are : ");         
		             for(Trainer trainer: trainers) {
		            	 System.out.println("Trainer Id : "+trainer.id() +" :  Name :  "+trainer.name()+" :  Salary : "+trainer.salary()+" : Experience : "+ trainer.experience()+"\n");
		            	
		             }
		        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");    
		         System.out.println();
		        //Sorting Trainer Array Object Based On the Trainer Experinces   
		             
		         Arrays.sort(trainers);
		           
		         for(Trainer trainer: trainers) {
	            	 System.out.println("Trainer Id : "+trainer.id() +" :  Name :  "+trainer.name()+" :  Salary : "+trainer.salary()+" : Experience : "+ trainer.experience()+"\n");
	            	
	             }
		         
		      
		             //If we want sort in decending Order then we need to modify the our Trainer Blc class its not posible. we can change that logic to Decdending sorting logic then our acending shorting result are convertion in decending 
		                         // that problem solving purpose  now, I am  using Comparator 
		         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");    
		         System.out.println();
		         
		        Arrays.sort(trainers, (t1,t2)-> Integer.compare(t2.experience(),t1.experience()));
		             
		        
		         for(Trainer trainer: trainers) {
	            	 System.out.println("Trainer Id : "+trainer.id() +" :  Name :  "+trainer.name()+" :  Salary : "+trainer.salary()+" : Experience : "+ trainer.experience()+"\n");
	            	
	             }
		         
		    sc.close();  
	}
	

}
