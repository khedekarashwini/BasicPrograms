package com.demo;

import java.util.Scanner;

public class PrimeNO {
	
	public static  void primeNo( int no)
	{
		int temp;
		boolean isprime=true;
		for (int i = 2; i<=no/2; i++) {
			
			temp=no%i;
			if(temp==0)
			{
				isprime=false;
				break;
			}
			
		}
		
		if(isprime)
		{
			System.out.println("No is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter no");
		     int no=sc.nextInt();
		     
		     primeNo(no);
		     
		
	}

}
