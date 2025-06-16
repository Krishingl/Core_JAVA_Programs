package com.krush.method_overriding.blc;

public class PartTimeEmployee extends Employee {

	protected double hourlyRate;
	  protected int hoursWorked; 
	
	public PartTimeEmployee(int id , String name, double hourlyRate,int hoursWorked) {
		super(id,name);
		
		if(hourlyRate < 0) {
			System.err.println("Employee hourly rate can't be zero OR Negative");
			
			System.exit(0);
		}
		
		if(hoursWorked < 0) 
		{		
			System.out.println("Employee hours of work can't be Negative");
			System.exit(0);
		}
		
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		
		
		
	}
	@Override
	public double calculateSalary() {
		return hourlyRate* hoursWorked;
	}
}
