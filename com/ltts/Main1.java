package com.ltts;
import java.util.Scanner;

class Vehicle
{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;

	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
		   this.make = make;
		   this.vehicleNumber = vehicleNumber;
		   this.fuelType = fuelType;
		   this.fuelCapacity = fuelCapacity;
		   this.cc = cc;
	}


	void displayMake()
	{
		System.out.println("***" + make + "***");
	}

	void displayBasicInfo()
	{
		System.out.println("---Basic Information--");
		System.out.println("Vehicle Number:" + vehicleNumber);
		System.out.println("Fuel Capacity:" + fuelCapacity);
		System.out.println("Fuel Type:" + fuelType);
		System.out.println("CC:"+ cc);


	}
	void displayDetailInfo()
	{

    }
}



class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;

	public TwoWheeler(String maker, String number, String fuel, int capacity, int cc, boolean kick)
	{
		super(maker, number, fuel, capacity, cc);
		this.kickStartAvailable = kick;
	}


	@Override
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information--");
		System.out.println("Kick Start Available:" + kickStartAvailable);

	}

}




class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int numberOfDoors;
	
	public FourWheeler(String maker, String number, String fuel, int capacity, int cc, String audioSystem,
			int numberofDoors) 
	{
		
		super(maker, number, fuel, capacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberofDoors;
		
	}


	@Override
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information--");
		System.out.println("Audio System:" + audioSystem);
		System.out.println("Number of Doors:" + numberOfDoors);

	}
}



public class Main1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("1. FourWheeler");
		System.out.println("2. TwoWheeler");
		System.out.println("Enter Vehicle Type");
		int type = sc.nextInt();

		   System.out.println("Vehicle Make:");
		   String maker = sc.next();

		   System.out.println("Vehicle Number:");
		   String number = sc.next();

		   System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
		   String fuel = "fuel_type";
		   int n = sc.nextInt();
		   if(n == 1)
		   fuel = "Petrol";
		   else if(n == 2)
		   fuel = "Diesel";
		   else
		    System.out.println("Entered wrong number");	   

		   System.out.println("Fuel Capacity:");
		   int capacity = sc.nextInt();

		   System.out.println("Engine CC:");
		   int cc = sc.nextInt();


		if(type == 1)
		{
			 System.out.println("Audio System:");
			  String audioSystem = sc.next();
			   
			  System.out.println("Number of Doors:");
			  int numberofDoors = sc.nextInt();
			  
			  FourWheeler obj1 = new FourWheeler(maker, number, fuel, capacity, cc, audioSystem, numberofDoors);

              obj1.displayMake();
              obj1.displayBasicInfo();
              obj1.displayDetailInfo();

		}
		else if(type == 2)
		{
			System.out.println("Kick Start Available(true/false):");
	        boolean kick = sc.nextBoolean();
			  
			TwoWheeler obj2 = new TwoWheeler(maker, number, fuel, capacity, cc, kick);
			
			obj2.displayMake();
			obj2.displayBasicInfo();
			obj2.displayDetailInfo();
			
		}
		else
		{
			System.out.println("Choose Available option only.");
		}


	}
}