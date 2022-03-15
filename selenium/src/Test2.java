import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", ".\\Resources\\IEDriverServer.exe");
		InternetExplorerDriver driver2=new InternetExplorerDriver();
		driver2.get("http://www.google.com");
		//driver2.get("//www.facebook.com");

	}

}
