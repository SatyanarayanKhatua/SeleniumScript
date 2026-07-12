package toLearn_WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getPointMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//get and Print the position
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		//only get the X position
		System.out.println(position.getX());
		
		//only get the Y position
		System.out.println(position.getY());
		
		//hard wait
		Thread.sleep(3000);
		
		//close browser
		driver.quit();
	}
}
