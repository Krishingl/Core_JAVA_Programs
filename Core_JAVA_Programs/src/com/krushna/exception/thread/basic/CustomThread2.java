package com.krushna.exception.thread.basic;



class Player extends Thread
{
  public void run() {
	  System.out.println("Hello I am Player1 class Thread...!");
  }
}


public class CustomThread2 //extends Player
{
	
	public static void main(String args) {
		
		System.out.println("Thread Main Started...!");
		
		
	//	System.out.print("Main method isAlive : "+(new CustomThread2().isAlive()));
		Player player1 = new Player();
		
		
		player1.start();
		
	
	}
	
	
	

}
