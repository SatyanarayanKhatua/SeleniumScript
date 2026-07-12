package toLearn_WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_toString_url_to_Url_url_Method {
	
	@Test
	public void test() throws InterruptedException, MalformedURLException {
		
		//lunch browser
		WebDriver driver = new ChromeDriver(); //1st mandatory line of code
		
		//hard wait
		Thread.sleep(3000);
		
		//to maximize the browser window
		driver.manage().window().maximize(); //2nd mandatory line of code
		
		//hard wait
		Thread.sleep(3000);
		
		//navigate to url by to(String url)
		driver.navigate().to("https://www.cricbuzz.com/");
		
		//hard wait
		Thread.sleep(3000);	
	
		//navigate to url by to(Url url)
		URL url = new URL("https://chatgpt.com/");
		driver.navigate().to(url);
		
		//hard wait
		Thread.sleep(3000);	
		
		//close the browser 
		driver.quit(); //Last mandatory line of code
		
		
		
	}
}