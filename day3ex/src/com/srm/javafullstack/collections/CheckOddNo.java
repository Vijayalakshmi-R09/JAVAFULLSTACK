package com.srm.javafullstack.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOddNo 
{
	public void oddArrayList(ArrayList<Integer> olist)
	{
		int flag=0;
		for(int i=0;i<olist.size();i++)
		{
			int num=olist.get(i);
			if(num%2!=0)
			{
				flag=1;
			}
			else
			{
				flag=0;
			}	
		}
	if(flag==1){
			System.out.println("\nList contains ODD numbers...");
		}else {System.out.println("\nList does not contain ODD numbers...");}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\tCheck List of Integers as Odd number or not\n");
		System.out.println("Enter the list size: ");
		int size=sc.nextInt();
		ArrayList<Integer> inputs=new ArrayList<>();
		System.out.println("Enter the List values: ");
		for(int i=0;i<size;i++)
		{
			inputs.add(sc.nextInt());
		}
		System.out.println(inputs);
		new CheckOddNo().oddArrayList(inputs);
	}
}
