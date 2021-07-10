package com.uiPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlightPage {
	WebDriver driver;

	public BookFlightPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	WebElement firstName=driver.findElement(By.name("passFirst0"));
	WebElement lastName=driver.findElement(By.name("passLast0"));
	WebElement meal=driver.findElement(By.name("pass.0.meal"));
	WebElement cardType=driver.findElement(By.name("creditCard"));
	WebElement cardNumber=driver.findElement(By.name("creditnumber"));
	WebElement expMonth=driver.findElement(By.name("cc_exp_dt_mn"));
	WebElement expYears=driver.findElement(By.name("cc_exp_dt_yr"));
	WebElement cardFirstName=driver.findElement(By.name("cc_first_name"));
	WebElement cardMidName=driver.findElement(By.name("cc_mid_name"));
	WebElement cardLastName=driver.findElement(By.name("cc_last_name"));
	WebElement purchase=driver.findElement(By.xpath(""));
	
	public void purchasePress(String fname,String lName,String meal2,String cType,String cNumber,String eMonth,String eYear,String cFirstname,String cMiddleName,String cLastName)
	{
		try {
			Thread.sleep(2000);
			firstName.sendKeys(fname);
			Thread.sleep(2000);
			lastName.sendKeys(lName);
			Thread.sleep(2000);
			meal.sendKeys(meal2);
			Thread.sleep(2000);
			cardType.sendKeys(cType);
			Thread.sleep(2000);
			cardNumber.sendKeys(cNumber);
			Thread.sleep(2000);
			expMonth.sendKeys(eMonth);
			Thread.sleep(2000);
			expYears.sendKeys(eYear);
			Thread.sleep(2000);
			cardFirstName.sendKeys(cFirstname);
			Thread.sleep(2000);
			cardMidName.sendKeys(cMiddleName);
			Thread.sleep(2000);
			cardLastName.sendKeys(cLastName);
			Thread.sleep(2000);
			purchase.click();
			Thread.sleep(2000);
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
