package RealtimeExamples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeBrowserInitalisation {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
			
		System.setProperty("webdriver.chrome.driver", "D:\\Shafi\\Temp\\Shafi\\Selenium\\Jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("test-type");
	//	options.addArguments("disable-infobars");
	//	options.addArguments("--disable-web-security");
		options.addArguments("chrome.switches","--disable-extensions");	
		capabilities.setCapability("chrome.binary", "D:\\Shafi\\Temp\\Shafi\\Selenium\\Jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
		WebDriver driver= new ChromeDriver(capabilities);
		driver.navigate().to("http://southseasgaming.microgaming.com/Web/App/CasinoTournaments/");
	
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	Thread.sleep(5000);
		
		

	}
	
}

