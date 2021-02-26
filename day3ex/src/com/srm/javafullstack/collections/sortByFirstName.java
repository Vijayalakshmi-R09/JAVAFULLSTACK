package com.srm.javafullstack.collections;

import java.util.Comparator;

public class sortByFirstName implements Comparator<Customer>
{
	@Override
	public int compare(Customer o3, Customer o4) {
		int res=o3.getfName().compareTo(o4.fName);
		return res;
	}
}
