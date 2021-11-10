package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncch
{
	public static void main(String[] args)
	{
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssssu\\Desktop\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in");
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ssssu\\Desktop\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\grckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.flipkart.com");
	}

}
