package com.test.com;

import com.tcs.com.Base;
import com.tcs.com.ReturnAdactin;

public class Adactin extends Base {
	
public static void main(String[] args) {
		
		browserlaunch("chrome");
		maxwindow();
		implicit(30);
		urllaunch("http://adactinhotelapp.com/");
		ReturnAdactin p = new ReturnAdactin ();
		inputvalues(p.getUsername(), "Abc12345678");
		inputvalues(p.getPassword(), "123456789");
		clickOnElement(p.getLogin());
		dropdown(p.getLocation(), "text", "America");
		dropdown(p.getHotels(), "text", "Hotel Sunshine");
		dropdown(p.getRoom_type(), "text", "Super Deluxe");
		dropdown(p.getNo_of_rooms(), "index", "2");
		erase(p.getCheck_in_date());
		inputvalues(p.getCheck_in_date(), "14/01/2022");
		erase(p.getCheck_out_date());
		inputvalues(p.getCheck_out_date(), "18/01/2022");
		dropdown(p.getAdults_per_room(), "index", "1");
		dropdown(p.getChild_per_room(), "index", "1");
		clickOnElement(p.getSearch());
		clickOnElement(p.getRadio_button());
		clickOnElement(p.getCont());
		inputvalues(p.getFirstname(), "shini");
		inputvalues(p.getLastname(), "riys");
		inputvalues(p.getAddress(), "1/50,pu street");
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


