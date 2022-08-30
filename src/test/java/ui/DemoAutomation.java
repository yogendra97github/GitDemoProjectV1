package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation{
	//public static String browser = "chrome";
	public static WebDriver driver;
	//@Parameters("browser")
	@Test
	public void launchApplication(String browser) {
	if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
		    driver = new FirefoxDriver(options);
			
		}
		else if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			driver = new ChromeDriver(options);
		}
		else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("-inprivate");
			driver = new EdgeDriver(options);
		}
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		//driver.findElement(By.className("nav-search-submit nav-sprite")).click();
		/*Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		//driver.quit();
		*/
		
		
		
		
	} 
}