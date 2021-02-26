package com.srm.javafullstack.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FliterArrCus {
		static void filterData(ArrayList alist,String Fname,int Age,List<CusDataFilter> obj)
	    {
	        for(CusDataFilter cdf:obj)
	        {
	        	if(cdf.getName().equals(Fname)&&cdf.getAge()==Age)
	        	{
	        		System.out.println("Available Records : "+"\n");
	        		System.out.println("FirstName"+" "+"LastName"+" "+"Email"+" "+"Age");
	        		System.out.println(cdf);
	        	}
	        }
	    }

		public static void main(String[] args) {
			String Fname,Lname,Email;
		    int Age;
		    System.out.println("Enter the no of records : ");
		    Scanner sc=new Scanner(System.in);
		    int Num=sc.nextInt();
		    ArrayList arrList=new ArrayList();
		    List<CusDataFilter> obj=new ArrayList<CusDataFilter>();
		   
		    CusDataFilter[] cdf=new CusDataFilter[Num];
		    for(int i=0;i<Num;i++)
		    {
		    	System.out.println("Enter FirstName : ");
		    	Fname=sc.next();
		    	System.out.println("Enter LastName : ");
		    	Lname=sc.next();
		    	System.out.println("Enter Email : ");
		    	Email=sc.next();
		    	System.out.println("Enter Age : ");
		    	Age=sc.nextInt();
		    	cdf[i]=new CusDataFilter(Fname, Lname, Email, Age);
		    	arrList.add(cdf[i]);
		    }
		    List<CusDataFilter> cuslist=new ArrayList<CusDataFilter>();
		    cuslist.addAll(arrList);
		    System.out.println("Enter FirstName : ");
		    Fname=sc.next();
		    System.out.println("Enter Age : ");
		    Age=sc.nextInt();
		    filterData(arrList,Fname,Age,cuslist);
			}

	}
