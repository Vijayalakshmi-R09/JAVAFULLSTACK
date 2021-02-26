package com.srm.javafullstack;

import java.util.Scanner;

public class Whitespace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string.... ");
		String r=sc.nextLine();
		String trim=r.replaceAll("\\s", "");
		System.out.println("The string after remove whitspaces..."+trim);
	}
}
