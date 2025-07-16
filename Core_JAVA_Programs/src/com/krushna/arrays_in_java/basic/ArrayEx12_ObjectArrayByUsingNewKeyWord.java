package com.krushna.arrays_in_java.basic;
//Object array by using new Keyword using BLC classes.[trainer,Manager,SalesMan]

record  Manager(Integer id , String name)
{
	
	
}
record Trainer(String name , int experience) {
	
}

record SalesMan(Integer id , String name, Double totalSales)
{
	
}

public class ArrayEx12_ObjectArrayByUsingNewKeyWord {

	public static void main(String[] args) {
		 Object []arr = new Object[3];
		
		 arr[0]=new Manager(111,"scott");
		 arr[1]=new Trainer("Jokey",11);
		 arr[2]= new SalesMan(121,"zuber",120000D);
		 
		 
		 System.out.println("Printing Hetrogeneous Object : ");
		 
		 for(Object obj : arr) {
			 System.out.println(obj);
		 }
		 
		 
		 
		 
		 
		 
		 
	}

}
