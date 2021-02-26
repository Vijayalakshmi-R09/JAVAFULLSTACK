package com.srm.javafullstack.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class OrderTreeMap {

	public static void main(String[] args) 
	{
			TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
			Scanner sc=new Scanner(System.in);
			String Name;
			int Age,n;
			System.out.println("Enter no of values: ");
			n=sc.nextInt();
			System.out.println("Enter values: ");
			for (int i=0;i<n;i++) 
			{
				System.out.println("Enter Age : ");
				Age=sc.nextInt();
				System.out.println("Enter Name : ");
				Name=sc.next();
				treemap.put(Age, Name);
			}
			Set set = treemap.entrySet();
		    Iterator iterator = set.iterator();
		    while(iterator.hasNext()) 
		    {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print("key: "+ mentry.getKey() + ", Value: ");
		         System.out.println(mentry.getValue());
		    }
		    HashMap hmap=new HashMap();
			hmap.putAll(treemap);
			System.out.println("Treemap After sorting: "+hmap);	     
	}
}

