package com.webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearn_getRectMethod {
	@Test
	public void test() {
		
				//create the object of ChromeDriver class
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to url
				driver.get("https://demowebshop.tricentis.com/");
				
				//capture the size of the web element using getRect()
				Rectangle rect = driver.findElement(By.xpath("//ul[@class='top-menu']")).getRect();
				
				//print the size
				System.out.println(rect);
				System.out.println(rect.getX());
				System.out.println(rect.getY());
				System.out.println(rect.getHeight());
				System.out.println(rect.getWidth());
				
				//close the browser
				driver.close();
	}
}
