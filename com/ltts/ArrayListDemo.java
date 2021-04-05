package com.ltts;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
	
		System.out.println(mylist.get(0));
		
		ArrayList mylist2=new ArrayList();
		mylist2.add(40);
		System.out.println(mylist2);
		
		
		mylist2.addAll(mylist);
		
		System.out.println(mylist2);
		
		System.out.println(mylist2.contains(40));
		
		System.out.println(mylist2.isEmpty());
		
		System.out.println(mylist2.indexOf(0));  // 0 DOESN'T EXISTS IN ARRAYLIST SO IT WILL RETURN -1
		
//		Iterator i = a.iterator();
//		while(mylist.has)
	}

}
