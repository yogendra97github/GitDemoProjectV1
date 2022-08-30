package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class loginTest{
	WebDriver driver;
	@Test
	public void main() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
		
		String source = "HTML is the standard markup language for Web pages.";
		String atucal = driver.findElement(By.xpath("//p[text()='HTML is the standard markup language for Web pages.']")).getText();
		Assert.assertEquals(atucal	, source);
		String expect= "Click on the \"Try it Yourself\" button to see how it works.";
		String actual= driver.findElement(By.xpath("//strong[text()='Click on the \"Try it Yourself\" button to see how it works.']")).getText();
		Assert.assertEquals(actual, expect);
	
		//WebElement pass = driver.findElement(By.id("pass"));
		//driver.findElement(withTagName("input").above(pass)).sendkeys("8630093626");

		//driver.findElement(By.id("email")).sendKeys("8630093626");
		//driver.findElement(By.id("pass")).sendKeys("monuilu");
		//driver.findElement(By.xpath("/button[@id='u_0_5_L1']")).click();
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//input[@type=\'search\']")).sendKeys("Vijay Rathor");
		//driver.findElement(By.xpath("//input[@type=\"search\"]")).click();
		//driver.findElement(By.xpath("//input[@aria-label=\'Search Facebook\']")).click();
		//driver.findElement(By.xpath("//input[@aria-label=\'Search Facebook\']")).sendKeys("Vijay Rathor");
		//driver.findElement(By.xpath("//input[@aria-label=\'Search Facebook\']")).click();
			
	}
	

}
