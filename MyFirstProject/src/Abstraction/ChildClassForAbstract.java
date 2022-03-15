package Abstraction;





public class ChildClassForAbstract extends FirstAbstractClass {
	
	
	public void M2() {
		System.out.println("i am abstract method M2 impliment in child class ");
		
	}

	public void M3() {
		System.out.println(" i am abstract method M3 impliment in child class ");
	}
	
	
	public static void main(String[] abc) {
		ChildClassForAbstract xyz=new ChildClassForAbstract();
		xyz.M1();
		xyz.M2();
		xyz.M3();
	}
}
