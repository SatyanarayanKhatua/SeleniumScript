package com.ByClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_xPathMethod {

	@Test
	public void test() throws InterruptedException {
		
		//create the object for ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//hard wait
		Thread.sleep(3000);
		
		//xPath(String AbsolutePath) method {Absolute Path}
		
		//Locate the register link and perform click operation
//		driver.findElement(By.xpath("./html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		//Locate the Good Radio button and perform click operation
//		driver.findElement(By.xpath("./html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[2]/input")).click();
		
		//Locate the Vote button and perform click operation
//		driver.findElement(By.xpath("./html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div/input")).click();
		
		//Locate the PowerBy nopCorporation link and perform click operation
//		driver.findElement(By.xpath("./html/body/div[4]/div[2]/div[2]/a")).click();
		
		//Locate the Google+ link and perform click operation
		driver.findElement(By.xpath("./html/body/div[4]/div[2]/div[1]/div[4]/ul/li[5]/a")).click();
		
		
	}
}
