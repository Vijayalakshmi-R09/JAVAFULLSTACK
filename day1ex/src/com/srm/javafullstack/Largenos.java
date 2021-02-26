package com.srm.javafullstack;

import java.util.Scanner;

public class Largenos {
	private void find(int[] l)
	{
		int s=0;
		for(int i=0;i<l.length;i++)
		{
			for(int j=i+1;j<l.length;j++) 
			{
				if(l[i]>l[j])
				{
					s=l[i];
					l[i]=l[j];
					l[j]=s;
				}
			}
		}
		System.out.println("The Second Largest number is "+l[l.length-2]);
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
		System.out.print("LIST of values==>");
		for(int i=0;i<n;i++)
		{
			System.out.print(l[i]+" ");
		}
		System.out.println();
		Largenos a=new Largenos();
		a.find(l);

	}

}
