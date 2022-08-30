package com.amazone.testing;

import org.testng.annotations.Test;
@Test(groups="userreg")
public class GroupsDemoTest {
	@Test(priority=1,groups="regression")
	public void signup() {
		System.out.println("Test1");
	}
	@Test(priority=2,groups="regression")
	public void login() {
		System.out.println("Tes2");
	}
	@Test(groups= {"regression","bvt"})
	public void homepage() {
		System.out.println("Test3");
	}
	@Test(groups= "bvt")
	public void mobileCategory() {
		System.out.println("Test4");
	}
	

}
