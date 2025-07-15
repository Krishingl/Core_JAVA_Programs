package com.krushna.arrays_in_java.basic;
import java.util.*;

 record Student(int id,String name ) //Implicit Canonical Constructor in that parameter called as components
 {
	 Student//Compact Constructor
	 {
		//it is used to perform some validation 
	 }
}



public class CreateStudentArrayObjectHoldTheMultipeObjectsDynamicaly {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		try(sc){
	     System.out.println("Enter the no.of student : ");
	       
	     int size = sc.nextInt();
	            sc.nextLine();
	     Student[] students = new Student[size];
	     
	     
	     for(int i=0;i<students.length;i++) {
	    	 System.out.println("Enter the "+(i+1)+" Student Id : ");
    	     int id = Integer.parseInt(sc.nextLine());
    	     System.out.println("Enter the "+(i+1)+" Student Name : ");
    	    String name = sc.nextLine();
	    	
    	    students[i]= new Student(id,name);
	    	 
	     }
	     for(Student student :students) {
	    	 System.out.println(student);
	     }
	   
	     
	     
		}catch(InputMismatchException e)
		{
			System.out.println(e);
		}catch(ArrayStoreException e) {
			System.out.println(e);
		}
	}

}
