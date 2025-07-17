package com.krushna.arrays_in_java.basic;
import java.util.Arrays;


record Employee(int id ,String name,Double salary)  implements Comparable<Employee>

{
	
	
	
	public int compareTo(Employee e2) {
		return  Integer.compare(this.id, e2.id);  //natural sorting 
	}
	
	
}

public class ArrayEx16 {

	public static void main(String[] args) {
		
	
	      Employee [] employees = new Employee[4];// Array Declaration
	      
	      
	      //employee array intialization 
	      employees[0]= new Employee(111,"Scott",12000D);
	      employees[1]= new Employee(222,"Zuber",12000D);
	      employees[2]= new Employee(444,"Josefb",15000D);
	      employees[3]= new Employee(333,"Joyyel",12000D);
	      
	      //Before sorting 
	      System.out.println("Before Sorting :-");
	      for(Employee employee :employees)
	      {
	    	  System.out.println(employee.id() + " :: "+ employee.name()+ " :: "+ employee.salary());
	      }
	      
	       
	      
	      //Arrays Class Provide public static void sort(Object[]  a) method to perform sorting
	       Arrays.sort(employees);//internaly its work on compareTo method only
	      
	     //After sorting based on the Employee id
	       System.out.println("After Sorting :-");
	       for(Employee employee :employees)
		      {
		    	  System.out.println(employee.id() + " :: "+ employee.name()+ " :: "+ employee.salary());
		      }
		      
	      
	      
	      
	      /*Because we can return the comparable logic based on the id sorting we can 
	       not perform diffrent diffrent logic by using comparable interface.
	        because Comparable interface having compareTo() method they are thaking single paramenter that its are depends on the current Object(this)
	        */
	      
	      
	      //if we want perform decending order sorting then its not posible because we need to modify our BLC class change in that logic 
	        // lets i try with logic
	       
	    
	      

	}

}
