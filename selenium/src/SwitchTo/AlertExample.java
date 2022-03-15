package SwitchTo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("http://demoqa.com/alerts");
		 WebElement clickbutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
         clickbutton.click();
         //We have to click on OK button of pop up window
         //step 1--- we have to move to alert 
         Alert obj=driver.switchTo().alert();
         Thread.sleep(5000); //thread inbuilt class of java which help to wait
         //step 2--- call accept method if you want to click on OK 
        // call dismiss method if you want to click on cancel
         System.out.println(obj.getText());
         obj.dismiss();
         
         
		 
	}

}
