package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestClass 
{
		WebDriver driver;
	
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntnra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}
		
		@Test
		public void testCase1()
		{
		System.out.println("This is testCase1");	
		}
		
		@Test
		public void testCase2()
		{
		System.out.println("This is testCase2");	
		}
		
		@AfterClass
		public void tearDown()
		{
		
			driver.quit();
		}
		
		

}
