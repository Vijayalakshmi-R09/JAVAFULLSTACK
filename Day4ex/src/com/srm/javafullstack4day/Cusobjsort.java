package com.srm.javafullstack4day;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CustomerDetails
{
	private String customername;
	private int custid;
	   
	public  CustomerDetails(int custid, String customername) 
	{
        this. custid =  custid;
        this.customername = customername;
	}
    public String toString() 
    {
    	return custid+ " " +customername;
    }
	public String getCustomername()
	{
	 return customername;
    }
	public void setCustomername(String customername) 
	{
		this.customername = customername;
	}
}

public class Cusobjsort 
{
	static void sortData(ArrayList al)
	{
		Collections.sort(al,new Sort());
		System.out.println(al);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String customername;
		int custid;
		System.out.println("Enter the no of elements: ");
		int n=sc.nextInt();
		ArrayList< CustomerDetails> arrlist = new ArrayList<CustomerDetails>();
		System.out.println("Enter values: ");
		for (int i=0;i<n;i++) 
		{
			System.out.println("Enter Customer ID: ");
			custid=sc.nextInt();
			System.out.println("Enter Customer Name: ");
			customername=sc.next();
			arrlist.add(new CustomerDetails(custid,customername));
		}
		System.out.println(arrlist.toString());
		sortData(arrlist);
	}
}
