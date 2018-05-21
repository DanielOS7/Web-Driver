package com.qa.webdriver.Webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class webdriver {
	
	WebDriver driver;
	 
	
	@Before
	
	public void setup() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void layoutTest () {
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Hello World");; 
		
		
	}
	
	@After
	public void end () {
		driver.quit();
		
	} 
	

}
