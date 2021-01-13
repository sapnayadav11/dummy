package com.ShoppingApplication.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePomPage {
	
	public void Login(WebDriver driver){
		 PageFactory.initElements(driver, this);
	 }

}
