package com.tcs.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tagit\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		WebElement user = driver.findElement(By.name("user"));
		// sending
		inputvalues(user, "Abc12345678");
		
		WebElement password = driver.findElement(By.name("pass"));
		inputvalues(password, "123456789");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='login']"));
		clickOnElement(login);

	}

	private static void clickOnElement(WebElement login) {
		// TODO Auto-generated method stub
		
	}

	private static void inputvalues(WebElement email, String string) {
		// TODO Auto-generated method stub
		
	}
 

}
