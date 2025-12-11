package com.testng.day1;


import org.testng.annotations.Test;

public class Priority {
	
	
@Test(priority=1)
public void login() {
	
	System.out.println("Login done");	
}
@Test(priority=5)
public void Logoff() {
	
	System.out.println("logoff done");
}
@Test(priority=2)
public void SearchProduct() {
	
	System.out.println("Searching product");
}
@Test(priority=3)
public void cart() {
	
	System.out.println("added to cart");

}
@Test(priority=4)
public  void buy() {
	
	System.out.println("product buy success");
}
}