package assignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment13 {
	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//hard wait
		Thread.sleep(3000);
		
		//Set the position of the window
		Point point = new Point(650, 450);
		driver.manage().window().setPosition(point);
		
		//hard wait
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
}
