package com.test.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;


public class Parameter {

	@Test
private void empname(@Optional ("raj") String name) {
		System.out.println("name "+name);
	}
	private void empid(@Optional ("1234") String id) {
		// TODO Auto-generated method stub
		System.out.println("id "+id);

	}
}
