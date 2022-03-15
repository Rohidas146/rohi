package WebElementExample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\selenium\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/select-menu");
		WebElement selectelement=driver.findElement(By.id("oldSelectMenu"));
		//TO select the drop down and tag is select for it
		//Which class we have to use --SELECT
		
		Select obj=new Select(selectelement);
		
		if(obj.getFirstSelectedOption().getText().equalsIgnoreCase("red"))
		System.out.println("Pass");
		else
			System.out.println("fail");
		
		
		// Operation 1-->Select the value from drop down
		//Select by index ---Index will start from zero 
		obj.selectByIndex(2);
		//select by visible Text ---> Visible text which is display in drop down
		obj.selectByVisibleText("Purple");
		//select by value
		obj.selectByValue("7");
		
		// Get All Options 
		List<WebElement> options=obj.getOptions();
		
		Iterator<WebElement> test=options.iterator();
		while(test.hasNext()) {
			System.out.println(test.next().getText());
		}
		
		System.out.println(obj.getFirstSelectedOption().getText());
		
	}

}
