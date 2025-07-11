package com.krushna.exception_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo{


    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int a=sc.nextInt();
        System.out.print("Enter the a value : ");
        int b=sc.nextInt(); 
        try(sc){
       
     
             System.out.println(a/b);
        }
       catch(InputMismatchException ex){

            System.out.println(""+ex.getMessage());
            System.out.println(""+ex.toString());
            System.out.println("InputMismatchException occurred. Please enter only integer numbers.");
            ex.printStackTrace();
        }
        catch(ArithmeticException e) {
        	 System.out.println(""+e.getMessage());
             System.out.println(""+e.toString());
             System.out.println(a+"/"+b+" invalid its infinity.." );
             e.printStackTrace();
        }
    }
}