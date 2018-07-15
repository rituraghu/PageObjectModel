package com.Vtiger.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	 public static WebDriver driver;
	 public String url="http://localhost:100";
	 
	 public void launchBrowser() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Jar\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			Thread.sleep(6000);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
	 }
}
