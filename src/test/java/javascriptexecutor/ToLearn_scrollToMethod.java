package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_scrollToMethod {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of the WebDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://doodles.google/");
		
		//Type cast the WebDriver reference to JavaScriptExecutor reference
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		//hard wait
		Thread.sleep(2000);
		
		//Scrolling by using executeScript() and passing the argument as window.srollTo() 
		js.executeScript("window.scrollTo(0,800)");
		
		//hard wait
		Thread.sleep(2000);
		
		//Scrolling by using executeScript() and passing the argument as window.srollTo() 
		js.executeScript("window.scrollTo(0,500)");
		
		//hard wait
		Thread.sleep(2000);
		
		//Scrolling by using executeScript() and passing the argument as window.srollTo() 
		js.executeScript("window.scrollTo(0,900)");
	}
	
}
