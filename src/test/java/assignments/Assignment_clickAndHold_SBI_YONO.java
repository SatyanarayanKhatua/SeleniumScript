package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_clickAndHold_SBI_YONO {

	//Click and Hold Operation on SBI-Yono login password box
	@Test
	public void test() throws InterruptedException {
		
		//Create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		//hard wait
		Thread.sleep(2000);
		
		//close the pop-up
		driver.findElement(By.xpath("//span[@class='ng-tns-c2785778308-3 icon-cancel']")).click();
		
		//create object for Actions class
		Actions actions = new Actions(driver);
		
		//hard wait
		Thread.sleep(2000);
		
		//Find the Pass Word text box and enter the data
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ghgrhrhhsft");
		
		//Find the eye button
		WebElement element = driver.findElement(By.xpath("//img[contains(@src,'assets/img/Revamp/icon_ey')]"));
		
		//hard wait
		Thread.sleep(2000);
		
		//click and hold the eye button
		actions.clickAndHold(element).perform();
		
		//hard wait
		Thread.sleep(5000);
		actions.release().perform();
	}
}
