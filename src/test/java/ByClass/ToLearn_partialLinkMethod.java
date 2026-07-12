package com.ByClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_partialLinkMethod {

	@Test
	public void test() throws InterruptedException {
		
		//create the  object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//hard wait
		Thread.sleep(3000);
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//hard wait
		Thread.sleep(3000);
		
		//identify Apparel & Shoes and click operation
		driver.findElement(By.partialLinkText("Appa"));
		
		//close the browser
		driver.quit();
	}
}
