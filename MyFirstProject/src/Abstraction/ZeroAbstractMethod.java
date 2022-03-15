package Abstraction;


//Whenever you add abstract non-access modifier in class it become abstract class
//A Abstract class can have a zero  abstract method
//But if you have a abstract method then it is mandatory to make class as abstract
public abstract class ZeroAbstractMethod {

	//Abstract class can have instance variable/static variable
		int a ;
		static int b;
		
		//Though you can't create object of abstract class but you can have a constructor
		public ZeroAbstractMethod() {
			
			System.out.println("I am abstract class but i can have constrcutor");
		}
		
		
		//M1 is instance method --This is normal method having implementation
		//to call instance method you need object but abstract class can't create object
		//So to class this method it can be called by child class object which extend this class
		 void M1() {
			System.out.println("There is no abstract method from abstract class ");
		}
		
		// This class is not having a single abstract method still class is abstract 
	}
