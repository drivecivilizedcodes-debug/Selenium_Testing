package com.interviewquestion.java;

import java.util.Scanner;

public class Palindrome {
	
 public static void main(String[]args) {
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Enter the Word : ");
	 String str = scan.nextLine();
	 
	 //String str="ada";
	 String palin = new StringBuilder(str).reverse().toString();
	 
	 if(palin.equals(str)) {
		 System.out.println(str +" is Palindrome");
	 }
	 else {
		 System.out.println(str +" is not Palindrome");
	 }
 }
 

}


