package actionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToLearn_scrollByAmountMethod {

	@Test
	public void test() throws InterruptedException {
		
		//Create the object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://doodles.google/");
		
		//hard wait
		Thread.sleep(2000);
		
		//create the object of Action class & pass WebDriver reference
		Actions actions = new Actions(driver);
		
		//scrolling using x and y coordinates
		actions.scrollByAmount(0,4000).perform();
		
	}
}
