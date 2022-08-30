package com.gmail.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gmail.pageobject.LoadWebDriver;
import com.gmail.pageobject.LoginAndSignup;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginAndSignUp {
	 WebDriver driver;
	 WebDriverWait wait;
	 String parentwindowname=null;
	 LoginAndSignup login;
	String passwordMismatchAleart;
	LoadWebDriver loaddriver;
	 //String ;
	// String passwordTest;
	@Parameters("browser")
	@BeforeTest
	public void beforeClass(@Optional ("firefox") String browser) {
		login = new LoginAndSignup(browser);
		loaddriver = new LoadWebDriver();
		//this.driver = loaddriver.getWebDriver(browser);

		/*WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-incognito");
		
		driver = new ChromeDriver(option);
		//wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();*/
		}
		//@AfterClass
		//public void afterClass() {
			//driver.quit();
		//}
		@Test
		public void testloginSignupForPersonalAccount() throws InterruptedException  {

			login.createAccountForPersonalUse("Sachin", "Tendulkar", "Sachin@123", "Password@123");
			//Assert.assertEquals(loginSignup.passwordTest, "Password@123");
			//loginSignup.createAccountForPersonalUseWithWrongPassword("Sachin", "Tendulkar", "Sachin@123", "Password@123","Password@1234");
			//Assert.assertEquals(passwordMismatchAleart, );
			//loginSignup.loginSignupWithValidCredentials("monusingh061194@gmail.com", "Password@123");
			//loginSignup.loginSignupWithInvalidCredentials("monusingh061194@gmail.com", "Password@123");
		}


}
