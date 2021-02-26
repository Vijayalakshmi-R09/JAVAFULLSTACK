package com.srm.javafullstack.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Customer
{

	String fName,lName,email;
	int age;
	public Customer(String fName, String lName, String email, int age)
	{
		this.fName=fName;
		this.lName=lName;
		this.email=email;
		this.age=age;
	}
	public String toString()
	{
	return fName+" "+lName+" "+email+" "+age;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class SortArrayList 
{
	public static void sortData(ArrayList arrsort)
	{
		Collections.sort(arrsort,new sortByFirstName().thenComparing(new sortByAge()).reversed());
		System.out.println(arrsort);
	}
				
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\tSort ArrayList t\n");
		System.out.println("Enter the Arraylist size: ");
		int size=sc.nextInt();
		ArrayList customer=new ArrayList();
		System.out.println("Enter the ArrayList values: ");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter First Name:");
			String FName=sc.next();
			System.out.println("Enter Last Name:");
			String LName=sc.next();
			System.out.println("Enter Email:");
			String Email=sc.next();
			System.out.println("Enter Age:");
			int Age=sc.nextInt();
			customer.add(new Customer(FName,LName,Email,Age));
		}
		sortData(customer);
	}
}

	


