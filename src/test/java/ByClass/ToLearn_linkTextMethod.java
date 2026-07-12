package com.ByClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_linkTextMethod {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("http://demowebshop.tricentis.com/");
		
		//hard wait
		Thread.sleep(5000);
		
		//identify sign up text fields and enter the data
		driver.findElement(By.id("newsletter-email")).sendKeys("demo@gmail.com");
		
		//hard wait
		Thread.sleep(5000);
		
		//identify subscribe button and click
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		
		//hard wait
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();
		
		
	}

}
