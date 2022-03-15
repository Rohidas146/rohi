package Abstraction;


//You need to use implements keyword when trying to extend interface
//Compiler will give error to provide implementation for abstract method from interface

public class InterfaceImplementationClass implements Firstinterface {
	



	public static void main(String[] args) {
		InterfaceImplementationClass abc=new InterfaceImplementationClass();
		abc.add();
		abc.sub();
		System.out.println(a);
	}
    // instance non static method
	public int add() {
		System.out.println(" i am add method of interface");
		return 0;
	}
	
	public int sub() {
		System.out.println(" i am sub method of interface");
		return 0;
	}
}
	

