package Methodoverriding;

public class Parent {

	public void Bike() {
		
		System.out.println(" i am parent class bike ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Child extends Parent{ //child (sub class is extending parent (super class)
	    
		// method overriding nothing but a mechanism to provided specific implementation of a method which is provided
		//by super class
		public void bike() {
			
			System.out.println(" i am child class bike ");
		}
		
		public static void main(String[] args) {
		}		
		Child obj=new Child();
		
		
		}
		
	}

		
	


