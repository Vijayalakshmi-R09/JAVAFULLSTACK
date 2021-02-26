package com.srm.javafullstack.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3RevIntArray 
{

	public void reverseArrayList(ArrayList<Integer> alist) 
    { 
        //ArrayList<Integer> revArrayList = new ArrayList<Integer>(); 
        Collections.reverse(alist);
        System.out.println("The reveresed List "+alist);
    } 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\tREVERSAL OF INTEGER ARRAY\n");
		System.out.println("Enter the list size: ");
		int size=sc.nextInt();
		ArrayList<Integer> inputs=new ArrayList<>();
		System.out.println("Enter the List values: ");
		for(int i=0;i<size;i++)
		{
			inputs.add(sc.nextInt());
		}
		System.out.println("Given List of Integers-->"+inputs+"\n");
        new Ex3RevIntArray().reverseArrayList(inputs);
	}

}
