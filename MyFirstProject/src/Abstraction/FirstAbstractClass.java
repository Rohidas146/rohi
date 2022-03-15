package Abstraction;

//Whenever you add abstract non-access modifier in class it become abstract class
//A Abstract class can have a zero or any number of abstract method
//But if you have a abstract method then it is mandatory to make class as abstract

 abstract class FirstAbstractClass {
        
	//Abstract class can have instance variable/static variable
		int a ;
		static int b;
		
		//Though you can't create object of abstract class but you can have a constructor
		public FirstAbstractClass() {
			
			System.out.println("I am abstract class but i can have constrcutor");
		}
		
		
		//M1 is instance method --This is normal method having implementation
		//to call instance method you need object but abstract class can't create object
		//So to class this method it can be called by child class object which extend this class
	 
	 
	public  void M1() {
		System.out.println(" There is no abstract method from abstract class ");

		//Abstract method
		//public abstract void M2(); //it is having only declaration
		//public abstract void M3(); //you can't create abstract method with private modifier
		//private abstract void M4();
		
		//public static void main(String[] args) {
			 //you can't create object of abstract class
		}

	}


