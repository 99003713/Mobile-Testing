package com.ltts;

public class Employee implements Comparable<Employee>{

	int salary;
	String name;
	public Employee(String name, int salary)
	{
		super();
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", salary=" + salary + "] ";
	}

	@Override
	public int compareTo(Employee obj) {
		if(this.salary > obj.salary) return -1;
		else if(this.salary < obj.salary) return 1;
		return 0;
		
	}
	

}
