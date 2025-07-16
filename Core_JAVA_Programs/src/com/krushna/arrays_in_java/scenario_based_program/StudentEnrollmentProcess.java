package com.krushna.arrays_in_java.scenario_based_program;

import java.util.Scanner;

public class StudentEnrollmentProcess {

	public static void main(String[] args) {
		
		
		
		Course courses[]= new Course[3];
		  
		courses[0]= new Course(1, "Java",  35000D );
		courses[1]= new Course(2, ".net",  30000D );
		courses[2]= new Course(3, "Python",  32000D );
		
		Offer  offers[]= new Offer[2];
		offers[0]= new Offer("Special discount: Get 20% off on all courses!");
		offers[1]= new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		
		EducationInstitute institute = new EducationInstitute(courses, offers);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name:");
		  String name = sc.nextLine();
		
	Student student = new Student(name, institute);
	
	      student.viewCoursesAndFees();
           student.viewOffers();
          
           System.out.print(" Can You Want to enroll Any Course now (Y/N) : ");
            
           char select = sc.next().toLowerCase().charAt(0);
                
               if(select=='y') {
            	      
            	   System.out.print("Enter course ID to enroll:");
            	   
            	   int id = sc.nextInt();
            	   student.enrollInCourse(id);
            	   
               }else
            	   System.out.println("Thank you for Visiting...!");
              
           
         
		
		sc.close();
		
	}

}

record Course(Integer id, String name , Double fee) {
	
}

record Offer(String offers)
{
	
}

record EducationInstitute(Course []courses, Offer []offerse)
{
	
	
	
	public void enrollStudentInCourse(Integer courseId, String studentName)
	{    boolean flag=false;
		for(Course course : courses) {
				
			    if(course.id()==courseId) {
			    	
			    	System.out.println("Thank You for enrolling "+course.name()+" Course " + studentName);
			    	flag=true;
			    }
			    
			    	
			    
		}
		if(flag==false)
		{
			System.err.println("Course Not Found");
		}
	
	}
		
	
}



record Student(String name,EducationInstitute institute) 
{
	//In this method display all the courses information for student like course id, name and 
	//fees.
	public void viewCoursesAndFees()
	{	
		       for(Course course :institute.courses()) {
		    	   
		    	   
		    	
		    		   System.out.println(course.id()+" : "+course.name()+" : "+course.fee());
		    	
		       }
//		     
	}
	
	public void viewOffers() {
		for(Offer o :institute.offerse()) {
	    	   System.out.println(o.offers());
	    	   
	    	 
	       }
		
	}
	
	public void enrollInCourse(Integer courseId) {
		
		//In this method write the logic so, student can take admission in the course based on the
		//courseId
	    
		institute.enrollStudentInCourse(courseId, name);
		
		
	
		

		
	}
}


