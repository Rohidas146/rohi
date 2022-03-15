import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", ".\\Resources\\geckodriver.exe");
		// GeckoDriver driver=new GeckoDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		// driver.get("http://www.google.com");
		 driver1.get("http://www.google.com");
         driver1.navigate();

	}

}
