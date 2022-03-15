package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		
		//APPROACH 1. SELECTING HOME PAGE CHECKBOX AND JUST READ THE RESULT
		
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		//When you Create object then automatically browser will launch  
		 ChromeDriver driver=new ChromeDriver();// driver is a reference of chromedriver
		 //Enter the URL which you want to enter in the browser
		 driver.get("http://demoqa.com/checkbox");
		 WebElement HomeCheckBox=driver.findElement(By.xpath("//label[@for='tree-node-home']"));
	}

}
