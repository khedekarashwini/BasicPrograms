package com.demo;

import java.util.Scanner;

public class ReverseNo {
	public static void reverseNo( int no)
	{
		 int revno=0;
		 while(no!=0)
		 {
			 revno=revno*10;
			 revno=revno+no%10;
			 no=no/10;
			 
			 
		 }
		 System.out.println("Reverse No is....."+revno);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no...");
		int no=sc.nextInt();
		reverseNo(no);

	}

}
