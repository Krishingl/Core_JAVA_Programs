package com.krushna.exception.thread.basic;

 class MyThread extends Thread
{
     @Override
    public void run()
     {   
    	 
    	 System.out.println("Thread-0 started");
    	 
    	 String name1 = new MyThread().currentThread().getName();
    	 
    	 System.out.print(name1);
    	 String name2 = new MyThread().currentThread().getName();
    	 System.out.print(name2);
    	 
    	 
     }
}
 
 public class CustomThread1 extends Thread
 {
	 public static void main(String[] args)
	 {

    	 
    	 System.out.println(new CustomThread1().currentThread().getName());
		System.out.println("Main Thread Started ..!!");
		
		MyThread mt = new MyThread();
		mt.start();//Thread class
		mt.start();
		System.out.println("Main Thread Ended ..!!");
		MyThread mt1 = new MyThread();
		
		mt1.start();
		mt1.isDaemon();

		mt1.setName("krushna"+mt1.isAlive());
	      
		
		System.out.print(Thread.activeCount());
		
	}
 }
