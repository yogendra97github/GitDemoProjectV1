package com.amazone.testing;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class groupTest2 {
	@Test(groups="login")
	public void A() {
		System.out.println("This is groupTest2 A method");
	}
	@Test(groups="login")
	public void B() {
		System.out.println("This is groupTest2 B method");
		throw new SkipException("Force fully skip ");
	}
	@BeforeSuite 
	public void C() {
		System.out.println("This is groupTest2 BeforeSuite method");
	}
	@Test(groups="logout")
	public void D() {
		System.out.println("This is groupTest2 D method");
	}

}
