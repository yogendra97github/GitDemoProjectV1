package ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActionExample2 {
	static WebDriver driver;
	static WebDriverWait wait;
	static String parentwindowname = null;
	String browser;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("firefox") String browser) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			caps.setCapability(ChromeOptions.CAPABILITY, options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("-private");
			caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("-inPrivate");
			caps.setCapability(EdgeOptions.CAPABILITY, options);
		}
		caps.setBrowserName("firefox");
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		driver = new RemoteWebDriver(new URL("http://192.168.43.171:4444"), caps);

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		parentwindowname = driver.getWindowHandle();
	}

	// draggable();
	// droppable();
	// menu();
	// resizable();
	// selectable();
	// sortable();
	// accordion();
	// autocomplete();
	// button();
	// checkboxradio();
	// controlgroup();
	// datepicker();
	// dialog();
	// progressbar();
	// selectmenu();
	// slider();
	// spinner();
	// tabs();
	// addclass();
	// coloranimation();
	// easing();
	// effect();
	// hide();
	// removeclass();
	// show();
	// switchclass();
	// toggle();
	// toggleclass();
	// position();
	// widget_Factory();
	// }
	@Test
	public static void draggable() {
		driver.switchTo().window(parentwindowname);

		driver.findElement(By.xpath("//a[@href=\'http://jqueryui.com/draggable/\']")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		WebElement source = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 150, 150).build().perform();

	}

	@Test
	public static void droppable() {
		driver.switchTo().window(parentwindowname);

		driver.switchTo().window(parentwindowname);
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();

	}

	/*public static void menu() throws InterruptedException {
		driver.switchTo().window(parentwindowname);

		driver.findElement(By.linkText("Menu")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='menuitem']")));

		WebElement menu1 = driver.findElement(By.id("ui-id-9"));
		WebElement menu2 = driver.findElement(By.id("ui-id-13"));
		WebElement menu3 = driver.findElement(By.id("ui-id-15"));
		Actions action = new Actions(driver);
		action.moveToElement(menu1);
		Thread.sleep(1000);
		action.moveToElement(menu2);
		Thread.sleep(1000);
		action.moveToElement(menu3).build().perform();

		// driver.findElement(By.xpath("//div[@id=\'ui-id-9\']")).click(); //
		driver.findElement(By.xpath("//div[@id=\'ui-id-13\']")).click(); //
		driver.findElement(By.xpath("//div[@id=\'ui-id-15\']")); // Actions action =
		new Actions(driver);

		// action.moveToElement(menu1).build().perform();

	}

	@Test
	public static void resizable() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Resizable\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(
				By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 70, 80).click().build().perform();
	}

	@Test
	public static void selectable() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\"Selectable\"]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement item1 = driver.findElement(By.xpath("//li[text()=\'Item 1\']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()=\'Item 2\']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()=\'Item 3\']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()=\'Item 4\']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()=\'Item 5\']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()=\'Item 6\']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()=\'Item 7\']"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.LEFT_CONTROL).click(item1).click(item3).click(item5).click(item7).build().perform();

	}

	@Test
	public static void sortable() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Sortable\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("// [@id=\"sortable\"]/li[1]/text()"));
		WebElement target = driver.findElement(By.xpath("// [@id=\\'sortable\\']/li[2]/text()"));
		Actions action = new Actions(driver);
		action.clickAndHold().dragAndDrop(source, target).build().perform();
	}

	@Test
	public static void accordion() {
		driver.findElement(By.xpath("//a[text()=\'Accordion\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By
				.xpath("//h3[@id=\'ui-id-5\']//span[@class=\'ui-accordion-header-icon ui-icon ui-icon-triangle-1-e\']"))
				.click();

	}

	@Test
	public static void autocomplete() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Autocomplete\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("//input[@id=\'tags\']"));
		source.sendKeys("J");
		source.click();
	}

	@Test
	public static void button() {
		driver.findElement(By.xpath("//a[text()=\'Button\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); //
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("An //anchor")));
		driver.findElement(By.xpath("//a[text()=\'An anchor\']")).click();
	}

	@Test
	public static void checkboxradio() {
		driver.findElement(By.xpath("//a[text()=\'Checkboxradio\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//label[@for=\'radio-2\']")).click();
		driver.findElement(By.xpath("//label[@for=\'checkbox-4\']")).click();
		driver.findElement(By.xpath("//label[@for=\'checkbox-nested-4\']")).click();

	}

	@Test
	public static void controlgroup() {
		driver.findElement(By.xpath("//a[text()=\'Controlgroup\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//span[@class=\'ui-selectmenu-icon ui-icon ui-icon-triangle-1-s\']")).click();
		driver.findElement(By.xpath("//div[@id='ui-id-3']")).click();
		driver.findElement(By.xpath("//label[@for=\'transmission-automatic\']")).click();
		driver.findElement(By.xpath("//label[@for='insurance']")).click();

	}

	@Test
	public static void datepicker() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Datepicker\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/07/2022");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

	}

	@Test
	public static void dialog() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Dialog\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("//span[@id=\'ui-id-1\']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 50, 50).click().build().perform();
	}

	@Test
	public static void progressbar() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Progressbar\']")).click();
		driver.findElement(By.xpath("//a[text()=\"Download Dialog\"]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[@id=\'downloadButton\']")).click();
	}

	@Test
	public static void selectmenu() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Selectmenu\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//div[text()=\'Faster\']")).click();

		driver.findElement(By
				.xpath("//span[@id=\'files-button\']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']"))
				.click();
		driver.findElement(By.xpath("//div[text()=\'ui.jQuery.js\']")).click();

		driver.findElement(By.xpath(
				"//span[@id=\"number-button\"]//span[@class=\"ui-selectmenu-icon ui-icon ui-icon-triangle-1-s\"]"))
				.click();
		driver.findElement(By.xpath("//div[text()=\'6\']")).click();

		driver.findElement(By.xpath(
				"//span[@id=\'salutation-button\']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']"))
				.click();
		driver.findElement(By.xpath("//div[text()=\'Prof.\']")).click();

	}

	@Test
	public static void slider() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Slider\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver
				.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 300, 0).build().perform();
	}

	@Test
	public static void spinner() {
		driver.findElement(By.xpath("//a[text()=\'Spinner\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(
				By.xpath("//a[@tabindex=\'-1\']//span[@class=\'ui-button-icon ui-icon ui-icon-triangle-1-n\']"))
				.click();
		driver.findElement(By.xpath("//button[@id=\'disable\']")).click();
		driver.findElement(By.xpath("//button[@id=\'destroy\']")).click();
		driver.findElement(By.xpath("//button[@id=\'setvalue\']")).click();

	}

	@Test
	public static void easing() {
		driver.findElement(By.xpath("//a[text()=\'Easing\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//div[text()=\'1. linear\']")).click();
	}

	@Test
	public static void tabs() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Tabs\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//a[text()=\'Proin dolor\']")).click();
	}

	@Test
	public static void addclass() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Add Class\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();
	}

	@Test
	public static void coloranimation() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Color Animation\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[text()=\'Toggle Effect\']")).click();
	}

	@Test
	public static void effect() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Effect\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Select effect = new Select(driver.findElement(By.id("effectTypes")));
		effect.selectByVisibleText("Fold");
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();

	}

	@Test
	public static void hide() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Hide\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Select effect = new Select(driver.findElement(By.id("effectTypes")));
		effect.selectByVisibleText("Puff");
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();

	}

	@Test
	public static void removeclass() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Remove Class\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();
	}

	@Test
	public static void show() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Show\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Select effect = new Select(driver.findElement(By.id("effectTypes")));
		effect.selectByVisibleText("Explode");
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();

	}

	@Test
	public static void switchclass() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Switch Class\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();
	}

	@Test
	public static void toggle() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Effect\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Select effect = new Select(driver.findElement(By.id("effectTypes")));
		effect.selectByVisibleText("Drop");
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();

	}

	@Test
	public static void toggleclass() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Toggle Class\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[text()=\'Run Effect\']")).click();
	}

	@Test
	public static void position() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Position\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Select myhorizontal = new Select(driver.findElement(By.id("my_horizontal")));
		myhorizontal.selectByVisibleText("center");
		Select myvertical = new Select(driver.findElement(By.id("my_vertical")));
		myvertical.selectByVisibleText("center");
		Select athorizontal = new Select(driver.findElement(By.id("at_horizontal")));
		athorizontal.selectByVisibleText("center");
		Select atvertical = new Select(driver.findElement(By.id("at_vertical")));
		atvertical.selectByVisibleText("center");
		Select collisionhorizontal = new Select(driver.findElement(By.id("collision_horizontal")));
		collisionhorizontal.selectByVisibleText("flip");
		Select collisionvertical = new Select(driver.findElement(By.id("collision_vertical")));
		collisionvertical.selectByVisibleText("flip");
	}

	@Test
	public static void widget_Factory() {
		driver.switchTo().window(parentwindowname);
		driver.findElement(By.xpath("//a[text()=\'Widget Factory\']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//button[text()=\'Go green\']")).click();
		driver.findElement(By.xpath("//div[@id=\'my-widget1\']//button")).click();
		driver.findElement(By.xpath("//div[@id=\'my-widget2\']//button")).click();
		driver.findElement(By.xpath("//div[@id=\'my-widget3\']//button")).click();
		driver.findElement(By.xpath("//button[text()=\'Toggle disabled option\']")).click();

	}*/

}
