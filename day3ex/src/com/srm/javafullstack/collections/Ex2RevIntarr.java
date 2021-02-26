package com.srm.javafullstack.collections;

import java.util.Scanner;

public class Ex2RevIntarr 
{
	
	static void reverse(int[] a,int n)
	{
		int[] rev=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			rev[i]=a[i];
			System.out.println("The reveresd Integer Array "+rev[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the List size: ");
	    int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements..");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("LIST==> "+arr);
		reverse(arr,size);
	}
}
