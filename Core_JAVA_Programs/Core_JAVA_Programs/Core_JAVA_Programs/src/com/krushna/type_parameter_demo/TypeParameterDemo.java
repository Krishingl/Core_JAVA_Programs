 package com.krushna.type_parameter_demo;

 class Box <T>{
	private T data;
	
	
	public Box(T data )
	{
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	
	Student getStudent(Student s) {
		return s;
	}
	

}


public class TypeParameterDemo{
	
	
	
	public static void main(String args[]) 
	{
		
		Box<Integer> intType = new Box<Integer>(12);
		System.out.println("Integer Type :"+intType.getData());
		
		
 		Box<String> stringType = new Box<String>("krushna Ingle");
 		
 		
 		System.out.println("String Type : "+stringType.getData());
 		
Box<Double> doubleType = new Box<Double>(53.54);
 		
 		
 		System.out.println("Double Type : "+stringType.getData());
 		
		
Box<Boolean> booleanType = new Box<Boolean>(true);
 		
 		
 		System.out.println("Boolean Type : "+booleanType.getData());
 		
 		
 		Box<Student> studentType = new Box<Student>(new Student());
 		 		
 		 		
 		 		System.out.println("Student Type : "+studentType.getStudent(new Student()));
 		 		
	}
}

class Student{
	Student(){
		
	}
	

	
	
     public String toSting() {
    	 return "hello  I am a Student";
     }
}