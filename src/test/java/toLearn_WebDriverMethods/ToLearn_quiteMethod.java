package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_quiteMethod {
	@Test
	public void test() throws InterruptedException {
		//create the object of ChromeDriver Class
		WebDriver driver = new ChromeDriver();
		
		//navigate to the url
		driver.get("https://demowebshop.tricentis.com/login");
		
		//hard wait
		Thread.sleep(10000);
		
		//close only current session
//		driver.close();
		
		//close the all connection client server(selenium to browser)
		driver.quit();
	}
}
