package com.krush.enum_in_java.blc;

public class Clerk extends Employee {
	
	
	private	int speed;
	 private  int accuracy;
	     public Clerk(String name, int id, double salary,int speed, int accuracy) 
	     {
				super(name,id ,salary);
				this.speed = speed;
				this.accuracy = accuracy;
			}
		  
	     public Clerk() {
				
			}
		  
			public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getAccuracy() {
			return accuracy;
		}
		public void setAccuracy(int accuracy) {
			this.accuracy = accuracy;
		}
		boolean isIncrement=false;
		@Override
		public void setSalary(double sal){
			
			if(speed>70 && accuracy>80&& !isIncrement) {
				super.setSalary(sal+1000);
			}else {
				super.setSalary(sal);
			}
		
		}
		
		
}
