package com.krush.object_class_equals_method;



class Student
{
    int sId;
    String sName;
    Student(int sId, String sName)
    {
    	this.sId=sId;
    	this.sName=sName;
    	
    }
	
    
    
	
	
	
}

public class EqualsDemo1 {
	
	public static void main(String[] args)
	{
		
	   Student s1= new Student(111,"Krushna");
	   Student s2= new Student(111,"Krushna");
	   //here two object created from diffrent memory location
	   
	   
	   //compare the thats object using the == operator.
	   System.out.println(s1==s2);//here we will get false because it will compare the Two Object Based on the object memory / object refference.
	   //s1 one object are created diffrent memory location and s2 diffrent location in the heap area that resion we will get false.
	     
	   
	   
	   //compare the s1 and s2 using object class equals(Object objt) method.
	   
	   
	   System.out.println(s1.equals(s2));
	   //here we will get false because it will compare the Two Object Based on the object memory / object refference.
	   //s1 one object are created diffrent memory location and s2 diffrent location in the heap area that resion we will get false.
	     //by default Object class equals method are checking only the objet reference based only if we want compare two boject based on the object content
	   //then we will should be Override the Object class equals method next program EqualsDemo to solve that problem solution.
	   
	   
	   
	   
	}
	
	


}
