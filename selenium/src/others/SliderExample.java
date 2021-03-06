package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/home/redbytes/Desktop/selenium/chromedriver");
				System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
				//When you create object then automatically browser will lauch
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/slider");
				driver.manage().window().maximize();
				Actions action=new Actions(driver);
				WebElement source=driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
				int x=source.getLocation().getX();
				int Y=source.getLocation().getY()+10;
				action.clickAndHold(source).moveByOffset(x, Y).release().build().perform();
	}

}
