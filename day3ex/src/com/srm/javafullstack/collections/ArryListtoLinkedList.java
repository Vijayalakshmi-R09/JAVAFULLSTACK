package com.srm.javafullstack.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArryListtoLinkedList {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> linkedlist = new LinkedList<String>();
		System.out.println("Convery LinkedList<->ArrayList...");
		System.out.println("\nEnter the size of linkedlist: ");
		int size=sc.nextInt();
		System.out.println("\nEnter the elements...");
		for(int i=0;i<size;i++)
		{
			linkedlist.add(sc.next());
		}
		List<String> list = new ArrayList<String>(linkedlist);
	  
	    System.out.println("ArrayList :"+list);
	}
}
