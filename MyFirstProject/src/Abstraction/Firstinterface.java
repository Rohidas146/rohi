package Abstraction;

public interface Firstinterface {
   
	// within interface if we declare it need to be initialization
	//Each and every variable will be static and final
	 int a=2;
	
	// after compilation variable name  will be like below 
	// public static final int=2;
	
	//within interface you will only have static variable
	 
	// iff you try to add another access modifier , you will compilation error
	// protected int b;
	
	// No need to add abstract keyword
	// by default only public access modifier is allow
	
	// within interface till java 8 you will have only abstract instance method
	 int add();
	 int sub();	
	 
	 //As each and every method is abstract by default after compilation defination will change as
	   //public abstract void add();
	 
	}
	

