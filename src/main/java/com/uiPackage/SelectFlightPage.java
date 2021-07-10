package com.uiPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlightPage {
WebDriver driver;

public SelectFlightPage(WebDriver driver) {
	super();
	this.driver = driver;
}
WebElement BlueSkiesAirlines360_D=driver.findElement(By.xpath(""));
WebElement BlueSkiesAirlines361_D=driver.findElement(By.xpath(""));
WebElement PangeaAirlines362_D=driver.findElement(By.xpath(""));
WebElement UnifiedAirlines363_D=driver.findElement(By.xpath(""));
WebElement BlueSkiesAirlines360_T=driver.findElement(By.xpath(""));
WebElement BlueSkiesAirlines361_T=driver.findElement(By.xpath(""));
WebElement PangeaAirlines362_T=driver.findElement(By.xpath(""));
WebElement UnifiedAirlines363_T=driver.findElement(By.xpath(""));
WebElement con=driver.findElement(By.xpath(""));

public void departAirlineWordPress(String departAirline)
{
	try {
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines360")) {
			BlueSkiesAirlines360_D.click();
			Thread.sleep(2000);
			
		}
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines361")) {
			BlueSkiesAirlines361_D.click();
			Thread.sleep(2000);	
		}
		if(departAirline.equalsIgnoreCase("Pangea Airlines 362")) {
			PangeaAirlines362_D.click();
			Thread.sleep(2000);
			
		}
		if(departAirline.equalsIgnoreCase("Unified Airlines 363")) {
			UnifiedAirlines363_D.click();
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}

public void returnAirlineWordPress(String returntAirline)
{
	try {
		if(returntAirline.equalsIgnoreCase("Blue Skies Airlines360")) {
			BlueSkiesAirlines360_T.click();
			Thread.sleep(2000);
			
		}
		if(returntAirline.equalsIgnoreCase("Blue Skies Airlines361")) {
			BlueSkiesAirlines361_T.click();
			Thread.sleep(2000);	
		}
		if(returntAirline.equalsIgnoreCase("Pangea Airlines 362")) {
			PangeaAirlines362_T.click();
			Thread.sleep(2000);
			
		}
		if(returntAirline.equalsIgnoreCase("Unified Airlines 363")) {
			UnifiedAirlines363_T.click();
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
public void continu() {
	con.click();
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
}

