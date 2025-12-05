package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class LoginTest {
	
	@Parameters({"username","password"})
	
	
	@Test
	  
	public void Login(String username, String password) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.civilizedcodes.in/p/logintest.html");
		
		driver.findElement(By.id("username")).sendKeys(username);
		
	
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
