package com.krush.string_handling;

public class DiffrenceStringObjectCreatedStringLitterlOrNewKeyword {

	public DiffrenceStringObjectCreatedStringLitterlOrNewKeyword() {
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		
		
		
		String s1 = "India"; // one object created in the SCP area in side heap area.
		
		
		String s2 = new String("Java"); // here two object are created one is due to new keyword and constructor in side the heap area and other Object due to String litters inside SCP area
	//means here total two object are created
	    System.out.println("check S1 "+s1.intern());//India
	    
   
int s3="India".hashCode();

//new object are not created  because its available in SCP area India.
// but hear  conform every time String litter are created one object in SCP area.


System.out.println("hear  conform every time String litter are created one object in SCP area. s1 and 'India'   : "+( s1.hashCode()==s3));

    Thread.sleep(2000);


 String s4="Java";
  
 System.out.println("here first  check the s2 and s4 are created in SCP area or not : "+(s2==s4)+" its false means the s4 object are created in the SCP area inside heap and S2  are created inside the heap and scp area but scp area 'Java' object refered by s4 now "+'\n');
 
 // here I WANT TO POINT THE S2 CREATED OBJECT TWO OBJECTS 1 IS IN HEAP AREA DUE TO THE NEW KEYWORDND 2ND  IS CREATED DUE TO STRING LITTRLS("") IN THE SCP AREA BUT NOW S2 ARE POINTING TO ONLY ONE OBJECT IN THEAT HEAP AREA BECAUSE ITS CREATED BY NEW KEYWORD AND SCP AREA OBJECT 'Java' IS UNREFERANCE OBJECT THEN AFTER S4 ARE REFERED THAT OBJECT.
 
 
 // WE WANT POINT THE S2 SCP AREA OBJECT THAT RESION WE EXPLICITLY CALLING THE INTER METHOD 
  
 s2=s2.intern();
 
 System.out.println("both are pointing to same address in the SCP : "+(s2==s4));
 
 
 
	    
	    
	    
	
	
	}

}
