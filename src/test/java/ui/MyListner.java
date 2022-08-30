package ui;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListner implements IRetryAnalyzer{
	private int retryCount = 0;
	private int maxRetryCount = 5;
	

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount <maxRetryCount) {
			
			retryCount++;
			return true;
		}
		return false;
	}
}
