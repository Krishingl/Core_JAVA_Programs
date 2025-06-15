package com.krush.method_orverloding_compiler_process.most_specific_data_type_rule;

public class Test4 {
	
	public static void main(String[] args) {
		
		Test4 t= new Test4();
		t.accept(75);
	
	}
	final void accept(char a) {
		
		System.out.println(a);
		
	}
      
	  final int accept(int k) { 
		   
		  accept((char)k);
		return k;
		
	}
}   
/**
here one class create then two overloaded methods one accept int as parameter and another accept char as parameter.
inside mean method we are created object and thats object referred by t 
reference variable that reference variable throw we can call one accepts 
method that time compiler call first accept int as a parameter method inside  that we  write accept char as parameter then we ther converted explicitly int to char then its method called by compiler that reason we get output K.
*/