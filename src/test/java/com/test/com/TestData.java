package com.test.com;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class TestData {
	//@ annotations
	//@TEST
	@Test
	private void system() {
		// TODO Auto-generated method stub
		System.out.println("hello");

	}
	//@ignore the method
	 
	@Test    (enabled = true)
   private void sysdata() {
		System.out.println("data");
}
	//@Dependency depends on method
	
	private void studata() {
		// TODO Auto-generated method stub
		System.out.println("Information");

	}
@BeforeSuite
private void setproperty() {
	// TODO Auto-generated method stub
	System.out.println("setproperty");
	}
@BeforeTest
private void Chrome() {
	// TODO Auto-generated method stub
	System.out.println("chrome");

}
@BeforeClass
private void amazon() {
	// TODO Auto-generated method stub
System.out.println("amazon");
}

@BeforeMethod
private void login() {
	// TODO Auto-generated method stub
	System.out.println("login");

}
@AfterClass
private void logout() {
	// TODO Auto-generated method stub
	System.out.println("login");

}
@AfterMethod
private void close() {
	// TODO Auto-generated method stub
	System.out.println("close");

}
@AfterSuite
private void Verify() {
	// TODO Auto-generated method stub
	System.out.println("start");

}

 
@AfterTest  

private void delete() {
	// TODO Auto-generated method stub
	System.out.println("cookies");

}
//@invocation count= 3


}