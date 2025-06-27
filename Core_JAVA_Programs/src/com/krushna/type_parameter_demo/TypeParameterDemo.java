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
	
	
	

}


public class TypeParameterDemo{
	
	
	
	public static void main(String args[]) 
	{
		
		Box<Integer> intType = new Box<Integer>(12);
		System.out.println("Integer Type :"+intType.getData());
		
		
		
	}
}