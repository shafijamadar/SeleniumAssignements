package RealtimeExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchInputBox {

	WebDriver driver= null;
		
	@BeforeMethod
	public void setUp() {
		
	//	driver= new FirefoxDriver();
			
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shafi\\Temp\\Shafi\\Selenium\\Jar files\\chromedriver.exe");
		DesiredCapabilities cap=new DesiredCapabilities();
		//	cap.setBrowserName("chrome");
			cap=DesiredCapabilities.chrome();	
		//	cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			
			driver= new ChromeDriver(cap);
		
		
		
	/*	System.setProperty("webdriver.chrome.driver", "D:\\Shafi\\Temp\\Shafi\\Selenium\\Jar files\\chromedriver.exe");
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-extensions");
		
		DesiredCapabilities des=new DesiredCapabilities().chrome();
		des.setBrowserName("chrome");
		des.setCapability(ChromeOptions.CAPABILITY, options);*/
		
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}

	@Test
	public void searchTextbox(){
		
		// Click on Womens tab in the header
		WebElement element=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
		element.click();
		
		// find the list of all the checkboxes present on the page
		
		WebElement a = null;
		List <WebElement> ele=driver.findElements(By.xpath("//input[@type='checkbox']"));
				
			for(int i=1;i<ele.size();i++){
			a=(ele.get(i));
				System.out.println("Name of the the textboxe is: "+a.getAttribute("name"));
		}	 
			System.out.println(ele.size());
			
			try{
				String b="layered_category_8";
				Assert.assertEquals(a.getAttribute("name"),b);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}
	
	@AfterMethod
	public void tear(){
		if(driver !=null){
			driver.quit();
		}
	}
}
