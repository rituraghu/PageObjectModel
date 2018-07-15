package com.Vtiger.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.Vtiger.base.Base;
import com.google.common.base.Function;
import com.google.common.base.Functions;

public class CommonUtility extends Base {

	
	
	public void takeScreenshot(String testname) throws IOException{

	    DateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");
		Date date=new Date();
		String datestr=format.format(date);
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("user.dir")+"\\src\\com\\Vtiger\\Reports\\ScreenShots"+testname+datestr+".png");
		FileUtils.copyFile(src, destFile);
		
		
	}
	
	public void scrollIntoView(WebElement e){
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].ScrollIntoview(true);",e);
		js.executeScript("argument[0].click();",e);
		
	}
	
	public void fluentWait(){
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(30,TimeUnit.SECONDS)
		.pollingEvery(5,TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		WebElement foo=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				return driver.findElement(By.xpath(""));
			}
		});
		
		
	}
}
