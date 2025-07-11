package com.krushna.exception_demo;
import java.util.Scanner;
class ExceptionHandlingDemo
{
    public static void main(String args[]){
    	
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("Enter the Value : ");
    	HandelException(sc.next(),sc);
    	
    }
   public static void HandelException(String str,Scanner sc){
          try(sc){
        	  
        		 if(!str.equalsIgnoreCase("null")) { 
        	 
        	  System.out.println("Length of the input string: "+str.length());
        		 }
           int a= Integer.parseInt(str);
           System.out.println("Converted to integer: "+a);
               
        	 
          }catch(NumberFormatException  |NullPointerException e ){
            if(e instanceof NumberFormatException){
                System.out.println("NumberFormatException: Input is not a valid integer.");
            }
            if(e instanceof NullPointerException){
                System.out.println("NullPointerException: Input is null."); 
            }
          }
    }
}