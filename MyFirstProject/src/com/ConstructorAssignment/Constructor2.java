package com.ConstructorAssignment;

public class Constructor2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Constructor2 obj=new Constructor2();
	     Constructor2 abc=new Constructor2(4);
		}

		public Constructor2() {
		System.out.println(" i am in no parameter constructor ");	
		}
		
		public Constructor2(int ab) {
			System.out.println(" i am parameterzied constructor ");
		}
		
	}


	