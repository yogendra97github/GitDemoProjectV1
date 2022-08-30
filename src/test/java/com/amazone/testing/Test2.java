package com.amazone.testing;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void signup() {
		System.out.println("Test2 : Signing up...");
	}
	@Test(dependsOnMethods="signup")
	public void login() {
		System.out.println("Test2 : Login...");
	}
	@Test(dependsOnMethods="login")
	public void homepage() {
		System.out.println("Test2 : Homepage...");
	}
	@Test(dependsOnMethods="homepage")
	public void shoeCategory() {
		System.out.println("Test2 : ShoeCategory...");
	}
	@Test(dependsOnMethods="shoeCategory")
	public void productDP() {
		System.out.println("Test2 : PDP...");
	}
	@Test(dependsOnMethods="productDP")
	public void shippingDetails() {
		System.out.println("Test2 : Shipping...");
	}

}
