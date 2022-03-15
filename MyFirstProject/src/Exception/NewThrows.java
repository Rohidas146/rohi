package Exception;


import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class NewThrows {

	// we can throw more than exception in one line like below 
	public static void main(String[] args) throws FileNotFoundException, EOFException {
		// TODO Auto-generated method stub
		NewThrows obj=new NewThrows();
		obj.M1();
	}
	
	public void M1() throws FileNotFoundException ,EOFException
	{
		M2();
		
	}
	
	public void M2() throws FileNotFoundException {
		M3();
		M4();
	}

	public void M3() {
		try {
			M4();
		}
		catch(FileNotFoundException p) {
			
		}
	}

	public void M4() throws FileNotFoundException {
		
		FileReader test=new FileReader(new File(""));

	}

}