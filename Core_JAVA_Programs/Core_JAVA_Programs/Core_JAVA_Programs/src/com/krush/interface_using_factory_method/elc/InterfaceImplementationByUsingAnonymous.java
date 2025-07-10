package com.krush.interface_using_factory_method.elc;

import com.krush.interface_using_factory_method.blc.PrinterDemo;

public class InterfaceImplementationByUsingAnonymous {

	public static void main(String[] args) {
		
		PrinterDemo pd=new PrinterDemo();
		
		
		pd.print();
		
		pd.getPrinter().print();
		
		
		
		

	}

}
