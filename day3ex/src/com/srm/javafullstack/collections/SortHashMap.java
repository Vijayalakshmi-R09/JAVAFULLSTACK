package com.srm.javafullstack.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SortHashMap {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\tSort HashMap\n");
		System.out.println("Enter no.of Elements: ");
		int size=sc.nextInt();
		LinkedHashMap lm=new LinkedHashMap();
		for(int i=0;i<size;i++)
		{
			 System.out.println("Enter key:");
			 Integer a = sc.nextInt();
			 System.out.println("Enter value:");
	         String b = sc.next();
	         lm.put(a, b);
		}
	    System.out.println(" Before Sort: "+lm);
	    HashMap hm=new HashMap();
	    hm.putAll(lm);
	    System.out.println("After sorting: "+hm);
    }

}
