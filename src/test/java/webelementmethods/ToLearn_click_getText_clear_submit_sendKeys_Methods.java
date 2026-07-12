package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_click_getText_clear_submit_sendKeys_Methods {

	@Test
	public void test() throws InterruptedException {
		
		//create the object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//hard wait
		Thread.sleep(2000);
		
		//enter data into search text field iphone
		driver.findElement(By.xpath("//input[@id=\'small-searchterms\']")).sendKeys("iphone");
		
		//hard wait
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.xpath("//input[@value=\'Search\']")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//capture and print the result message
		String text = driver.findElement(By.xpath("//strong[contains(@class,'result')]")).getText();
		Reporter.log(text, true);
		
		//hard wait
		Thread.sleep(2000);
		
		//clear data in the result page text field
		driver.findElement(By.xpath("//input[@id='Q']")).clear();
		
		//hard wait
		Thread.sleep(2000);
		
		//Enter the data into search text field Computer
		driver.findElement(By.xpath("//label[contains(text(),'Search keyword:')]/..//input")).sendKeys("Computer");
		
		//hard wait
		Thread.sleep(2000);
		
		//click on search button using submit
		driver.findElement(By.xpath("//input[contains(@type,'submit')]/parent::div")).submit();
		
		//hard wait
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		
	}
}
