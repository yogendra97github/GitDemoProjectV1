package com.amazone.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	/*
	 * 1- TestNG : used in paralled execution of TCs
	 * 2- TestNG : Provides simple annotation for complex use
	 * 3- TestNG :
	 */
	@BeforeTest
	public void start() {
		System.out.println("This start before execution");
	}
	@BeforeMethod
	public void end() {
		System.out.println("This end after execution");
	}
	@Test(description="This is Signup page")
	public void signup() {
		System.out.println("Test3 : Signing up...");
	}
	@Test(description="This is login page")
	public void login() {
		System.out.println("Test3 : Login...");
	}
	@Test(description="This is home page")
	public void homepage() {
		System.out.println("Test3 : Homepage...");
	}
	@Test(priority=4)
	public void bookCategory() {
		System.out.println("Test3 : BookCategory...");
	}
	@Test(priority=5)
	public void productDP() {
		System.out.println("Test3 : ProductDP...");
	}
	@Test(priority=6, enabled=false)
	public void shippingDetails() {
		System.out.println("Test3 : ShippingDetails...");
	}
}
