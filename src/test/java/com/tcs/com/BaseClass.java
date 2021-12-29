package com.tcs.com;

import org.openqa.selenium.WebElement;


public class BaseClass {
	public static void clickOnElement(WebElement element) {
		element.click();
	}
public static void inputvalues(WebElement element, String s) {
	element.sendKeys(s);
}
public static void  getThetext(WebElement ele) {
	String text = ele.getText();
	System.out.println(text);
}
public static void gettheAttribute(WebElement ele) {
	String attribute= ele.getAttribute("value");
	System.out.println(attribute);
}
 

}
