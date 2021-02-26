package com.srm.javafullstack;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string...");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				flag++;
			}
		}
		if(flag>0)
		{
			System.out.println("The given string is a vowel..");
				 
		}
		else
		{
			System.out.println("The given string is not a vowel..");
		}	
	}
}
