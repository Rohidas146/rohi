package Exception;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Encapsulation.DataHiding;

public class Java7Exception {

	public static void main(String[] args) {
		Encapsulation.DataHiding test=new DataHiding();
		FileReader objFileReader;
		//Before Java 7 we need to write separate catch block for each exception
		try {
			objFileReader=new FileReader("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException p) {
			p.printStackTrace();
		}finally {
			//Before java 7 to release the resource we are using finally block
			objFileReader=null;
		}
		
		//After java7 we have resource management concept in which we can write those 
		//statement try() which we need to release 
		try (FileReader objFileReader4=new FileReader("");
			FileReader objFileReader2=new FileReader("");
			FileReader objFileReader3=new FileReader("");
			FileReader objFileReader1=new FileReader("");)
		{
			System.out.println("This is inside try");
			//After java 7 you can write all the exception in one catch block
		} catch (IOException | ArithmeticException | NullPointerException  e ) {
			e.printStackTrace();
		} finally {
			
		}
		

	}

}