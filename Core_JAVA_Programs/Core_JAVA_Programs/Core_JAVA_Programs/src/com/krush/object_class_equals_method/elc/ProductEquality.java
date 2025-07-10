package com.krush.object_class_equals_method.elc;

import com.krush.object_class_equals_method.blc.*;;

public class ProductEquality 

{
   public static void main(String args[])
   {
	   
	   Product p1= new Product(111,"LAPTOP");
	   
	   Product p2= new Product(111,"LAPTOP");
	   
	   
	   System.out.println("Two Product Object Content Compare Is Same ?" +p1.equals(p2));
	   
	   //Its is confirm if two  Product object  are  comparing with the help of equals(Object obj) Overriden method then its hashCode() is 100% same.
	   
	   System.out.println("p1 HashCode is : "+p1.hashCode() +"  and  P2 HashCode is "+ p2.hashCode() );
	   
	   
	   
	  System.out.println("-------------------------");
	  
	  System.out.println("Here we are trying to compare Product Obejct to Employee Object ");
	  
	  Employee e1 = new Employee (112,"santosh");
	  
	  
	  System.out.println("equals method Overriden in Product class we are pasing the argument as Employee Object : "+p1.equals(e1));
	  
	  System.out.println("HashCode of :"+p1.hashCode()+":"+e1.hashCode());
	  
   }
	
}
