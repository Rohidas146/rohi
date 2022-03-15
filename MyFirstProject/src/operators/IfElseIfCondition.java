package operators;

public class IfElseIfCondition {

	public static void main(String[] args) {
		int abc=10;
		// Print the message as I am less than 10
		// Print the message as I am greater than 10 but less than 20
		// Print the message as I am greater than 20
		// syntax error //logical error....defect
		
		IfElseIfCondition obj=new IfElseIfCondition();
		obj.Shree(10);
		}
	public void Shree(int abc) {
		if(abc<=10) {  //10<=10
			System.out.println("I am less than or eqaul to 10 ");
		}
		else if (abc>10 && abc<20) { //10>10 && 10<20
			System.out.println("I am greater than 10 but less than 20");
		}
		else {
			System.out.println("I am greater than 20");
		}
		
	}
	

}
