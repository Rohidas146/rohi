package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticOperators obj=new ArithmaticOperators();
		obj.add(2, 3);
		obj.sub(3, 1);
		obj.multi(2, 4);
		ArithmaticOperators.division( 5f, 2);
		ArithmaticOperators.modulus(5);
		
	}
    // this is for + Arithmetic operators
	public void add(int a, int b) {
	  System.out.println("this is + operator test " + (a+b));
	}
	
	public void sub(int a, int b) {
		  System.out.println("this is - operator test" + (a-b));
    }
	
	public void multi(int a, int b) {
		  System.out.println("this is * operator test" + (a*b));
	}
	
	public static void division(float a, int b) {
		  System.out.println("this is / operator test" + (a/b));
	}
	
	public static void modulus(int a) {
		  System.out.println("this is % operator test" + (a%2));
		}
	
	
    }
