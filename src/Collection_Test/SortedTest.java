package Collection_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SortedTest {
	
	WebDriver driver = null;
  @Test
  public void SortList() {
	  
	  	System.setProperty("webdriver.gecko.driver", "D:\\Shafi\\Temp\\Shafi\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://Studytonight.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ArrayList<String> arraylist = new ArrayList<>();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++){
			String elements = list.get(i).getText();
	//		System.out.println(elements);		
			arraylist.add(elements);
		}
		
		Collections.sort(arraylist);
		
		System.out.println(arraylist);
		/*
		for(String str : arraylist){
			
			System.out.println(str);
		}*/
		System.out.println("after sorting++++");
		
		Collections.reverse(arraylist);
	
			System.out.println(arraylist);
	
  }
  
  @AfterMethod
  public void tearDown(){
	  if(driver !=null){
		  driver.close();
	  }
  }
}
