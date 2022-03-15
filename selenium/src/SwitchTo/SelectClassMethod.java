package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("http://demoqa.com/select-menu");
		 WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
		 Select obj=new Select(dropdown);
		 obj.selectByIndex(4);
		 //obj.deselectByVisibleText(text);
		// obj.selectByValue(value);

	}

}
