package com.ShoppingApplication.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertilib;
import com.ShoppingApplication.genericlib.Utilities;
import com.ShoppingApplication.pomrepository.pages.AddtoCart;
import com.ShoppingApplication.pomrepository.pages.Home;
import com.ShoppingApplication.pomrepository.pages.Login;
import com.ShoppingApplication.pomrepository.pages.Product;

public class AddToCart1 extends BaseClass {
	@Test
	
	public void cart() throws FileNotFoundException, IOException {
		Login l = new Login(driver);
		Home h = l.loginCredtails(Propertilib.getpropertydata("username"), Propertilib.getpropertydata("password"));
		Assert.assertEquals(Propertilib.getpropertydata("Homepagetitle"),"Search - My Store");
		Product p = h.searching(Propertilib.getpropertydata("Productname"));
		Utilities.dropdown(p.getSortByDd(),Propertilib.getpropertydata("sortBy"));
		  AddtoCart c = p.selecteddress();
		  c.plusBtn();
		  Utilities.dropdown(c.getSizeDd(),Propertilib.getpropertydata("size"));
		  c.addToCartBtn();
		  Assert.assertEquals(Propertilib.getpropertydata("Proceedtitle"),"Order - My Store");
		  
		
	}

}
