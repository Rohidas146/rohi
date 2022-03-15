package com.abc.OrangeHRM.Test;

import org.openqa.selenium.By;

import com.Abc.Commonfunctionality.BrowserLaunch;

public class LoginPageTest extends BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
    //Login with valid credential
		BrowserLaunch browser=new BrowserLaunch();
		browser.Browser_Initilisation();
		//BrowserLaunch.driver.findElement(by)
		driver.findElement(By.id("textUsername")).sendKeys("Admin");
		driver.findElement(By.id("textPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.tagName("h1")).isDisplayed()) {
			System.out.println("User is able to login successfully");
			
		}else {
			System.out.println("User is not able to login successfully");
			
		}
		  
	}

}














