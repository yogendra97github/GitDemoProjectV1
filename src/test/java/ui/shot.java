package ui;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class shot{
	WebDriver driver;
	WebDriverWait wait;
@BeforeClass
@Test
public void beforeClass(){
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("-incognito");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
@Test
public void tastscreenshot() throws IOException {
	
	
		
	//Convert web driver object to takescreenshot
	TakesScreenshot scrshot = ((TakesScreenshot) driver);
	File ScrFile = scrshot.getScreenshotAs(OutputType.FILE);
	String FileWithPath = "./Downloads/image-1.jpeg";
	File DestFile = new File(FileWithPath);
	FileUtils.copyFile(ScrFile, DestFile);
	}
}