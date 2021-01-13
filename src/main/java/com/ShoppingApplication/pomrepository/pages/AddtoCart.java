package com.ShoppingApplication.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author sapna
 * 
 *
 */

public class AddtoCart {
	/**
	 * Element of AddtoCart page
	 */
	@FindBy(xpath="//i[@class=\"icon-plus\"]")
    private WebElement plus;
	
	@FindBy(xpath="//select[@class=\"form-control attribute_select no-print\"]")
	private WebElement sizeDd;
	
	@FindBy(xpath="//a[@title=\"Yellow\"]")
	private WebElement color;
	
	@FindBy(xpath="//span[text()=\"Add to cart\"]")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@title=\"Proceed to checkout\"]")
	private WebElement proceedToCheckout;

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSizeDd() {
		return sizeDd;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	public AddtoCart(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void plusBtn() {
		plus.click();
		
	}
	
	public void addToCartBtn() {
		color.click();
		addToCart.click();
		proceedToCheckout.click();
	
		
	}
	
	
}
