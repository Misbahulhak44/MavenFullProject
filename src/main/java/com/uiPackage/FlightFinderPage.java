package com.uiPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightFinderPage {
	WebDriver driver;

	public FlightFinderPage(WebDriver driver) {
		
		this.driver = driver;
	}
	WebElement roundTrip=driver.findElement(By.xpath(""));
	WebElement onewayTrip=driver.findElement(By.xpath(""));
	WebElement passCount=driver.findElement(By.name("passCount"));
	WebElement fromPort=driver.findElement(By.name("fromPort"));
	WebElement fromMonth=driver.findElement(By.name("fromMonth"));
	WebElement fromDay=driver.findElement(By.name("fromDay"));
	WebElement toPort=driver.findElement(By.name("toPort"));
	WebElement toMonth=driver.findElement(By.name("toMonth"));
	WebElement toDay=driver.findElement(By.xpath("toDay"));
	WebElement airline=driver.findElement(By.name("airline"));
	WebElement findFlight=driver.findElement(By.name("findFlight"));
	WebElement serviceClass=driver.findElement(By.xpath("//*[@value='Business']"));
	
	public void continueWordPress(String pCount,String fPort,String fMonth,String  fDay,String tPort,String tMonth,String tDate,String serClass,String aLine)
	{
		try {
			Thread.sleep(2000);
			roundTrip.click();
			Thread.sleep(2000);
			passCount.sendKeys(pCount);
			Thread.sleep(2000);
			fromPort.sendKeys(fPort);
			Thread.sleep(2000);
			fromMonth.sendKeys(fMonth);
			Thread.sleep(2000);
			fromDay.sendKeys(fDay);
			Thread.sleep(2000);
			toPort.sendKeys(tPort);
			Thread.sleep(2000);
			toMonth.sendKeys(tMonth);
			Thread.sleep(2000);
			toDay.sendKeys(tDate);
			Thread.sleep(2000);
			serviceClass.sendKeys(serClass);
			Thread.sleep(2000);
			airline.sendKeys(aLine);
			Thread.sleep(2000);
			findFlight.click();
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
