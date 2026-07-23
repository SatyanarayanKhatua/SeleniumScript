package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_iframes2 {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of the ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//hard wait
		Thread.sleep(2000);
		
		//identify and click on close 
		driver.findElement(By.xpath("//div[@class='tox-icon']/child::*[name()='svg']")).click();
		
		//identify frame web element and store it
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		
		//transfer the controller to frame
		driver.switchTo().frame(frameelement);
		
		//hard wait
		Thread.sleep(2000);
		
		//capture and print the paragraph inside the frame
		String text1 = driver.findElement(By.xpath("//p[contains(text(),'Y')]")).getText();
		Reporter.log(text1, true);
		
		//transfer the controller to Main web page
		driver.switchTo().parentFrame();
		
		//hard wait
		Thread.sleep(2000);
		
		//capture and print the paragraph inside the Main web page
		String text2 = driver.findElement(By.xpath("//div[text()='Powered by ']")).getText();		
		Reporter.log(text2, true);
		
		//close the browser
		driver.close();
		
	}
}
