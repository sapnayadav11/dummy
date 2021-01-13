package com.ShoppingApplication.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements AutoConstant {
	/**
	 * launch the application and enter the ulr and close the application
	 */
	
	public WebDriver driver;

		@BeforeMethod
		public void openapp() throws FileNotFoundException, IOException {
			System.setProperty(key, value);
			driver = new ChromeDriver();
			driver.get(Propertilib.getpropertydata("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
	}
		@AfterMethod
		public void closeapp(ITestResult r) throws IOException {
			int status = r.getStatus();
			String name = r.getName();
			if (status==2) {
				Photo.getphoto(driver, name);
				
			}
			driver.close();
		}
	}


