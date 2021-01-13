package com.ShoppingApplication.pomrepository.pages;
/**
 * @author sapna
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	/**
	 * Elements of the product page
	 */
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sortByDd;
	
	@FindBy(xpath="(//a[@title=\"Printed Summer Dress\"])[3]")
	private WebElement dress;

	public WebElement getSortByDd() {
		return sortByDd;
	}

	public WebElement getDress() {
		return dress;
	}
	public Product(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public AddtoCart selecteddress() {
		dress.click();
		return new AddtoCart(driver);
	}

}
