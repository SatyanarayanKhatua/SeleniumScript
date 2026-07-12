package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment11 {

	@Test
	public void test() throws InterruptedException {
		
		// lunch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// Set the browser height and width
		Dimension dimension = new Dimension(150, 200);
		driver.manage().window().setSize(dimension);
		
		//hard wait
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
}
