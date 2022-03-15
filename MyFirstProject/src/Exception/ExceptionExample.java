package Exception;

/*In this example we are having two methods M1 and M2
M2 is throwing exception */

public class ExceptionExample {
	
public static ExceptionExample obj;
int [] a;
	
public static void main(String[] args) { // caller method 
		// Creating object of class ExceptionExample and calling M1 method
		// so Main method is called method for M1
		obj=new ExceptionExample();
		obj.M1();
		System.out.println("I am from Main");
		
		
		
		/*
		 *Checked Exception - Which compiler force you to handle the exception
		 * FileNotFoundException is one of the type checked exception
		 * If you try to read a file then there is possibility that file is not found  
		 * Compiler force you to handle it through try catch or request to apply throws
		 * try { 
		 * 	FileReader obj1=new FileReader(new File(""));
		 *  
		 * }
		 * 
		 * catch (FileNotFoundException e) { 
		 * e.printStackTrace(); }
		 */

	}
	
	public void M1() {  //caller M1()
		//Here M2 is called by M! method so M1 is become caller method for M2
		M2();
		System.out.println("I am from M1");
		 
	}
	
	public  void M2() {
		 // new ArithmeticException().printStackTrace();
		// when you really have exception 
		 
		System.out.println("I am from M2");
		//unchecked 
		try {
			
		  	//NULL POINTER EXCEPTION 
		//	System.out.println(a.length);  // Array initialization is mandatory before use 
			//ARITHMETIC EXCEPTION --- M2 method will create exception object---Arithmetic 
		 try {
			 //Below statement will throw Arithmetic Exception
			//Exception ---unwanted event which terminate normal flow of execution
			System.out.println(10/0); 
		  // It will not execute any statement which are in try block as above statement will throw exceptions
		  //that is reason it is recommended to put only risk code within the try block
		  System.out.println("This is within the try after exception"); //this will not be executed
		 	} catch (ArithmeticException j) {
		 		System.out.println("THis is inside exception"); 
		 	}
		 System.out.println(a.length);
		
		}
		// When you write multipe catch block then child class should be written first
		  catch (ArithmeticException p) { ////ARITHMETIC EXCEPTION
		  System.out.println("I am arithmetic exception"); }
		  
		  catch (ArrayIndexOutOfBoundsException k) {
		  
		  }
		// This is parent class exception 
		  catch (Exception p) { //p.printStackTrace(); //ARITHMETIC EXCEPTION
			  System.out.println(p.toString());
			  System.out.println("Finally i caugth the exception"); 
			  }
		 
		//finally block always execute whether there is exception or not 
		finally {
			  obj=null;//memory release
			System.out.println("This block is to release the resources at any cost");
		}
				
		}
}