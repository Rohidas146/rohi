package WebElementExample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("http://demoqa.com/webtable");
		 List<WebElement>columnnname=(List<WebElement>) driver.findElement(By.xpath("//div[@role='columnheader']"));
		 System.out.println(columnnname.size());
		 Iterator itr=columnnname.iterator();
		 
	}

}
