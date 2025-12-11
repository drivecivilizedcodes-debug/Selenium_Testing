package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTest {
	
	@DataProvider(name="Login")
	
	public String[][] getdata(){
		
		String[][] data = new String[2][2];
		
		data[0][0]= "admin";
		data[0][1]= "pass123";
		
		data[1][0]= "testuser";
		data[1][1]= "pass123";
		return data;
		
	}
	
	@Test(dataProvider = "Login")
	  
	public void Login(String email, String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.civilizedcodes.in/p/logintest.html");
		
		driver.findElement(By.id("username")).sendKeys(email);
		
	
		driver.findElement(By.id("password")).sendKeys(pass);
		
		Thread.sleep(2000);
		System.out.println("Login done");
		driver.close();
		
	}
}
