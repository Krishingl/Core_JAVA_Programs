package com.krushna.exception.thread.basic;

 class MyThread extends Thread
{
     @Override
    public void run()
     {
    	 
    	 
     }
}
 
 public class CustomThread1
 {
	 public static void main(String[] args)
	 {
		System.out.println("Main Thread Started ..!!");
		
		MyThread mt = new MyThread();
		mt.start();//Thread class
		
		System.out.println("Main Thread Ended ..!!");
		
	}
 }
