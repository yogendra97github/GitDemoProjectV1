package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gmail.pageobject.LoadWebDriver;
import com.webloader.WebLoader;

import Objects.FacebookPage;
import Objects.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	
	//WebDriver driver;
	GoogleSearch objectrepo;
	
	@BeforeTest
	public void beforetest() {
		
		objectrepo = new GoogleSearch();
	
		
		 
		
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		//objectrepo.manage().timeouts().implicitlyWait(0 , TimeUnit.SECONDS);
		//objectrepo.get("https://www.google.com/");
	}
	
	@Test(priority=0)
	public void searchOperation() throws InterruptedException {
		//objectrepo = new GoogleSearch(driver);
		objectrepo.searchGoogle("facebook");
	
		
	}
	@Test(priority = 1)
	public void VerifyAndAccessFacebook() {
		//objectrepo = new GoogleSearch(driver);
		objectrepo.ClickFacebook();
	}
	@Test(priority = 2)
	public void VerifyLogin() throws InterruptedException {
		FacebookPage page = new FacebookPage(driver);
		page.EnterUserName();
		page.EnterPassword();
		page.VerifyLogin();
	}
	
	/*@AfterTest
	public void aftertest() {
		driver.quit();
	}*/
}
