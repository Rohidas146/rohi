package Encapsulation;

public class AnotherClassForDataHiding {

	public static void main(String[] args) {
		DataHiding obj=new DataHiding();
		int a=obj.getbalance(123);
		System.out.println("Balance is " + a);
		obj.setBalance(1000);
		a=obj.getbalance(123);
		System.out.println("Balance is " + a);
		
	}

}
