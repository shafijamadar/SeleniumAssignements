package TestNG;

	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

		// This example is picked up from this link http://www.seleniumeasy.com/selenium-tutorials/accessing-shadow-dom-elements-with-webdriver
	public class ShadowDOMExample {

		WebDriver driver;
		//String driverPath = "C:\\Users\mj42143\workspace\New folder\Selenium_Assignments\lib\";

		@BeforeTest
		public void setUp() {
			System.out.println("Opening chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mj42143\\workspace\\New folder\\Selenium_Assignments\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		@Test
		public void testGetText_FromShadowDOMElements() {
			System.out.println("Open Chrome downloads");
			driver.get("chrome://downloads/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			System.out.println("Validate downloads page header text");
			WebElement root1 = driver.findElement(By.tagName("downloads-manager"));

	                //Get shadow root element
			WebElement shadowRoot1 = expandRootElement(root1);

			WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
			WebElement shadowRoot2 = expandRootElement(root2);

			WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
			WebElement shadowRoot3 = expandRootElement(root3);

			String actualHeading = shadowRoot3.findElement(By.cssSelector("div[id=leftContent]>h1")).getText();
			// Verify header title
			Assert.assertEquals("Downloads", actualHeading);

		}

		//Returns webelement
		public WebElement expandRootElement(WebElement element) {
			WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",element);
			return ele;
		}

		@AfterTest
		public void tearDown() {
			driver.quit();
		}
	}
	
	

