package com.FrameworkPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver driver;
	
	public BrowserFactory()
	{
		
	}
	public static WebDriver getDriver()
	
	{
		if(driver==null)
		{
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--dasable-notifications");
			option.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver", "h:\\Selenium Class\\selenium jar\\chromedriver.exe");
			driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}
		return driver;
		
	}
	public static WebDriver getDriver(String browserName)
	{
		if(driver==null) {
			if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "h:\\Selenium Class\\selenium jar\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			}
			else if(browserName.equalsIgnoreCase("chrome")) {
				System.out.println("in chrome");
				System.setProperty("webdriver.chrome.driver", "h:\\Selenium Class\\selenium jar\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			}
			else if(browserName.equalsIgnoreCase("IE")) {
				System.out.println("in chrome");
				System.setProperty("webdriver.ie.driver", "h:\\Selenium Class\\selenium jar\\iedriver.exe");
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			}
		}
		return driver;
		
	}

}
