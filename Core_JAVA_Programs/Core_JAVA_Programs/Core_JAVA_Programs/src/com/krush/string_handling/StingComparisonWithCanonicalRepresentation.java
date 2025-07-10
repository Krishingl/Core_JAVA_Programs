package com.krush.string_handling;

public class StingComparisonWithCanonicalRepresentation {

	public static void main(String[] args) {
		
		String s1="Student";//Student object created in SCP area 
		
		String s2 = new String("Student");
		
		System.out.println("both are having same content? : "+(s1.equalsIgnoreCase(s2)?"yes":"no"));
		
	
		System.out.println("both are are pointing same object? : "+(s1==(s2)?"yes":"no"));
		
		//Here i am explicitly moving the s2 to heap area object pointing reference to SCP area.
		
		
		System.out.print("i am moving the s2 reference variable to  SCP area same object using the intern method String calss it directry poiting to scp are object  :"+(s2.intern()==s1)+"  :==> s1 and s2 pointing same object now both are equals ");
		
		//Actually intern() method  is use to place the string object to SCP are but if the same String object  are available from SCP are then its only return the address that is called canonical representation.
	
		
		
		
	}

}
