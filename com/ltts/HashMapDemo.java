package com.ltts;
import java.util.HashMap;
import java.util.Map;



public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer, > h = new HashMap<Integer, >();
	h.put(1, "java");
	h.put(2, "python");
	h.put(3,10);
	h.put(4, 10.5);
	h.put(5, "java");   // duplicate value are allowed
	System.out.println(h);
	
	h.put(5, "hindi");   // now the value for key 5 is hindi
	
	System.out.println(h);
	
	System.out.println(h.entrySet());
	System.out.println(h.keySet());
	System.out.println(h.values());
	
	
	
	for(h.entry(key, value))
	{
		
	}
	
	
}
}
