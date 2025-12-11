package com.interviewquestion.java;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[]args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int num = scan.nextInt();
			int i = 2;
			boolean ans = true;
			if(num<=1) {
				
				ans =false;
				
			}
			else
			{
			while(i <=num/2) {
				if(num%i==0) {
				 ans =false;
					break;
				}				

				i++;
			}
			
}

			if (ans) {
				System.out.println(num+" is Prime Number");
			}
			else
			{
				System.out.println(num + " is not Prime Number");
			}
		}
	}
}
