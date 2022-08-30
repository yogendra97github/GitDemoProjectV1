package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.webloader.WebLoader;

public class GoogleSearch {
	public WebLoader webloader;
	public WebDriver driver;
	
	/*public GoogleSearch(WebDriver driver) {
		webloader = new WebLoader();
		webloader.first();
		
	}*/
	public void beforeclass(WebDriver driver) {
		webloader = new WebLoader();
		
		
		
	}
	
	By searchbox = By.xpath("//input[@name='q']");
	By Search_btn = By.xpath("(//input[@value='Google Search'])[1]");
	By Facebook_link = By.xpath("(//div[@class=\'TbwUpd NJjxre\'])[1]");
	public void searchGoogle(String Searchinput)  {
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(1000);
			driver.findElement(Search_btn).click();
			Thread.sleep(2000);

		}catch(Exception e) {
			System.out.println("Exceptions Caught "+ e.getMessage());
		}
		
	}
	public void ClickFacebook() {
		try {
			driver.findElement(Facebook_link).click();
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println("Expection Cought"+ e.getMessage());
		}
		
	}
	
}
