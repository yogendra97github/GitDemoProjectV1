package com.amazone.testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import ui.testUtils;


public class ReadingfromXml {
	 WebDriver driver;
	 //String browser= "chrome";
	
	@Parameters( {"browser"} )
	//@Test
	@BeforeClass
	public void launchApplication(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}


	}

	@Test
	public void facebook() throws IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		testUtils ts = new testUtils(driver);
		ts.tastscreenshot();

	}
}
