package com.krushna.custom_exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarTest {

	public static void main(String... as) {
		
		Scanner sc = new Scanner(System.in);
		
		try(sc) {
			System.out.print("Enter Car is Status (stop or go) : ");
			String str1= sc.next();
			CarTest.stop(str1);
			
			System.out.print("Enter Car Condition (puncture or not) : ");
			String str2= sc.next();
			CarTest.puncture(str2);
			
			System.out.print("Enter Car Engien Tempreture  : ");
			int i1= sc.nextInt();
			CarTest.carHeat(i1);
			
			
			System.out.println("Car Helth is Good...!");

		} catch (CarStoppedException |CarHeatException|CarPunctureException ex) {
			System.err.println(ex.getMessage());
		}catch(InputMismatchException ex) {
			System.err.println("InValid Tempreture input it must be Integer");
		}
		
		
		
		
		
	}

	public static void stop(String error) throws CarStoppedException {
		if (error.equalsIgnoreCase("stop")) {

			throw new CarStoppedException("Car stopped for some reason.");
		} else
			System.out.println("Car not stalled.");
	}

	public static void puncture(String error) throws CarPunctureException {
		if (error.contentEquals("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		} else {
			System.out.println("Car not punctured.");
		}
	}

	public static void carHeat(int carTemp) throws CarHeatException {
		if (carTemp > 50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		} else {
			System.out.println("Car temperature normal.");
		}
	}
}
