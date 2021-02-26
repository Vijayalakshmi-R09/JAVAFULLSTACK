package com.srm.javafullstack.collections;

import java.util.Comparator;

public class sortByAge implements Comparator<Customer>
{

@Override
public int compare(Customer o1, Customer o2) {
	String a1=String.valueOf(o1.getAge());
	String a2=String.valueOf(o2.getAge());
	int es=a1.compareTo(a2);
	return es;
}
}
