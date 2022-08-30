package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest2 {
	@Test(dataProvider="create")
	public void test(String username, String password) {
	
		
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("-incognito");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	
	}	
	@DataProvider(name="create")
	public Object[][] dataset1(){
		return new Object[][] {
			{"9897553356","9897553356"},
			{"8956252652","8956252652"},
			{"8569963624","8569963624"},
			{"9856869632","9856869632"}
		};
	}

		
}
