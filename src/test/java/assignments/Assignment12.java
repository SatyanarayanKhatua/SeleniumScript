package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment12 {

	@Test
	public void test() {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//capture the position of the window
		System.out.println(driver.manage().window().getPosition());
		
		//close the browser
		driver.quit();
	}
}
