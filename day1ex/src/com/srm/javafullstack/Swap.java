package com.srm.javafullstack;

import java.util.Scanner;

public class Swap {
	public Swap(int a,int b)
	{
		
			int sum=a+b;
			a=sum-a;
			b=sum-a;
			System.out.println("The value of n1 after swap : "+a);
	        System.out.println("The value of n2 after swap : "+b);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Enter the numbers...");
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("SWAPPING OF 2 NOS:");
        System.out.println("The value of n1 before swap : "+n1);
        System.out.println("The value of n2 before swap : "+n2);
 
        if((n1>0 || n1<0) && (n2<0 || n2>0))
        {
        	Swap sw=new Swap(n1,n2); 
        }
        //int sum= n1+n2;
        
	    }
		catch (Exception e)
		{
			System.out.println(" Please enter a valid number...");
		}
	}
}
