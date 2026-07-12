package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment18_xPath {

	@Test
	public void test() throws InterruptedException {
		
		//Create an object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.horlicks.in/");
		
		//hard wait
		Thread.sleep(2000);
		
		//Click on Explore Now link
		driver.findElement(By.xpath("//html/body/main/div/div/div/a")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//click on Blogs link
		driver.findElement(By.xpath("//a[@id=\'HeaderMenu-blogs\']")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//click on Women's Health link
		driver.findElement(By.xpath("//a[@href='/blogs/articles/tagged/women-s-health']")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//click on Importance of Vitamin-D link
		driver.findElement(By.xpath("//html/body/main/section[2]/div/div/div[1]/div/div/div[3]/div/h3/a")).click();
		
		//hard wait
		Thread.sleep(2000);
	}
}
