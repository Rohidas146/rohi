package Abstraction;


//Parent RBI has one implemented method as PinVerification 
//but one abstract method as CashWithdraw
abstract class RBI {
	
	public void PinVerification() {
		
		System.out.println("Ask user to enter four digit pin");
	}
	
	public abstract void CashWithdraw() ;
	
	public static void one() {
		
	}
	//static and abstract both are non-access modifier so static method can't be abstract 
	//public static abstract void two();

}


public class IciciBank extends RBI {

	public static void main(String[] args) {
		IciciBank test=new IciciBank();
		test.PinVerification();
		test.CashWithdraw();

	}

//Implemented the abstract method of RBI	
	public void CashWithdraw() {
		System.out.println("Lock the card and don't allow user to take the card till all processing completed");
		
	}

}

class HDFC extends RBI {

	//Implemented the abstract method of RBI	
	public void CashWithdraw() {
		System.out.println("First withdraw the card and then process remaining part ");
		
	}
	
	public static void main (String[] args) {
		
		HDFC noobj=new HDFC();
		noobj.PinVerification();
		noobj.CashWithdraw();
	}

}

