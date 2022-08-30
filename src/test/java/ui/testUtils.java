package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class testUtils {
	public WebDriver driver;

	public testUtils(WebDriver driver) {
		
		this.driver = driver;
	}
	public void tastscreenshot() throws IOException {
		Date currentdate = new Date();
		String scrfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		//Convert web driver object to takescreenshot
		TakesScreenshot scrshot = ((TakesScreenshot) driver);
		File ScrFile = scrshot.getScreenshotAs(OutputType.FILE);
		String FileWithPath = ".//Downloads//"+scrfilename+".png";
		File DestFile = new File(FileWithPath);
		FileUtils.copyFile(ScrFile, DestFile);
		}
}
