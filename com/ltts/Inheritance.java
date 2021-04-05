package com.ltts;


public class Inheritance {

	public static void main(String args[])
	{
		Sub obj = new Sub();
		obj.getInfo();
	}
}

class Super
{
	public int age = 20;
}
class Sub extends Super
{
	void getInfo()
	{
		System.out.println(age);
	}
}