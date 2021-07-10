package com.uiPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightConfirmationPage {
	WebDriver driver;

	public FlightConfirmationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	WebElement logout=driver.findElement(By.xpath(""));
	
	public void logoutPress()
	{
		logout.click();
	}

}
