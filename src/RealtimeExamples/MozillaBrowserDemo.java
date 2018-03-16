package RealtimeExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MozillaBrowserDemo {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "D:\\Shafi\\Temp\\Shafi\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("browser.tabs.remote.force-enable preference", false);
		
		WebDriver driver = new FirefoxDriver(cap);
		
		driver.get("http://southseasgaming.microgaming.com/Web/App/CasinoTournaments/");

		System.out.println(driver.getTitle());
		System.out.println("Second Statement");
	}

}
