package com.ltts;
import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("om",25000));
		emp.add(new Employee("ajay",20000));
		emp.add(new Employee("raj",30000));
		emp.add(new Employee("kumar",15000));
		emp.add(new Employee("yogesh",40000));
		
		
		Collections.sort(emp);
		
		emp.forEach(System.out::println);
	}

}
