package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/select-menu");
		Select obj=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		obj.selectByIndex(0);
		obj.selectByIndex(1);
		System.out.println(obj.isMultiple());
		obj.deselectByIndex(1);
		obj.deselectAll();

	}

}
