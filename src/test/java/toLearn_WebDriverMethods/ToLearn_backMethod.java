package toLearn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_backMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver(); //1st mandatory line of code
		
		//hard wait
		Thread.sleep(3000);
		
		//to maximize the browser window
		driver.manage().window().maximize(); //2nd mandatory line of code
		
		//navigate to url
		driver.get("https://www.cricbuzz.com/");
		
		//hard wait
		Thread.sleep(3000);	
		
		//navigate back 
		driver.navigate().back();
		
		//hard wait
		Thread.sleep(3000);	
		
		//close the browser 
		driver.quit(); //Last mandatory line of code
	}
	
}
