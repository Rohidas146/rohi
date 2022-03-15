package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		 driver.switchTo().frame("content");
		 WebElement header=driver.findElement(By.tagName("h1"));
		 System.out.println(header.getText());
		 WebElement noframe=driver.findElement(By.xpath("//a[text()='no frame']"));
		 System.out.println(noframe.getText());
	}

}
