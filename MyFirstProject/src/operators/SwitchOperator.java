package operators;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var=1;
		
		if(var==1) {
			System.out.println("jan");
		}else if (var==2) {
			System.out.println("feb");
		}else if (var==3) {
			System.out.println("march");
		} else {
			System.out.println(" please put the value between 1 o 12");
			
			
		}
		
		switch(var) {
		
		case 1:
			System.out.println("january");
		case 2:
			System.out.println("feb");
		case 3:
			System.out.println("march");
		default:
			System.out.println("please put the value between 1 to 12");
			
			
		}
	}

}
