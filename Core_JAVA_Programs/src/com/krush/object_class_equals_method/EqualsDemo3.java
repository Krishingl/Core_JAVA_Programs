package com.krush.object_class_equals_method;

class Product
{
	
	int id ;
	String name;
	  
	Product(int id , String name){
		
		this.id=id;
		this.name= name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Product)
		{
			Product p2= (Product) obj;
			
			if(this.id==p2.id && this.name.equals(p2.name)) {
				
				return true;
			}else {
				
				return false;
			}
			
		} else {
			System.err.println("Comparesion Not Posible>.");
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}




public class EqualsDemo3 {

	public static void main(String[] args)
	{
         Product p1=new Product(111,"Laptop");
         
         Product p2=new Product(111,"Laptop");
         
         Product p3=new Product(112,"Mobile");
         
         
         //if the two object are eqaules by using equals() method its a 100% garenti  there hashCode is  Same
         System.out.println("Compare Object P1 And P2: "+p1.equals(p2) +"  hashCode p1 : "+p1.hashCode()+"  hashCode p2 : "+p2.hashCode());
        
	}

}
