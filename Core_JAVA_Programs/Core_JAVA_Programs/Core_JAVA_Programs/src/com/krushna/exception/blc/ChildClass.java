package com.krushna.exception.blc;

import java.io.Closeable;
import java.io.IOException;

public class ChildClass extends ParentClass implements Closeable {
	public void loadingClass(String className) throws ClassNotFoundException  
	{
		if(className.isBlank()) {
			throw  new IllegalArgumentException();
		}else {
			super.loadingClass(className);
		}
		  
	   }

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
