package com.amazone.testing;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class groupTest1 extends CommonDataSetup {
	@Test(groups="login")
	public void A() {
		System.out.println("This is groupTest1 A method");
	}
	@Test(groups="login")
	public void B() {
		System.out.println("This is groupTest1 B method");
	}
	@Test(enabled=false, groups={"logout","login"}) 
	public void C() {
		System.out.println("This is groupTest1 C method");
	}
	@BeforeMethod
	public void D() {
		System.out.println("This is groupTest1 BeforeMethod method");
	}
}
