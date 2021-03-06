package others;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/home/redbytes/Desktop/selenium/chromedriver");
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://demoqa.com/droppable");
		Actions action=new Actions(driver1);
		WebElement source=driver1.findElement(By.id("draggable"));
		WebElement target=driver1.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		
		//Step1 --Webdriver wait class object --> driver wait conditon
		//Step 2 -until 
		//Step 3 --ExpectedCondition -->
		
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		 * wait.until(ExpectedConditions.elementToBeClickable(element))
		 * ExceptionConditions.urlContains("dashboard");
		 */
	}

}