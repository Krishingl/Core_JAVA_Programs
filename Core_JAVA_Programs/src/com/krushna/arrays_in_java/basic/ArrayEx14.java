package com.krushna.arrays_in_java.basic;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Serializable;
import java.util.Arrays;

//WAP to hold 5 player array Object in an array, search the player based on the id using Scanner class.
@SuppressWarnings("unused")
public class ArrayEx14 {

record Player(Integer id, String name,Double basePrice ) {
		
		
	
		
		
	}
	
	public static void main(String[] args) 
	{
		    Player[] players=new Player[5];
		    players[0]= new Player(45,"Rohit Sharma",455555d);
		    players[1]= new Player(18,"Virat Kohli",955555d);
		    players[2]= new Player(93,"Jaspit Bhumra",355555d);
		    players[3]= new Player(07,"Ms Dhoni",1055555d);
		    players[4]= new Player(33,"Hardik Pandya",8955555d);
		    
		    Scanner sc= new Scanner(System.in);
		    
		    try(sc){
		    	
		    	System.out.print("Enter the player id : ");
		    	int id = Integer.parseInt(sc.nextLine());
		    	boolean flag=false;
		    	 for(Player player : players) {
		    		 if(player.id()==id) {
		    			 System.out.println("Player Found  with "+id+"  : "+player);
		    			   flag=true;
		    		 }
		    	 }
		    	    if(flag == false) {  	
	    			 System.err.println("Player not Found given ID : " +id +" try Again..!");
		    	    }
		    }catch(InputMismatchException e) {
		    	  System.out.println();
		    }
		    
		    
		    
	}

}
