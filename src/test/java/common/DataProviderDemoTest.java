package common;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
	@Test(dataProvider = "dataset2",dataProviderClass=DataProviderDemoTest3.class)
	public void test2(String username) {
		System.out.println(username);
	}

	@Test(dataProvider = "dataset",dataProviderClass=DataProviderDemoTest3.class)
	public void test(String username, String password) {
		System.out.println(username + "=====" + password);
	}

	@Test(dataProvider = "dataset1",dataProviderClass=DataProviderDemoTest3.class)
	public void test1(String username, String password, String test) { 
		System.out.println(username + "=====" + password + "====" + test);
	}
}
