package com.srm.javafullstacklamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LamdaExp 
{
	public void oddArrayList(ArrayList<Integer> larray)
	{
		int counter=0;
		for(int i=0;i<larray.size();i++)
		{
			int num=larray.get(i);
			if(num%2!=0)
			{
				counter++;
			}
		}	
	if(counter>=1)
	{
		System.out.println("\nArrayList contains " + counter +" ODD numbers...");
	}
	else 
	{
		System.out.println("\nArrayList contains no ODD numbers...");
	}
    }

	public static void main(String[] args) 
	{
		ArrayList<Integer> lamdaarray = new ArrayList<Integer>();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of ArrayList : ");
	    int num=sc.nextInt();
	    System.out.println("Enter the values : ");
	    for(int i=0;i<num;i++)
	    {
	    	  lamdaarray.add(sc.nextInt());
	    }
	    System.out.println("The ArrayList : ");
	    lamdaarray.forEach(n -> System.out.println(n)); 
	    new LamdaExp().oddArrayList(lamdaarray);     
	}
}

