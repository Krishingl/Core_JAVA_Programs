package com.krush.enum_in_java.els;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.krush.enum_in_java.blc.Clerk;
import com.krush.enum_in_java.blc.Employee;
import com.krush.enum_in_java.blc.Manager;
import com.krush.enum_in_java.blc.ManagerType;

public class EmployeeTester {

	public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	     

	        List<Employee> employeeList = new ArrayList<>();
	        int choice;
	      try(sc){
	    	  do {
	    	  System.out.println("\n---- Employee Management Menu ----");
	            System.out.println("1. Add Manager");
	            System.out.println("2. Add Clerk");
	            System.out.println("3. View All Employees");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
                            
	            switch(choice) {
	            
	            case 1->
	            {sc.nextLine(); // consume newline
	                    System.out.print("Enter Manager Name: ");
	                    String mName = sc.nextLine();
	                    System.out.print("Enter ID: ");
	                    int mId = sc.nextInt();
	                    System.out.print("Enter Base Salary: ");
	                    double mSalary = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.print("Enter Manager Type (HR/SALES): ");
	                    String typeStr = sc.nextLine().toUpperCase();
	                    ManagerType mType = ManagerType.valueOf(typeStr);
	                    Manager m = new Manager(mName, mId, mSalary, mType);
	                    employeeList.add(m);
	                    System.out.println("Manager added successfully.");
	            }
	            
	            case 2->
	            {
	            	sc.nextLine();
                    System.out.print("Enter Clerk Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int cId = sc.nextInt();
                    System.out.print("Enter Base Salary: ");
                    double cSalary = sc.nextDouble();
                    System.out.print("Enter Typing Speed: ");
                    int speed = sc.nextInt();
                    System.out.print("Enter Accuracy: ");
                    int acc = sc.nextInt();

                    Clerk c = new Clerk(cName, cId, cSalary, speed, acc);
                    employeeList.add(c);
                    System.out.println("Clerk added successfully.");
	            }
	            case 3->{
	            	  System.out.println("\n--- Employee Records ---");
	                    for (Employee e : employeeList) {
	                        System.out.println(e.toString());
	                    }
	            } 
	            case 4->
	            {   System.out.println("Exiting... Goodbye!");
	            	
	            }
	            default->
                    System.out.println("Invalid choice."); 
            	  
	            }
	      } while (choice != 4);

 

  
	            	  
	            	  
	              }catch(Exception e) 
	              {
	            	  System.out.println(e.toString());
	             
	              }
	     
	     
	     
	     
}
}
	               
	     
