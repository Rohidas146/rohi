package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://demoqa.com/radio-button");
		 
		 //WHY IT IS NOT CLICKED ------>EXPLAIN ----What to do 
		// WebElement YesRadioButton=driver.findElement (By.xpath("//input[@id='yesRadio']"));
		 WebElement YesRadioButton=driver.findElement (By.xpath("//label[@for='yesRadio']"));

		 YesRadioButton.click();
		 WebElement NORadioButton=driver.findElement (By.xpath("//label[@for='NoRadio']"));
         System.out.println(NORadioButton.isEnabled());
         if(!NORadioButton.isEnabled()) {
        	 System.out.println("Radio button is disable - tast case pass");
        	 
         }else {
        	 System.out.println("Radio button is enable - tast case fail");
         }
         
         //Approach 1. We create seperate locator for each column using text()----//div[@text()='First Name'];
         //Aproach 2. we create common locator for all the column and use iterator 

	}

}
