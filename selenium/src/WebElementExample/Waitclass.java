package WebElementExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Waitclass implements ExpectedCondition<Boolean>{

	@Override
	public Boolean apply(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("")).isDisplayed();
	}

	
}
