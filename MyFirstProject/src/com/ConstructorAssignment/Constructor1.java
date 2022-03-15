package com.ConstructorAssignment;

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Constructor1 obj=new Constructor1();
                  obj=new Constructor1(4);
	}

	public Constructor1() {
	System.out.println(" i am in no parameter constructor ");	
	}
	
	public Constructor1(int ab) {
		System.out.println(" i am parameterzied constructor ");
	}
}
