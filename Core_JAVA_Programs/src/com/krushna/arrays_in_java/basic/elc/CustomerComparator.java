package com.krushna.arrays_in_java.basic.elc;

import java.util.Arrays;
import java.util.Scanner;

import com.krushna.arrays_in_java.basic.blc.Customer;
;

public class CustomerComparator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		  System.out.println("Enter the No of Customer : ");
		  
		  
 Customer [] customers = new Customer[Integer.parseInt(sc.nextLine())];
 
    for(int i=0 ; i<customers.length;i++) {
    	
    	System.out.print("Enter the Customer Id : ");
    	Integer id = Integer.parseInt(sc.nextLine());
    	
    	System.out.print("Enter the Customer Name : ");
    	String name =sc.nextLine();
    	

    	System.out.print("Enter the Customer Id : ");
    	Double bill = Double.parseDouble(sc.nextLine());
    	
    	
    	customers[i]= new Customer(id,name, bill);
    	
    	
    }
 
 
 System.out.println(" Can You Want The Sort Your Customer data(Y/N) : ");
 boolean flag =false;
          if(sc.nextLine().toUpperCase().charAt(0)=='Y')
          {
        	  System.out.println("Great , Can you tell which Base you want Sort:"
        	  		+ "\nOptions:-"
        	  		+ "\n1. Id"
        	  		+ "\n2. Name"
        	  		+ "\n3. Bill");
        	  int choice =Integer.parseInt(sc.nextLine());
        	  switch(choice)
        	  {
        	  case 1: 
        		  System.out.println("Your are Selected Id based Sorting..!!!");
        		  
        		  System.out.println("Can you tell which Type of sorting you want :"
        		  		+ "\n1. Accending "
        		  		+ "\n2. Decendding");
        		       
        		   choice =Integer.parseInt(sc.nextLine());
        		         if(choice==1) {
        		        	 Arrays.sort(customers,(c1,c2)->Integer.compare(c1.id(), c2.id()));
        		         }else
        		         {
        		        	 Arrays.sort(customers,(c1,c2)->Integer.compare(c2.id(), c1.id()));
            		         
        		         }
        		         break;
        	  case 2:
 System.out.println("Your are Selected Name based Sorting..!!!");
        		  
        		  System.out.println("Can you tell which Type of sorting you want :"
        		  		+ "\n1. Accending Alphabetical sorting"
        		  		+ "\n2. Decendding Alphabetical sorting");
        		       
        		   choice =Integer.parseInt(sc.nextLine());
        		         if(choice==1) {
        		        	 Arrays.sort(customers,(c1,c2)->c1.name().compareTo(c2.name()));
        		         }else
        		         {
        		        	 Arrays.sort(customers,(c1,c2)->c1.name().compareTo(c2.name()));
        		         }
        		         break;
        		         
        		         
        	  case 3:
System.out.println("Your are Selected Bill Amount based Sorting..!!!");
        		  
        		  System.out.println("Can you tell which Type of sorting you want :"
        		  		+ "\n1. Accending sorting"
        		  		+ "\n2. Decendding sorting");
        		       
        		  choice =Integer.parseInt(sc.nextLine());
 		         if(choice==1) {
 		        	 Arrays.sort(customers,(c1,c2)->Double.compare(c1.bill(), c2.bill()));
 		         }else
 		         {
 		        	 Arrays.sort(customers,(c1,c2)->Double.compare(c2.bill(), c1.bill()));
     		         
 		         }
 		         break;
 		            
 		        default:  System.out.println("Invalid Option: ");
 		       flag=true;
        	  }
        	  if(flag == false) {
        		  
        		  for(Customer customer : customers) {
        			  
        			  System.out.println("Customer Id : "+customer.id() +" :: Name : "+customer.name()+"  :: Bill "+customer.bill());
        			  
        			  
        		  }
        	  }
        	  
        	  
        	  
        	  
        	  
          }
 sc.close();
 
 
	}

}
