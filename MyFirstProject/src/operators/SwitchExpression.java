package operators;

public class SwitchExpression {

	public static void main(String[] args) {
		// to check whether number is odd or even
		
	int xyz=13;
	
	// xyz%2==0  even
	
	switch(xyz%2) { //if (xyz%2==0) boolean
	
	case 0 :
		 System.out.println("This is even number");
	default : 
	    System.out.println("this is odd number");
	}
	}

}
