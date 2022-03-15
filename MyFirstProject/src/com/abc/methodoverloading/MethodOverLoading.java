package com.abc.methodoverloading;

public class MethodOverLoading {
	
	public static void main(String[] args) { //method body
		// TODO Auto-generated method stub
		
		MethodOverLoading bjp=new MethodOverLoading(); //object create
		bjp.multiplication(2, 4);
		bjp.multiplication(2.5, 2); //method calling
		bjp.multiplication(2, 3.5, 4);
		bjp.multiplication(2.2, 3.3, 2);
	}
	
	
	//access modifier/return type /main method(parameter/argument)
	public void multiplication(int a, int b) {
	System.out.println("multiplication of two int parameter" + a*b);	
	
	}
	public void multiplication(double a, int b) {
	//create method body	
	double d=a*b;//local variables
	System.out.println("multiplication of double and int parameter "  + d);
	
	}
	
	public void multiplication(int a,double c, int b) {
	double m=a*c*b;
	System.out.println("multiplication of int and double and int parameter " + m);
	}
	
	public int multiplication(double  a,double c, int b) {//it must have to return type
	double h=a*c*b;	
	System.out.println("multiplication of double and double and int parameter " + h);
	return b;
	}

	
	}
