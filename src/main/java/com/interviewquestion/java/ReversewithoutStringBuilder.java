package com.interviewquestion.java;

public class ReversewithoutStringBuilder {
	
	public static void main(String[]args) {
		
		String text = "Automation Testing";
		String rev = "";
		
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);
		}
		System.out.println(rev);
	}

}
