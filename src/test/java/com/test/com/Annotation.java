package com.test.com;

import org.testng.annotations.Test;

public class Annotation {
	
	@Test(groups = "blue")
	private void blue() {
		System.out.println("blue");
	}
	@Test (groups = "red")
	private void red() {
		// TODO Auto-generated method stub
System.out.println("red");
	}
	@Test (groups = "green")
	private void green() {
		// TODO Auto-generated method stub
		System.out.println("green");

	}

}
