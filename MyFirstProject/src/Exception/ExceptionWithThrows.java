package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionWithThrows {

	//Main is throwing the filenotfoundexception and requesting JVM to handle it
	public static void main(String[] args) throws FileNotFoundException  {
	
		ExceptionWithThrows obj=new ExceptionWithThrows();
		obj.M1(); 
		

	}
	
	public void M1() throws FileNotFoundException { //Caller method 
		// We are reading the file and it may throw filenotfoundexception
		//filenotfoundexception comes under checked exception so compiler will force you to handle it
		M2(); //M2 is throwing filenotfound but not handling so M1 need to handle it
		//M1 also decided not to handle it so it also throws the exception 
		
		
		/*
		 * FileNotFoundException is one of the type checked exception If you try to read
		 * a file then there is possibility that file is not found Compiler force you to
		 * handle it through try catch or request to apply throws
		 * in below we are using try catch to handle it 
		 */
		try {
			FileReader test=new FileReader(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Checked Exception - Which compiler force you to handle the exception
	 * FileNotFoundException is one of the type checked exception If you try to read
	 * a file then there is possibility that file is not found Compiler force you to
	 * handle it through try catch or request to apply throws
	 * if below example we are not using try -catch but telling JVM that it has to be handle by caller method
	 * to tell that exception need to handle by caller method we used throws keyword
	 */
	public void M2() throws FileNotFoundException {
		FileReader test=new FileReader(new File(""));
	}

}