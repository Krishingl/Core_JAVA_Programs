package com.krush.object_class_equals_method;


class Customer
{
	int id ;
	String name;
	
	public Customer(int id ,String name)
	{
		this.id=id;
		this.name=name;
		
	}
    @Override
	public boolean equals(Object obj )//its Overriden method from Obejct Class
    {  
    	//Retreving the data from Current(First ) object
    	int id1=this.id;
    	String name1= this.name;
    	
    	// retreving the data from Second Object
    	 
    	//here we need to Down-Casting 
    	
    	Customer c2= (Customer) obj;
    	int id2=c2.id;
    	String name2= c2.name;
    	
    	if(id1==id2 && name1.equals(name2))
    	{ 
    	return true;
    	}
    	
    	return false;
    	
    }
    
	
}

public class EqualsDemo2 {
  public static void main(String[] args) {
	
}
}
