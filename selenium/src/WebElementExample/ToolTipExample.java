package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("https://demoqa.com/tool-tips");
         Actions action=new Actions(driver);
         action.clickAndHold(driver.findElement(By.id("toolTipButton"))).perform();
         Thread.sleep(1000);
         System.out.println(driver.findElement(By.className("tooltip-inner")).getText());
	}

}
