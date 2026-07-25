package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToLearn_doubleClick_WEref_Method {

	@Test
	public void test() throws InterruptedException {
		
		//Create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://www.zepto.com/cn/dairy-bread-eggs/milk/cid/4b938e02-7bde-4479-bc0a-2b54cb6bd5f5/scid/22964a2b-0439-4236-9950-0d71b532b243");
		
		//hard wait
		Thread.sleep(2000);
		
		//Find the web element
		WebElement element = driver.findElement(By.xpath("//img[contains(@alt,'Nandini S') and contains(@src,'https://cdn.zeptonow.com/production/ik-seo/tr:w-403,ar-1') ]/following-sibling::button"));		
		//create object for Actions class
		Actions actions = new Actions(driver);
		
		//Double click on web page
		actions.doubleClick(element).perform();
	}
}
