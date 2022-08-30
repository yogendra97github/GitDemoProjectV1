package com.gmail.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndSignup {

	WebDriver driver;
	public String passwordTest;
	String passwordMismatchAleart;
	LoadWebDriver loaddriver;
	//public String userStatus;

	public LoginAndSignup(String browser) {
		loaddriver = new LoadWebDriver();
		this.driver = loaddriver.getWebDriver(browser);
	
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
		// this.driver = new ChromeDriver();
			
	}

	public void createAccountForPersonalUse(String firstname, String lastname, String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[3]")).click();
		driver.findElement(By.xpath("//span[@jsname='K4r5Ff']")).click();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("Username")).sendKeys(username);
		driver.findElement(By.name("Passwd")).sendKeys(password);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		passwordTest = driver.findElement(By.name("ConfirmPasswd")).getText();
		driver.findElement(By.xpath("//span[text()=\'Next\']")).click();
		System.out.println(passwordTest+"Abcd"); 


	}

	public void createAccountForPersonalUseWithWrongPassword(String firstname, String lastname, String username, String password,String passwords) {
		driver.findElement(By.xpath("(//button[@jscontroller=\'soHxf\'])[3]")).click();
		driver.findElement(By.xpath("//span[@jsname='K4r5Ff']")).click();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("Username")).sendKeys(username);
		driver.findElement(By.name("Passwd")).sendKeys(password);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(passwords);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		passwordMismatchAleart = driver.findElement(By.xpath("//span[text()=\'Those passwords didn’t match. Try again.\']")).getText();
																		
		driver.findElement(By.xpath("//span[text()=\'Next\']")).click();
	}

	public void verifyPhoneNumber(String mobileNumber, String code) {
		driver.findElement(By.id("phoneNumberId")).sendKeys(mobileNumber);
		driver.findElement(By.name("code")).sendKeys(code);
		driver.findElement(By.xpath("//span[text()=\'Verify\']")).click();
		
	}

	public void loginWithValidCredentials(String username, String password) {
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.xpath("//span[text()=\'Next\']")).click();
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()=\'Next\']")).click();
		
		
		
		

	}

	public void loginWithInvalidCredentials(String username, String password) {
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.xpath("//span[text()=\'Next\']")).click();
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()=\'Next\']")).click();
		
	}

}
