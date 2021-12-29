package com.tcs.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnAdactin {
	
	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room_type;

	@FindBy(id = "room_nos")
	private WebElement no_of_rooms;

	@FindBy(id = "datepick_in")
	private WebElement check_in_date;

	@FindBy(id = "datepick_out")
	private WebElement check_out_date;

	@FindBy(id = "adult_room")
	private WebElement adults_per_room;

	@FindBy(id = "child_room")
	private WebElement child_per_room;

	@FindBy(id = "Submit")
	private WebElement search;

	@FindBy(id = "radiobutton_0")
	private WebElement radio_button;
	
	@FindBy(id = "continue")
	private WebElement cont;
	
	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement credit_card_no;

	@FindBy(id = "cc_type")
	private WebElement credit_card_type;

	@FindBy(id = "cc_exp_month")
	private WebElement expiry_month;

	@FindBy(id = "cc_exp_year")
	private WebElement expiry_year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv_no;

	@FindBy(id = "book_now")
	private WebElement book_now;

	@FindBy(id = "my_itinerary")
	private WebElement my_bookings;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public void Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}


	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCheck_in_date() {
		return check_in_date;
	}

	public WebElement getCheck_out_date() {
		return check_out_date;
	}

	public WebElement getAdults_per_room() {
		return adults_per_room;
	}

	public WebElement getChild_per_room() {
		return child_per_room;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadio_button() {
		return radio_button;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getMy_bookings() {
		return my_bookings;
	}

	public WebElement getLogout() {
		return logout;
	}

	
}


