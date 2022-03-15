package com.Abc.Commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

//we are developing framework ----Skeleton 
public class BrowserLaunch {
	
	
	public static WebDriver driver;
	public static Properties property;
		
		public void Browser_Initilisation() {
		Readproperty();	
		String Browsername=property.getProperty("Browsername");
		if(Browsername.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ROHDAS PATIL\\WorkSpace\\TestMaven\\src\\test\\java");
		driver=new ChromeDriver();
		
		}else if(Browsername.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "path");
		driver=new FirefoxDriver();
		}else {
		System.setProperty("webdriver.edge.driver", "path");
		driver=new EdgeDriver();
		
	}
		driver.get(property.getProperty("url"));
		}
		
		public static void Readproperty() {
			try {
			    property=new Properties();
				property.load(new FileInputStream("E:\\ROHDAS PATIL\\WorkSpace\\TestMaven\\src\\test\\java"));
				property.getProperty("Browsername");
			}catch(FileNotFoundException e) {
				
			}catch(IOException t) {
				
			}
		}
		
	}



