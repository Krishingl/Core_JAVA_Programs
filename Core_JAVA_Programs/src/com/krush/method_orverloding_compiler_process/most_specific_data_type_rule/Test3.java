package com.krush.method_orverloding_compiler_process.most_specific_data_type_rule;


final  class Test3{
	 
	public static void main(String[] args) {
		
		
		
		Test3 t= new Test3();
		
		
		
		System.out.println("int var-args is exicuted because passed multiple number of parameter "+(t.accept(11,1,65,Integer.parseInt("123"),1,1,1) ));
	
	t.accept(1);
int a=	t.accept(Integer.valueOf(12)); // int to wrapper object created and passed to the Integer reference variable 
 


System.out.println("Integer object converted into int (unboxing)  : "+a);
	
    t.accept(12);
    
  t.accept("12".toLowerCase().charAt(0));  //method chaining concept


	
	}
	
	
	 final public void accept(char b)
	{
		
		System.out.println("char ");
	}
	  final   public void accept(int a)
	{
		
			System.out.println("int ");
	}
	  final   public int accept(Integer a)// it accept the  values
	{
			System.out.println("Integer and its return value ");
		return a;
	}
	
	  final   public int  accept(int ... a)
		{
			 int sum=0;     
		     for(int k : a) {
		    	 
		    	 sum+=k;
		    	 
		     }
		  
			return sum;
		}
	  
	  
} 