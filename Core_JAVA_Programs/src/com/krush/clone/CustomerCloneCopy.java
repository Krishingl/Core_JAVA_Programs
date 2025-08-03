package com.krush.clone;
class Customer implements Cloneable
//we are createing the clone of the of the object then it must be implementing the Cloneble Marker Intreface means its tell to jvm its a clonable object
{
	private Integer id;
	private String name;
	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
//	public Integer getId() {
//		return id;
//	}
	public void setId(Integer id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
        public  Object clone() throws CloneNotSupportedException //
        {
        	
        	return super.clone();//its protected method then ovrrideing its compulsory to create a clone object outside of the class and its throwing the checked exception that means handing is compulsory.
        }
	
	
}
public class CustomerCloneCopy
{
	public static void main(String[] args)
	{
		Customer c1= new Customer(111, "Scott");
		System.out.println(c1);
		try {
			  
			  Customer c2= (Customer)c1.clone();//Downcasting is Required
			  c2.setName("Mahesh");
			  c2.setId(123);
			                    //if we modify the c2 object data then c1 not modifed means its internaly following deep copy concept
			 System.out.println(c2);
			 
			
		}
		catch(CloneNotSupportedException e) {
			
		}
	}

}


























































