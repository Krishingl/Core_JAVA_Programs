package com.krushna.exception;

import java.util.Scanner;

public class DivisionExample 
{
       public static int performDivision(int a, int b)
       {  
     	   if(b==0) {
    		   throw new ArithmeticException();
    	   }else
    	  return a/b;
    	 
       }
       
       public static void main(String args[]) {
    	   
    	   
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.print("Enter dividend : ");
    	   int a=sc.nextInt();
    	   System.out.print("Enter divisor : ");
    	   int b=sc.nextInt();
    	   try(sc){
    		 System.out.println("Result of division : "+  performDivision( a, b));
    		   
    		   
    	   }catch(ArithmeticException e) {
    		   System.out.println("ArithmeticException caught: Division by zero: dividend="+a+", divisor="+b+"\r\n"
    		   		+ "");
    	   }
    	   
    	   
       }
}



