package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver newdriver=new ChromeDriver(); //driver is a reference of chromedriver
		newdriver.navigate().to("https://demoqa.com/nestedframes");
        WebElement nest=newdriver.findElement(By.xpath("//ifram[@id=\"frame1\"]"));
        newdriver.switchTo().frame(nest);
        WebElement frame1=newdriver.findElement(By.xpath("//body[text()=\"parent frame\"]"));
        System.out.println(frame1.getText());
        WebElement frame2=newdriver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
       newdriver.switchTo().frame(frame2);
       WebElement frame3=newdriver.findElement(By.xpath("//p[text()=\"Child Iframe\"]"));
        System.out.println(frame3.getText());
	}

}
