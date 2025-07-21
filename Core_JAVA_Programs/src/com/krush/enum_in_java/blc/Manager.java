package com.krush.enum_in_java.blc;

public class Manager extends Employee 
{
	private ManagerType type;
	
	
	public Manager()
	{
		
	}
	public Manager(String name, int id, double salary,ManagerType type) {
		super(name,id ,salary);
		this.type = type;
	}
	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}
	@Override
	public void setSalary(double sal) {
		if(type.equals(ManagerType.HR)) 
		{
			
		  super.setSalary(sal+10000);
		}else
		{
			super.setSalary(sal+5000);
			
		}
	}

}
