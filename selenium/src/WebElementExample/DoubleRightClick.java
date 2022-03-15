package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DoubleRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver newdriver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 newdriver.get("https://demoqa.com/button");
		 //To do double click
		 Actions obj=new Actions(newdriver);
		 obj.doubleClick(newdriver.findElement(By.xpath("//button[@id='doubleClickBtn']")));
		

	}

}
