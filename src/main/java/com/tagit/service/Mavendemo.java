package com.tagit.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavendemo {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tagit\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// TODO Auto-generated method stub

	}

}