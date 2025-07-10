package com.krush.method_overriding.blc;

public class Employee {
	
	protected int id;
	protected String  name;
	
	
	
	public Employee(int id,String name) {
		
		
		this.id=id;
		this.name=name;
		
	}
	
	
	public double   calculateSalary()
	{
		return 0.0; //its a generic salary
	}

}
