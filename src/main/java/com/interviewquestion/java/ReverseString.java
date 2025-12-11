package com.interviewquestion.java;

public class ReverseString {

	public static void main(String[] args) {
 		
		//make the word reverse by using the stringBuilder   
		
		String str = "Automation Testing";
		
		StringBuilder Str2 = new StringBuilder();
		Str2.append(str);
	    Str2.reverse();
		System.out.println(Str2);
	}

}
