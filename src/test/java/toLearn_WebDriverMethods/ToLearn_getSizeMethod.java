package toLearn_WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getSizeMethod {

	@Test
	public void test() throws InterruptedException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver();
		
		//get the size of the web browser
		
		Dimension size = driver.manage().window().getSize();
		
		//print size
		System.out.println(size);
		
		//print only width
		System.out.println(size.getWidth());
		
		//print only height
		System.out.println(size.getWidth());
		
		//hard wait
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
}
