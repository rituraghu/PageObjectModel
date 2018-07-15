package com.Vtiger.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Vitiger.Pages.LoginPage;
import com.Vtiger.base.Base;

//import com.Vtiger.base.Base;

public class NewTest extends Base  {
	//WebDriver driver;
	

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  launchBrowser();
  }

  @AfterClass
  public void afterClass() {
      //driver.quit();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void verifyPageURL() throws InterruptedException {
	//  launchBrowser();
	  LoginPage lp=new LoginPage();
	  boolean c=lp.verifyAppURL();
      Assert.assertTrue(c);;
  }
}
