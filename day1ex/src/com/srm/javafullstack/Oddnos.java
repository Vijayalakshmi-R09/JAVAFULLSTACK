package com.srm.javafullstack;

import java.util.Scanner;

public class Oddnos {
	static void odd(int[] l)
	{
		int flag=0;
		for(int i=0;i<l.length;i++)
		{
			if(l[i]%2!=0)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("List contains odd numbers");
		}
		else
		{
			System.out.println("List does not contain odd numbers");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] l=new int[n];
		System.out.println("Enter the elements..");
		for(int i=0;i<n;i++)
		{
			l[i]=sc.nextInt();
		}
		System.out.print("LIST==>");
		for(int i=0;i<n;i++)
		{
			System.out.print(l[i]+" "+"\n");
		}
		Oddnos o=new Oddnos();
		o.odd(l);
	}

}
