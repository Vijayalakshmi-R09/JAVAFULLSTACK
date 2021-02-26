package com.srm.javafullstack;

import java.util.Scanner;

public class Prime
{
	public void isprime(int n)
	{
		boolean prime=false;
		int val=n/2;
		if(n<0) 
		{
		System.out.println("Negative Numbers not allowed");
	    }
		else if(n==0 || n==1) 
		{
		System.out.println(n + " is not a Prime Number");
		}
		else
		{
		for(int i=2;i<=val;i++) 
		{
			if(n%i==0) 
			{
				System.out.println(n + " is not a Prime Number");
				prime=true;
				break;
			}
		}
		if(prime==false)
		{
		System.out.println(n + " is a prime number");
		}
	  }
   }
public static void main(String[] args) {
System.out.println("Enter the number : ");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
Prime p=new Prime();
p.isprime(number);
}
}