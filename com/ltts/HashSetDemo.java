package com.ltts;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet mylist=new HashSet();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(10);
		mylist.add(null);
	
		System.out.println(mylist);
		
	}

}
