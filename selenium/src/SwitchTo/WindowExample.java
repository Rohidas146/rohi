package SwitchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver
		 //enter the URL which want to enter in the browser 
		 driver.get("http://demoqa.com/browser-windows");
		 //Whenever a window opens internally operating system assign key/id to each
		 //to know the unique key of window we have one method called as getwindowHandle
		String parentwindow=driver.getWindowHandle();
        System.out.println("This is my first window id" + parentwindow);
        WebElement tabbutton=driver.findElement(By.id("tabButton"));
        tabbutton.click();
		 Set<String> handles=driver.getWindowHandles();
		 System.out.println(handles.size());
		 Iterator<String> itr=handles.iterator();
		 while(itr.hasNext()) {
			 String str=itr.next().toString();
			 if(str.equalsIgnoreCase(parentwindow)) {
				 System.out.println("we both represent same window");
			 }else {
				 System.out.println("we both represent differnt window");
				 driver.switchTo().window(str);
				 WebElement heading=driver.findElement(By.tagName("h1"));
				 System.out.println(heading.getText());
			 }
		 }
		 
			/*
			 * while(itr.hasNext()) { String child=itr.next().toString();
			 * if(!parentwindow.equalsIgnoreCase(child)) { driver.switchTo().window(child);
			 * 
			 * } } driver.switchTo().window(""); //System.out.println(handles.size());
			 */
	}

}
