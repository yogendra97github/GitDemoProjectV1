package com.amazone.testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	public void titleTest() {
		String expectedTitle ="jQuery UI";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Text Verifion failed");
		driver.close();
		
	}
}
