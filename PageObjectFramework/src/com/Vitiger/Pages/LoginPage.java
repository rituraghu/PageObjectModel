package com.Vitiger.Pages;

import org.openqa.selenium.WebDriver;

import com.Vtiger.base.Base;

public class LoginPage extends Base{
	
	WebDriver driver;
	public LoginPage(){
		this.driver=Base.driver;
	}
	public boolean verifyAppURL() throws InterruptedException{
		  //launchBrowser();
		if(driver.getTitle().startsWith("vtiger")){
			return true;
		}
		else
		{
			return false;
					}
		
	}
}
