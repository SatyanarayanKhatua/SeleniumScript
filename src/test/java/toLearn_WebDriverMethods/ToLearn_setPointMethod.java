package toLearn_WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_setPointMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//hard wait
		Thread.sleep(3000);
		
		//set the position of the browser
		Point point = new Point(500,100);
		driver.manage().window().setPosition(point);
		
		//hard wait
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
}
