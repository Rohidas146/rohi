package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TabSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("https://demoqa.com/tabs");
		 driver.findElement(By.id("demo-tab-origin")).click();
		 System.out.println(driver.findElement(By.id("demo-tabpane-origin")).getText());
		 
		 

	}

}
