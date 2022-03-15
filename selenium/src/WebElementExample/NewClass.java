package WebElementExample;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class NewClass implements ExpectedCondition<Boolean> {

	@Override
	public Boolean apply(WebDriver driver) {
		
		return driver.findElement(By.id("")).isSelected();
	}

}
