package com.krushna.exception_demo;

 import java.util.Scanner;
 public class ArrayIndexExceptionDemo{
    public static void main(String args[]){
          int a[] = new int[2];
   a[0] = 10;
   a[1] = 20;

    Scanner sc= new Scanner(System.in);
      
  try(sc){
    
          System.out.println(" enter an index value : ");
        int n= sc.nextInt();

        System.out.print(a[n]);
  }catch(ArrayIndexOutOfBoundsException e){
    System.out.println(  e.getMessage());
System.out.println("-------------------------------");
    System.out.println( e.toString());
    System.out.println("-------------------------------");
    e.printStackTrace();
    System.out.println("-------------------------------");
    System.out.println( "Invalid Index");

    
  }


    }


}
