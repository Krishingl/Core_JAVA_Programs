package com.krushna.functional_interface;

interface Alpha {
//	default String toString(){//error
//
//		//A default method cannot override a method from java.lang.Object 
//	return null; 	
//}
}

public class InterfaceMember implements Alpha {

	public String toString() {
		return "Ambiguty issue because default method of interface and concrete method toString from Object class both are available in implementer class that reason its give to error and other reason in between default method and concrete method more priority have default method then in that Object class method are first available its execute then then default method we will give get error";
	}
}
