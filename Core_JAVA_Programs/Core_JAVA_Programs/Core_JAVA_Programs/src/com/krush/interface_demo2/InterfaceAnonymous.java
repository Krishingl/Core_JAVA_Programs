package com.krush.interface_demo2;

interface Student
{
	void writeExam();
}
public class InterfaceAnonymous 
{
	public static void main(String args[]) {
		
		
	    Student placement=new Student(){
	    	
	  
	    	public void writeExam() {
	    		System.out.println("placement Batch Student are writing Exam...! ");
	    	}
	    };
	    
	    Student reguler=new Student(){
	    	
	  	  
	    	public void writeExam() {
	    		System.out.println("reguler Batch Student are writing Exam...! ");
	    	}
	    };
	    
	    
	    
	    placement.writeExam();
	    reguler.writeExam();
	    
		
	}
	
	

}
