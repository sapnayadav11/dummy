package com.ShoppingApplication.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertilib;
import com.ShoppingApplication.genericlib.Utilities;
import com.ShoppingApplication.pomrepository.pages.EveningDress;
import com.ShoppingApplication.pomrepository.pages.Home;
import com.ShoppingApplication.pomrepository.pages.Login;

public class ProductDelivery extends BaseClass {
	
	@Test
	public void Delivery() throws FileNotFoundException, IOException {
		Login l = new Login(driver);
		l.loginCredtails(Propertilib.getpropertydata("username"),Propertilib.getpropertydata("password"));
		Home h= new Home(driver);
		Utilities.mouseHover(driver,h.getDressBtn());
		h.eveningdress();
		EveningDress e= new EveningDress(driver);
		e.deliverBtn();
		
		
	}
	

}
