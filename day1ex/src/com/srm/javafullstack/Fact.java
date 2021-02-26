package com.srm.javafullstack;

import java.util.Scanner;

public class Fact {
	static void facto(int n)
	{
		int fac=1;
		if(n<0)
		{
			System.out.println("Negative numbers are not allowed...");
		}
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		System.out.println("The factorial of "+ n +" is "+fac);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("FACTORIAL NUMBER...\n\n"+"Enter a number: ");
		int num=sc.nextInt();
		Fact f=new Fact();
		f.facto(num);
	}
}
