package com.krushna.arrays_in_java.basic;
//WAP to hold 5 Course array Object in array, 
//Write a logic to find any Duplicate course in available by using id.
record Course(Integer id , String name ,Double price)
{
	
	
}
public class ArrayEx15 {
   
	public static void main(String[] args) {
		
              Course courses[]= new Course[5];
              
              courses[0]= new Course(1,"java",17000D);
              courses[1]= new Course(2,"HTML",11000D);
              courses[2]= new Course(3,"Oracle",7000D);
              courses[3]= new Course(4,"css",9000D);
              courses[4]= new Course(1,"java",17000D);
              
              
              boolean isDuplicate = false;
              
              for(int i=0 ;i< courses.length;i++) {
            	  
            	     for(int j= i+1;j<courses.length;j++) {
            	    	 if(courses[i].id()==courses[j].id()) {
            	    		 System.out.println("Duplicate Course found with id :"+courses[j].id());
            	    	 isDuplicate=true;
            	    	 }
            	     }
            	  
            	  
              }
              
              if(!isDuplicate)
        	  {
        		System.out.println("Duplicate data not found...!");  
        	  }
        	  
        	  
	}

}
