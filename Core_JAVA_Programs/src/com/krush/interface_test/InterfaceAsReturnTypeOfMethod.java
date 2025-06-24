package com.krush.interface_test;

interface Games {

	String memory_space = "1GB";

	void start();// public +abstract ;

	void end();

}

class PubG implements Games {

	public PubG() {

	}

	@Override
	public void start() {
		System.out.println("Pubg Game is started.....");

	}

	@Override
	public void end() {
		System.out.println("Pubg Game is ended");

	}

}

class FreeFire implements Games {

	public FreeFire() {

	}

	@Override
	public void start() {
		System.out.println("FreeFire Game  is started.....");

	}

	@Override
	public void end() {
		System.out.println("FreeFire Game is ended");

	}

}

public class InterfaceAsReturnTypeOfMethod {
	public static Games getGame(int choice) // we can use the interface name as a return type means we can pass any
											// implimenter Object
	// we can achived more the flexibity to pass any object that is factory method
	// because its create a object
	{

		if (choice == 1) {

			return new PubG();

		} else {
			return new FreeFire();
		}

	}

	public static void main(String s[])

	{
		getGame(1).start();
		getGame(2).start();
		getGame(1).end();
		getGame(2).end();

	}

}
