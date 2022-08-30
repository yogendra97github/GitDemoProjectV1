package ui;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class online {
	
	
	//WebDriver driver;
	//ui.testUtils test;
	@Test
	public void launch() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");

		testUtils ts = new testUtils(driver);
		ts.tastscreenshot();
		
		//WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.com/");
		//online test = new online();

	}

}
