package com.ShoppingApplication.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	/**
	 * To handel the dropdown
	 * @param element
	 * @param text
	 */
	public static void dropdown(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);;
		
	}
	/**
	 * to handel the mouseHover
	 * @param driver
	 * @param element
	 */
	public static void mouseHover(WebDriver driver,WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
			
	}
	/**
	 * to handel the rigtClick
	 * @param driver
	 * @param element
	 */
	public static void rightClick(WebDriver driver,WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
		
	}
	/**
	 * to handel the alertpopup
	 * @param driver
	 */
	public static void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
		
		
	}
	/**
	 * TO handel the scrollbar
	 * @param driver
	 */
	public static void scrollbar(WebDriver driver) {
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("windows.scollBy(0,5000)");
		
	}
	
	

}



