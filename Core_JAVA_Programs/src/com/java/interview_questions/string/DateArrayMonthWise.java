package com.java.interview_questions.string;

public class DateArrayMonthWise 
{
       public static void main(String[] args)
       {
		     String [] months= {
		    		  "01", "02", "03", "04", "05", "06",
		              "07", "08", "09", "10", "11", "12"
		     };
		     
		     int[] daysInMonth= {
		    		  31, // Jan
		              28, // Feb (2025 is not a leap year)
		              31, // Mar
		              30, // Apr
		              31, // May
		              30, // Jun
		              31, // Jul
		              31, // Aug
		              30, // Sep
		              31, // Oct
		              30, // Nov
		              31  // Dec
		     };
		     
		     
		     String [] allDates= new String[365];
		     int index=0;
		     
		     
		     for(int i=0;i<12;i++) {
		    	 
		    	 
		    	 
		    	 for(int day=1;day<=daysInMonth[i];day++) {
		    		 String dd= (day<10) ? "0"+day: String.valueOf(day);
		    		 String date = dd+"-"+months[i]+"-2025";
		    		allDates[index++]=date;
		    		 
		    	 }
		     }
		        System.out.println("All dates of year 2025:");
		        for (String date : allDates) {
		            System.out.println(date);
		        }
		     
	    }
}
