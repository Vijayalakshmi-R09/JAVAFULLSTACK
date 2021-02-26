package com.srm.javafullstack;

import java.util.Scanner;

public class Stringrev {
		public void revmed(String s) {
		String rev="";
		int len=s.length();
		if(len==0) {
		System.out.println("Empty string");
		}
		else {
		for(int i=len-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
		System.out.println("Reversal of the given String : "+rev);
		}
		}

	public static void main(String[] args)
	{
		
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stringrev ob=new Stringrev();
		ob.revmed(str);

    }
}