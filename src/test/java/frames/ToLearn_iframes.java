package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_iframes {

	@Test
	public void test() {
		
		//create the object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//explicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		//identify frame element and store it
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		//transfer the driver controller into frame using frameelement
		driver.switchTo().frame(frameelement);
		
		//identify text field inside iframe and enter the data
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("satya@gmail.com");
		
		
	}
}
