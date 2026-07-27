package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_executeScript_method_for_Desalble_Element {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of the WebDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//Type cast the WebDriver reference to JavaScriptExecutor reference
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//hard wait
		Thread.sleep(2000);
		
		//Click on disable option
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//Find the disable text box
		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		
		//hard wait
		Thread.sleep(2000);
		
		//Enter the data into disable text field by executeScript method and passing the argument as 
		js.executeScript("arguments[0].value = ('satya123@gmail.com')",element);
	}
}