package com.krush.method_orverloding_compiler_process.most_specific_data_type_rule;



public class Test1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		Test1 t= Test1.class.newInstance(); 
		t.accept(10);
		t.accept(10d);
		t.accept(10.0);
		t.accept(10.0f);
		
		
	}
	
	
	
	public void accept(double d)
	{
		
		System.out.println("double printed ");
		
		
	}
	public void accept(float d)
	{
		
		System.out.println("float  is having more priority because its more Specific as compare to double.");
		
		
		
	}
	
//	public void accept(long a)
//	{
//		
//		System.out.println("float  is having more priority because its more Specific as compare to double.");
//		
//		
//		
//	}
	

}
