package com.krush.dynamic_object_creation;

class  Student{
	
	public void greet()
	{
		System.out.println("Greeting from Student..!");
	}
}


public class DynamicObjectCreation
{
     public static void main(String args[]) throws InstantiationException
	 {
	      try {
			  
		  
		  @SuppressWarnings("deprecation")
		Object obj=  Class.forName(args[0]).newInstance();
		  
		  System.out.println(obj.getClass().getName());
		  
		  
		  Student stu = (Student) obj;
		  
		  stu.greet();
		  
		  }catch(ClassNotFoundException e)
		  {
			  System.out.println("");
			  
		  } catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	 
	 
	 }
	 

}
