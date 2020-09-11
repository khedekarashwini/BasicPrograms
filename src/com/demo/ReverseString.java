package com.demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a stringg");
		String str=sc.next();
		revString(str);
		
	}
	
	public static void revString(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			
			System.out.println(ch[i]);
		}
		
	}

}
