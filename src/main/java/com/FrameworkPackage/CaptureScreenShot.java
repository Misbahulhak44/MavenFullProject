package com.FrameworkPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CaptureScreenShot {

	public CaptureScreenShot()
	{
		
	}
	public static void getScreenShot(WebDriver driver,String filepath) throws IOException
	{
		try {
			System.out.println("in getScreenShot method");
			TakesScreenshot ts=(TakesScreenshot)driver;
			System.out.println("Before getScreenshotAs");
			File source=ts.getScreenshotAs(OutputType.FILE);
			System.out.println("After getScreenShotAs");
			FileUtils.copyFile(source,new File(filepath));
		}catch(WebDriverException e)
		{
			e.printStackTrace();
		}
	}
	public static String getDateTimeStamp()
	{
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate=new Date();
		System.out.println(oDate.toString());
		sDatePart =oDate.toString().split("");
		sDateStamp =sDatePart[5]+"-"+
		sDatePart[1]+"-"+
				sDatePart[2]+"-"+
		sDatePart[3];
		sDateStamp=sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		return sDateStamp;
		
	}
}
