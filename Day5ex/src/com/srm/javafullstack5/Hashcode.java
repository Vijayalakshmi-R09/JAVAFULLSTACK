package com.srm.javafullstack5;

import java.io.File;

public class Hashcode
{
	public static void main(String[] args) 
	{
		  File  fileobj  = null;
	      int code;
	      boolean b = false;
	      System.out.println("Generate Hash Code for the File\n");
	      try
	      {
	    	 fileobj = new File("E:\\Vijayalakshmi I0025\\Viji.txt");
	         code =  fileobj .hashCode();
	         b =  fileobj .exists();
	         if(b)
	         {
	        	 System.out.println("HASH CODE: " +code);
	         }  
	      } 
	      catch(Exception e) 
	      {
	         System.out.println("File doesnot Exist!");
	      }
	 }
}