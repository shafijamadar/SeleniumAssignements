package RealtimeExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {

	public static void main(String[] args) {
	
		WebDriver driver= new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("selenium");
		//*[@id='uh-search-box']
		
		List<WebElement> list=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_4_1493989730564')]"));
	
		//*[@id='yui_3_18_0_4_1493989730564_2976']
		//*[@id='yui_3_18_0_4_1493989730564_3054']
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
				
		System.out.println(list.size());
		
	//	list.get(1).click();
		
	WebElement ele=driver.findElement(By.id("name"));
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		alert.dismiss();
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		action.click();
	/*	
		WebElement iframe=driver.findElement(By.xpath(""));
		action.moveToElement(iframe).perform();*/
		
	//	Select select=new Select(iframe);
		
		
		
		
		
	}

}
