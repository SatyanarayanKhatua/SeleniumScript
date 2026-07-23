package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ToLearn_TakesScreenshotOfWebpage {

	@Test
	public void test() throws IOException, InterruptedException {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://chat.qspiders.com/student-dashboard");
		
		//hard wait
		Thread.sleep(4000);
		
		//Type cast driver into TakeScreenshot reference
		TakesScreenshot  takesScreenshot = (TakesScreenshot) driver;
		
		//call the getScreenshotAs() and pass the argument (OutputType.FILE) and store it in a temporary variable
		File tem = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		//create the object of File class
		File dest = new File("./errorshots/image.png");
		
		//copy temp & paste it into destination
		FileHandler.copy(tem, dest);
	}
}
