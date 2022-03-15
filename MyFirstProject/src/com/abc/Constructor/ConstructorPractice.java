package com.abc.Constructor;

public class ConstructorPractice { //

	int a;
	int b;
	boolean c;
	
	
	public ConstructorPractice() {  // no parametrized constructor 
	
    System.out.println("i am constructor ");
    this.a=34;
    this.b=33;
    this.c=true;
    
	}
    public ConstructorPractice(int a) { //a=10
    b=a;
    System.out.println(" i am parameterized ");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConstructorPractice obj=new ConstructorPractice(10);
     //object create+constructor call
     //what constructor....initialise the variable
     //If you don't provide....complier will add default constructor
     System.out.println(obj.a);
     System.out.println(obj.b);//10
     System.out.println(obj.c);
     ConstructorPractice obj1=new ConstructorPractice(5);
     System.out.println(obj1.a);
     System.out.println(obj1.b);//5
     System.out.println(obj1.c);
	}

}
