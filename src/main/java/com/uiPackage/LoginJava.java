package com.uiPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginJava {
	WebDriver driver;

	public LoginJava(WebDriver driver) {
		
		this.driver = driver;
	}
	WebElement username=driver.findElement(By.name("username"));
	WebElement password=driver.findElement(By.name("password"));
	WebElement login=driver.findElement(By.name("login"));
	
	public void loginWordPress(String use,String pass)
	{
		try {
			username.sendKeys(use);
			Thread.sleep(3000);
			password.sendKeys(pass);
			Thread.sleep(3000);
			login.click();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	

}
