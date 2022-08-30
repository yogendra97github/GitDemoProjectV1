package com.amazone.testing;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupTest3 {
	@Test(groups="login")
	public void A() {
		System.out.println("This is groupTest3 A method");
	}
	@Test(groups="login")
	public void B() {
		System.out.println("This is groupTest3 B method");
	}
	@Test(groups="logout") 
	public void C() {
		System.out.println("This is groupTest3 C method");
	}
	@BeforeGroups(value="login")
	public void D() {
		System.out.println("This is groupTest3 Beforegroups method");
	}
	@AfterGroups(value="login")
	public void E() {
		System.out.println("This is groupTest3 Aftergroups method");
	}
	@BeforeClass
	public void F() {
		System.out.println("This is groupTest3 BeforeClass method");
	}

}
