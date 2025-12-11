package com.testng.day1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {

	WebDriver driver = new ChromeDriver();
	TakesScreenshot pic = (TakesScreenshot)driver;

	
	@Test(invocationCount = 1)
	
	public void Login()  {
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.civilizedcodes.in/p/logintest.html");
		driver.findElement(By.id("username")).sendKeys("testuser");
		driver.findElement(By.name("password")).sendKeys("pass123");
		WebElement button = driver.findElement(By.id("login-btn"));
		button.click();
		File sourcefile = pic.getScreenshotAs(OutputType.FILE);
		//File target = new File("C:\\Users\\prave\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\login.png");
		 File target = new File(System.getProperty("user.dir")+"\\ScreenShot\\img1.png");
		 sourcefile.renameTo(target);
		 System.out.println("Login Test Success and image caputured");
		 System.out.println("Running next test on: " + driver.getCurrentUrl());
		
	}
	@Test(dependsOnMethods ="Login",enabled=true)
	public void SimpleAlert() throws InterruptedException {
		driver.getCurrentUrl();
		 System.out.println("Running test on: " + driver.getCurrentUrl());
		 WebElement element = driver.findElement(By.id("simpleAlertBtn"));
		 element.click();
		 driver.switchTo().alert().accept();
		 File sourcefile = pic.getScreenshotAs(OutputType.FILE);
	        File target = new File(System.getProperty("user.dir")+"\\ScreenShot\\alertHandled.png");
	        sourcefile.renameTo(target);
	        
	        System.out.println("Alert Screenshot captured successfully");
		 driver.quit();
		 
	}
	
}
