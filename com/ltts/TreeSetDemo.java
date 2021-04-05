
package com.ltts;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet mylist=new TreeSet();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(10);
//		mylist.add(null);
		mylist.add(15);
	
		System.out.println(mylist);   // assending order
		
	}

}