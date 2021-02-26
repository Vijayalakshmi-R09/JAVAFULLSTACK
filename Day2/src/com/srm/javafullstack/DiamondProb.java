package com.srm.javafullstack;

import java.util.Scanner;

public class DiamondProb implements ImplManager {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("SIMPLE AND COMPOUND INTEREST CALCULATION");
		System.out.println("PRINCIPLE: ");
		double p=sc.nextDouble();
		System.out.println("NO.OF.YEARS: ");
		double n=sc.nextDouble();
		System.out.println("RATE OF INTEREST: ");
		double r=sc.nextDouble();
		DiamondProb d=new DiamondProb();
		
        System.out.println("SIMPLE INTEREST AMOUNT: "+d.sicalc(p, n, r));
        
        System.out.println("COMPOUND INTEREST AMOUNT: "+d.cicalc(p, n, r));
	}

	@Override
	public double cicalc(double p,double n,double r)
	{
		double ci=0;
		double a=1+r/100;
		ci=p*(Math.pow(a,n));
		return ci;
	}

	@Override
	public double sicalc(double p,double n,double r)
	{
		double si=0;
		si=(p*n*r)/100;
		return si;
	}
}

