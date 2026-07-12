package toLearn_WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_setSizemethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//hard wait
		Thread.sleep(5000);
		
		//For set the size of the browser window
		//Create the object of Dimension class
		Dimension dimension = new Dimension(800,600);
		driver.manage().window().setSize(dimension);
		
		//hard wait
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();
	}
}
