package com.krush.method_overriding.elc;

import java.util.Scanner;

import com.krush.method_overriding.blc.Employee;
import com.krush.method_overriding.blc.FullTimeEmployee;
import com.krush.method_overriding.blc.PartTimeEmployee;

public class EmployeeSalary {

	
	public static void main(String ... args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("	***Salary Calculation Menu***		\r\n"
				+ "		 1) FullTime Employees \r\n"
				+ "		 2) PartTime Employees  \r\n"
				+ "Please select the Employee type");
		
		
		int choice = Integer.parseInt(sc.nextLine());
		
		
		Employee em= null;
		
		switch(choice)
		{    
		case 1:   System.out.print("Enter Fulltime Employee Id :");
		  int id= Integer.parseInt(sc.nextLine());
		  System.out.print("Enter Fulltime Employee Name :");
		  String name= sc.nextLine();
		  System.out.print("Enter the Salary :");
		  double salary= Double.parseDouble(sc.nextLine());
		  em= new FullTimeEmployee(id,name,salary);
		  System.out.println(name+" Salary is :"+em.calculateSalary());
		  
		  break;
		case 2:
			 System.out.print("Enter Fulltime Employee Id :");
			 id= Integer.parseInt(sc.nextLine());
			  System.out.print("Enter Fulltime Employee Name :");
			  name= sc.nextLine();
			  System.out.print("Enter your hourly rate:");
			  double hrate=Double.parseDouble(sc.nextLine());
			  System.out.print("Enter your total works hour in the month :");
				 int whour= Integer.parseInt(sc.nextLine());
			
			    em=new PartTimeEmployee(id,name,hrate,whour);
			    System.out.println(name+" Salary is :"+em.calculateSalary());
			    
			    break;
			    default : System.out.println("Select the valid Option");
		}
		
	}
}
