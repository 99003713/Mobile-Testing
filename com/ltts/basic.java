package com.ltts;
import java.util.Scanner;

public class basic {
	static int  checkLeapYear(int year) {
		if(year >= 0)
		{
		if(year%400 == 0)
		{
			return 1;
		}
		else if(year%100 == 0)
		{
			return 0;
		}
		else if(year%4 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		}
		else
		{
			return -1;
		}
		
	}
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int value = checkLeapYear(year);
		if(value == 1)
			System.out.println("Yes");
		else if(value == 0)
			System.out.println("No");
		else
			System.out.println("Invalid Value");
		
	}

}
