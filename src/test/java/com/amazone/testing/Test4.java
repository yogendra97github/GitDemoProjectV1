package com.amazone.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	@Test(dataProvider="usercred")
	public void login(String username, String password) {
		System.out.println("username: "+username+" password " +password);
	}
	@DataProvider(name="usercred")
	public Object[][] dataprovider(){
		Object[][] credentials = {{"rohit","rohit@123"},
									{"pooja123", "pooja@#123"},
										{"Sachin@*2645454","$#&@asjdfhads44665464"}};
		return credentials;
		
		
	}

}
