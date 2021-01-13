package com.ShoppingApplication.pomrepository.pages;
/**
 * @author sapna
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	/**
	 *  Elements of Home Page
	 */
	public WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement searchTb;
	
	@FindBy(name="submit_search")
	private WebElement searchBtn;
	
	@FindBy(xpath="(//a[@title=\"Dresses\"])[2]")
	private WebElement dressBtn;
	@FindBy(xpath="(//a[@title=\"Evening Dresses\"])[2]")
	private WebElement eveningdress;
	
	public WebElement getDressBtn() {
		return dressBtn;
	}

	public WebElement getEveningdress() {
		return eveningdress;
	}

	public WebElement getSearchTb() {
		return searchTb;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	 public Home(WebDriver driver){
		 this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public Product searching(String Product) {
		searchTb.sendKeys(Product);
		searchBtn.click();
		return new Product(driver);
	}
	public void eveningdress() {
		eveningdress.click();
	}
	

}
