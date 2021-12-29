package com.tcs.com;

import org.openqa.selenium.remote.BrowserType;

 

public class Adactin extends Base  {
 
		
		browserlaunch("chrome");
		implicit(30);
		pom p = new pom();
		urllaunch("http://adactinhotelapp.com/");
		inputvalues(p.getUsername(), "MANI1998");
		inputvalues(p.getPassword(), "76C4Q1");
		clickOnElement(p.getLogin());
		dropdown(p.getLocation(), "text", "New York");
		dropdown(p.getHotels(), "text", "Hotel Sunshine");
		dropdown(p.getRoom_type(), "text", "Super Deluxe");
		dropdown(p.getNo_of_rooms(), "index", "9");
		erase(p.getCheck_in_date());
		inputvalues(p.getCheck_in_date(), "01/01/2022");
		erase(p.getCheck_out_date());
		inputvalues(p.getCheck_out_date(), "02/01/2022");
		dropdown(p.getAdults_per_room(), "index", "2");
		dropdown(p.getChild_per_room(), "index", "2");
		clickOnElement(p.getSearch());
		clickOnElement(p.getRadio_button());
		clickOnElement(p.getCont());
		inputvalues(p.getFirstname(), "MANI");
		inputvalues(p.getLastname(), "KANDAN");
		inputvalues(p.getAddress(), "1/50,west car street");
		inputvalues(p.getCredit_card_no(), "1234567890123456");
		dropdown(p.getCredit_card_type(), "index", "1");
		dropdown(p.getExpiry_month(), "index", "12");
		dropdown(p.getExpiry_year(), "index", "12");
		inputvalues(p.getCvv_no(), "123");
		clickOnElement(p.getBook_now());
		scrollinto(p.getMy_bookings());
		clickOnElement(p.getMy_bookings());
		clickOnElement(p.getLogout());
		quitthebrowser();
		
	}

 

}
