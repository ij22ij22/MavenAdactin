package com.test.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test (dataProvider ="data")

public class DataproviderTest {
	
	 
	private void login(String name) {
		// TODO Auto-generated method stub
		System.out.println("user name : " + name);

	}
@DataProvider (name = "data")
private Object[][] inputdata() {
	return new Object [][] {
		{"tamil" , 123 } ,{"english" , 234}};
		
	

}


}

