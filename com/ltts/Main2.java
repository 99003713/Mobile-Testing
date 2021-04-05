package com.ltts;
import java.util.Scanner;

class HotelRoom
{

	protected String hotelNmae;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
	{
		this.hotelNmae = hotelName;
	    this.numberOfSqFeet = numberOfSqFeet;
	    this.hasTV = hasTV;
	    this.hasWifi = hasWifi;
	}
	
	public int calculateTariff()
	{
		return 0;
	}
	public int getRatePerSqFeet()
	{
		return 0;
	}
	
}

class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 10;
		
		
	     
	}
	
	@Override
	public int getRatePerSqFeet()
	{
		if(this.hasWifi == true)
		{
			return (ratePerSqFeet + 2);
		}
		else
		{
			return ratePerSqFeet;
		}
	}
}


class DeluxeACRoom extends DeluxeRoom
{
	protected int ratePerSqFeet;
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = 12;
	}
	
	@Override
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}


}

class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;

	
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}	
	
	@Override
	public int getRatePerSqFeet() {
		if(this.hasWifi == true) {
			return ratePerSqFeet+2;
		} else {
			return ratePerSqFeet;
		}	
	}
}



public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		int n = sc.nextInt();
		System.out.println("Hotel Name:");
		String name = sc.next();
		System.out.println("Room Square Feet Area:");
		int Area = sc.nextInt();
		System.out.println("Room has TV (yes/no):");
		boolean tv = sc.nextBoolean();
		System.out.println("Room has Wifi (yes/no:");
		boolean wifi = sc.nextBoolean();
		
		
		
	}

}
