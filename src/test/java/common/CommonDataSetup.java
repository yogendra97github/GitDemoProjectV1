package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	@BeforeSuite
	public void dataSetup() {
		System.out.println("Common data setup");
	}
	@AfterSuite
	public void dataTeardown() {
		System.out.println("common data cleanup");
	}

}
