package com.ByClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_cssSelectorMethod {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//hard wait
		Thread.sleep(3000);
		
		//find the vote button and perform click operation
		driver.findElement(By.cssSelector("[value='Vote']")).click();
		
		//hard wait
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
	}
}
