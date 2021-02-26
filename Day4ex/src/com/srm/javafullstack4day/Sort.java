package com.srm.javafullstack4day;

import java.util.Comparator;

public class Sort implements Comparator<CustomerDetails> 
{
	@Override
	public int compare(CustomerDetails o1, CustomerDetails o2) 
	{
		int val=o1.getCustomername().compareTo(o2.getCustomername());
		return val;
	}
}
