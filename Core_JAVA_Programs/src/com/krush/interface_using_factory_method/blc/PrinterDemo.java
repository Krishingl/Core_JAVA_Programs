package com.krush.interface_using_factory_method.blc;

public class PrinterDemo implements Printer {

	@Override
	public void print() {
		   
		System.out.println("Printing PrinterDome Class Inside");
		
	}
	public Printer getPrinter() {
		return new Printer() {

			@Override
			public void print() {
				System.out.println("Printing PrinterDome Anonymous Inner Class Inside Class Inside");				
			}
			
			
			
		};
	}

}
