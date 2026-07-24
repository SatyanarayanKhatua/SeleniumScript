package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToLearn_ExplicitWait {

	@Test
	public void test() throws InterruptedException {
		
		//create the object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to ulr
//		driver.get("https://www.shoppersstack.com/products_page/51");
		
		//hard wait
//		Thread.sleep(6000);
		
		//identify and store check button
//		WebElement element = driver.findElement(By.xpath("//button[@id='Check']"));
		
		//Create object for WebDriverWait class
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//condition declaration statement
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		//perform click button
//		element.click();
		
		//------------------------------------------//
		
		//For instagram login page
		
		//navigate to ulr
		driver.get("https://www.instagram.com/?hl=en");
		
		//hard wait
		Thread.sleep(6000);
		
		//identify and store check button
		WebElement element = driver.findElement(By.xpath("//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft' and text()='Log in']"));
		
		//Create object for WebDriverWait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//condition declaration statement
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		//perform click button
		element.click();
	}
}
