package com.TestPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FrameworkPackage.BrowserFactory;
import com.FrameworkPackage.CaptureScreenShot;
import com.uiPackage.BookFlightPage;
import com.uiPackage.FlightConfirmationPage;
import com.uiPackage.FlightFinderPage;
import com.uiPackage.LoginJava;
import com.uiPackage.SelectFlightPage;

public class TestCaseClass extends HelperClass{
	public TestCaseClass()
	{
		
	}
@Test
public void returnTicket()
{
	try {
		System.out.println("in return ticket");
		driver.get("https://newtours.demoaut.com/");
		LoginJava loginPage=PageFactory.initElements(driver, LoginJava.class);
		loginPage.loginWordPress("mercury", "mercury");
		FlightFinderPage flightfinder=PageFactory.initElements(driver, FlightFinderPage.class);
		flightfinder.continueWordPress("1", "Zurich", "July", "12", "Franfurt", "September", "15", "Business Class", "Unified Airways");
		SelectFlightPage selectflight=PageFactory.initElements(driver, SelectFlightPage.class);
		selectflight.departAirlineWordPress("Pangaea Airlines 362");
		selectflight.returnAirlineWordPress("UnifiedAirlines 363");
		selectflight.continu();
		BookFlightPage bookflight=PageFactory.initElements(driver, BookFlightPage.class);
		bookflight.purchasePress("Misbah", "Shaikh", "Non Veg", "MasterCard", "12345678", "12", "2020", "Misbah", "Shaikh", "Haque");
		FlightConfirmationPage flightconfirm=PageFactory.initElements(driver, FlightConfirmationPage.class);
		String bookingDetailsFile = System.getProperty("user.dir")+"\\"+"ScreenShot\\FlightConfirmationDetails - "+CaptureScreenShot.getDateTimeStamp()+".png";
		try
		{
			CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), bookingDetailsFile);
		}catch(Exception e)
		
		{
			e.printStackTrace();
		}
		flightconfirm.logoutPress();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
