package com.ShoppingApplication.pomrepository.pages;
/**
 * @author sapna
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	/**
	 * Elements of login Page
	 */
	public WebDriver driver;
	@FindBy(xpath="//a[@class=\"login\"]")
	private WebElement signinBtn;
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitBtn;
	
 public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public Login(WebDriver driver){
		this.driver= driver;
		 PageFactory.initElements(driver, this);
	}


   public Home loginCredtails(String us,String pass) {
	   signinBtn.click();
	   emailAddress.sendKeys(us);
	   password.sendKeys(pass);
	   submitBtn.click();
	return new Home(driver);
	
	   
   }
}
