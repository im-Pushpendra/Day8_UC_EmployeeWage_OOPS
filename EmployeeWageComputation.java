package com.bridgelabz.day8.UC_EmployeeWage_OOPS;

import java.util.*;
public class EmployeeWageComputation {
	
	public static final int halfDayHours = 4;
	public static final int fullDayHours = 8;

	private final String companyName;
	private final int empWagePerHour;
	private final int workingHours;
	private final int workingDays;

	static Random random = new Random();

	public EmployeeWageComputation(String companyName, int empWagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workingDays = workingDays;
		this.workingHours = workingHours;
	}

	public int calculateWage() {
		int salary = 0;
		int totalSalary = 0;
		int totalWorkingHours = 0;
		int days = 0;

		while (totalWorkingHours <= workingHours && days <= workingDays) {
			days++;

			int empCheck = random.nextInt(3);

			switch (empCheck) {
			case 1:
				
				 System.out.println("Present Fullday.");
				 salary = empWagePerHour * fullDayHours;
				 totalWorkingHours = totalWorkingHours + fullDayHours;
				break;
			case 2:
				
				 System.out.println("Present HalfDay.");
				 salary = empWagePerHour * halfDayHours;
				 totalWorkingHours = totalWorkingHours + halfDayHours;
				break;
			default:
				System.out.println("Employee Abscent");
			}
			
			System.out.print("Day: "+days+"\t random: "+empCheck+"\t");
			System.out.print("Working Hours: "+totalWorkingHours+"\t");
			System.out.print("\tSalary is: "+salary+"\t");
			totalSalary = totalSalary + salary;
			
		}
		
		return totalWorkingHours * empWagePerHour;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		EmployeeWageComputation dmart = new EmployeeWageComputation("Dmart", 23, 90, 21);
		EmployeeWageComputation walmart = new EmployeeWageComputation("Walmart", 24, 109, 22);
		 
		 
		 System.out.println("Total employee's wage of Company: " + dmart.companyName + ": " + dmart.calculateWage());
		 System.out.println("Total employee's wage of Company: " + walmart.companyName + ": " + walmart.calculateWage());

	}

}
