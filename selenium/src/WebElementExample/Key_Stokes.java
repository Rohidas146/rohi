package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Stokes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		//password.sendKeys("admin123");
		//Whenever you want to press keys which don't have text use Keys Enum 
		//Approach 1--->
		
		//loginbtn.sendKeys(Keys.ENTER);
		//Action class has a two method keydown and keyup
		Actions action=new Actions(driver);
		//User name --Admin
		//Select the Admin--CTRL+A
		//Action class has a two method keydown and keyup
		//Both method are only applicable for CONTROL,SHIFT AND ALTR
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		password.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		//Approach 3---> We will use Sendkeys to do control +A,CTRL+C and CTRL+V
		String select=Keys.chord(Keys.CONTROL,"a");
		String copy=Keys.chord(Keys.CONTROL,"c");
		String paste=Keys.chord(Keys.CONTROL,"v");
		username.sendKeys(select);
		username.sendKeys(copy);
		password.click();
		password.sendKeys(paste);
		
		
	}

}
