package com.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AlertsTest {
	
	@Test

	public void main() throws InterruptedException {
		// simple alerts 
		
		
		
		WebDriver driver =new ChromeDriver();

			
		driver.manage().window().maximize();
		
		driver.get("https://www.civilizedcodes.in/p/samplealerts.html");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.id("simpleAlertBtn"));
		element.click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		

		alert.accept();
		
		System.out.println("alert test is completed..");

		
		Thread.sleep(2000);

		//confirmation alert
				
		WebElement element1 = driver.findElement(By.xpath("//button[@id='confirmAlertBtn']"));
		element1.click();
				
		Thread.sleep(2000);

		alert.dismiss();
		
		System.out.println("Confirmation test is completed..");

		
		 Thread.sleep(2000);
		
		
		driver.quit();
		

	}

}
