package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoProject {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Shafi\\Temp\\Shafi\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
		/*
		driver.get("http://127.0.0.1:8000/components/casino-tournaments-client/");
		
		
		driver.findElement(By.xpath("//*[@id='input' and @type='email']")).sendKeys("mohammeds@ssg.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='input' and @type='password']")).sendKeys("test");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("signinButton")); 
		ele.click();*/
		
		/*List<WebElement> list=driver.findElements(By.tagName("a"));
		int A=list.size(); // gives number of links
	
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			list.get(i).getText();//click();
		}*/
		// to verify number of iframes
	    
		List<WebElement> text=driver.findElements(By.tagName("iframe")); //.xpath("//input[@type='text'[@class='inputtext']]"));
		System.out.println(text.size());
		
		for (int j=0;j<text.size();j++){
			System.out.println(text.get(j).getLocation());						
		}
		
		// to verify page is loaded completly
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		if(js.executeScript("return.document.readyState").toString().equals("complete"))
		{
			System.out.println("page is loaded completly");
		}
	}
}
