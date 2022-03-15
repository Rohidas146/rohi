package Abstraction;

public abstract class MultipleAbstractClass {

	public abstract void ReverseNumber();
	}

	// Child class is not implementing abstract method of parent so child will also become abstract
	abstract class ChildAbstract extends MultipleAbstractClass{
		
		public abstract void NoNumber();
	}
	//Again child is only implementing single abstract method out of two so it will also 
	//become abstract class
	abstract class anotherChlild extends ChildAbstract{

		
		public void NoNumber() {
			// TODO Auto-generated method stub
			
	}


	}
	// This class only need to implement ReverseNumber abstract method as Nonumber is already
	//implement by parent class 
	class finalclass extends anotherChlild{

		public void ReverseNumber() {
			// TODO Auto-generated method stub
			
	}
		
	}


