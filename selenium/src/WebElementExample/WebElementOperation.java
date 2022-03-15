package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementOperation {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://demoqa.com/text-box");
		 System.out.println(driver.getTitle());
         driver.manage().window().maximize();
         //Find the address and perform the operation
         //Enter the value in full name field
         //Address of element is called as locator
         //different way of finding the locator.....8
         WebElement FullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		//to enter the value in element we use sendkeys method from web element
         FullName.sendKeys("Rohidas Patil");
         //To Enter the value in email
         //Find the element ----FindElement
         WebElement Email=driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
         Email.sendKeys("Rohidas@122.com");
         FullName.clear();
         FullName.sendKeys("Rohidas Patil");
         System.out.println(FullName.getTagName());
         WebElement Submit=driver.findElement(By.id("submit"));
         System.out.println(Submit.getText());
			
	     System.out.println("Height " + Submit.getSize().getHeight());
	     System.out.println("Width " + Submit.getSize().getWidth());
			 
         System.out.println(FullName.getAttribute("id"));
	}

}
