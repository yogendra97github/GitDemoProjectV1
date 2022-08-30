package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage {

	WebDriver driver;
	
	public  FacebookPage(WebDriver driver) {
		
		this.driver = driver;
	}
	By Username_editbox = By.xpath("//input[@id=\"email\"]");
	By password_editbox = By.id("pass");
	By Login_Btn = By.name("login");
	public void EnterUserName() throws InterruptedException {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
		Thread.sleep(1000);
		
	}
	private WebElement findElement(By username_editbox2) {
		// TODO Auto-generated method stub
		return null;
	}
	public void EnterPassword() {
		driver.findElement(password_editbox).clear();
		driver.findElement(password_editbox).sendKeys("Tester123");
		
	}
	public void VerifyLogin() {
		driver.findElement(Login_Btn).click();
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals(title, "Facebook � log in or sign up");
	}

			
}
