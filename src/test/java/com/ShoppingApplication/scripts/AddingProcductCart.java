package com.ShoppingApplication.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertilib;
import com.ShoppingApplication.genericlib.Utilities;
import com.ShoppingApplication.pomrepository.pages.AddtoCart;
import com.ShoppingApplication.pomrepository.pages.Home;
import com.ShoppingApplication.pomrepository.pages.Login;
import com.ShoppingApplication.pomrepository.pages.Product;

public class AddingProcductCart extends BaseClass{

	@Test
	public void addindProductoCart() throws FileNotFoundException, IOException {
		Login l = new Login(driver);
		l.loginCredtails(Propertilib.getpropertydata("username"),Propertilib.getpropertydata("password"));
		Home h= new Home(driver);
		h.searching(Propertilib.getpropertydata("Productname"));
		Product p =new Product(driver);
		Utilities.dropdown(p.getSortByDd(), Propertilib.getpropertydata("sortBy"));
		p.selecteddress();
		AddtoCart a = new AddtoCart(driver);
		a.plusBtn();
		Utilities.dropdown(a.getSizeDd(), Propertilib.getpropertydata("size"));
		a.addToCartBtn();
		
				
		
	}
}
