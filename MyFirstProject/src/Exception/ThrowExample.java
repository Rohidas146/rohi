package Exception;

public class ThrowExample {

	String t="";
	public static void main(String[] args) {
		
		ThrowExample obj=new ThrowExample();
		obj.Auth("pdbarlota", "");

	}
	//String can empty so logically there should be any issue
	//Functionality wise we don't allow Password as empty
	public void Auth(String username,String Password) {
		try {
			if(Password.isEmpty()) {  
				//As String can be empty so method will not throw exception
				// As functionality don't allow password as empty now it's program
				//responsibility to create exception object within method
				throw new NullPointerException();
			} else {
				System.out.println("Password is not empty so there is no exception by program");
			}
		}
		catch (NullPointerException p) {
			System.out.println("Please enter valid  credential");
		}
	}

}