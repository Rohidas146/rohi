package InheritancePractice;


	
 public class SingleInheritance{
		void eat() {
			
			System.out.println("eating");
	}
	}
	
	class tiger extends SingleInheritance {
		void bark() {
			System.out.println("barking");
	}
	}
	
	class TestInheritance{
	public static void main(String[] args) {
		tiger d=new tiger();
            d.bark();
            d.eat();
	}
	}
	

	

