package DemoCollection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortedList {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://Studytonight.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
			

	}

}
