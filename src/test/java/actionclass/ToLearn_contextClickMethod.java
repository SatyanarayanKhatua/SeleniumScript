package actionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToLearn_contextClickMethod {

	@Test
	public void test() throws InterruptedException {
		
		//Create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://excalidraw.com/");
		
		//hard wait
		Thread.sleep(2000);
		
		//create object for Actions class
		Actions actions = new Actions(driver);
		
		//Right click on the web page
		actions.contextClick().perform();
	}
}
