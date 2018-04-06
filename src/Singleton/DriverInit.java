package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit instanceDriver = null;
	private WebDriver driver;
	
	private DriverInit(){
		
	}
	
	public WebDriver OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Shafi\\Temp\\Shafi\\Selenium\\Jar files\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public static DriverInit getInstance(){
		if(instanceDriver==null)
			instanceDriver = new DriverInit();	
		return instanceDriver;
		
	}
}
