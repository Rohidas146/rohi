package System;

import java.util.Properties;

//import Java.io.PrintStream;

import Array.MultiDimensionalArray;

public class SystemExample {

	
	//public static PrintStream.out;
	// Below out1 variable is written by use in our class
	// Access modifier - public 
	// Variable type -mstatic
	//Data type - Non-primitive and which it is representing MultiDimensionalArray
	public static MultiDimensionalArray out1; //non-primitive data type
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SystemExample obj---Reference /object declaration
		// =new SystemExample();-----Object initialization

		SystemExample obj;
		obj=new SystemExample(); //Declaration + initialization
		
		
		System.out.println(SystemExample.out1);
		SystemExample.out1=new MultiDimensionalArray();
		System.out.println(SystemExample.out1);
		//System.err.println("i am error");
		// System.out.println()
		Properties prop=System.getProperties();
		prop.list(System.out);		
		
	}

}
