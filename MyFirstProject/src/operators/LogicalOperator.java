package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("...........And condition........");
     //true && true....final result will be true
     System.out.println("Both condition is true so final result is " + (5<6 && 6>3));
     //false && true....final result will be false
     System.out.println("First condition is false so final result is " + (7<6 && 6>4));	
     //true && false....final result will be false
     System.out.println("Second condition is false so final result is " + (5<6 && 2>3));
     //false && false....final result will be false
     System.out.println("Both condition is false so final result is " + (7<6 && 6>3));	 
     
	

	System.out.println("...........OR condition........");
	
    //true || true....final result will be true
    System.out.println("Both condition is true so final result is " + (5<6 || 6>3));
    //false || true....final result will be true
    System.out.println("First condition is false so final result is " + (7<6 || 6>4));	
    //true || false....final result will be true
    System.out.println("Second condition is false so final result is " + (5<6 || 2>3));
    //false || false....final result will be false
    System.out.println("Both condition is false so final result is " + (7<6 || 1>3));	 
    
	}

	
	
	
	
}
