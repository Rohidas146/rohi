package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleDrag {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/home/redbytes/Desktop/selenium/chromedriver");
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will launch
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.id("dragBox"));
		//action.moveToElement(source).perform();
		int x=source.getLocation().getX()+50;
		int Y=source.getLocation().getY();
	   action.dragAndDropBy(source,500,50).perform(); 
		//action.moveToElement(source).dragAndDropBy(source,500,55).build().perform();
		}
}
