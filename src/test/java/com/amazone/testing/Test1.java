package com.amazone.testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	public void signup() {
		System.out.println("Test1 : Signing up...");
		Reporter.log("TEst: sign click on button");
	}

	public void login() {
		System.out.println("Test1 : Signing up...");
	}

	public void homepage() {
		System.out.println("Test1 : Signing up...");
	}

	@Test(invocationCount = 10)
	public void mobileCategory() {
		System.out.println("Test1 : Signing up...");
	}

	public void productDP() {
		System.out.println("Test1 : Signing up...");
	}

	public void shippingDetails() {
		System.out.println("Test1 : Signing up...");
	}
}
