package com.bridgelabz.day8.UC_EmployeeWage_OOPS;

import java.util.*;
public class EmployeeWageComputation {
	
	static int wagePH = 20;
	static int FulldayH = 8;
	static int ParttimedayH = 4;
	static int days = 0;
	static int hours = 0;
	static int workinghours = 0;
	static int salary = 0;
	static int Monthly_salary = 0;
	
	static void ComputeEmpWage() {
		Random random = new Random();
	while(days != 20 && workinghours<100) {
		days++;
		int a = random.nextInt(3);
	switch(a) {
	case 0: System.out.println("Employee is Absent\nPer day Wage is: 0");
	break;
	case 1: salary = wagePH*FulldayH;
	hours = FulldayH;
		System.out.println("Employee is Present Fullday\nPer day Wage is: "+salary);
	break;
	case 2: salary = wagePH*ParttimedayH;
	hours = ParttimedayH;
		System.out.println("Employee is Present Halfday\nPer day Wage is: "+salary);
	break;
	}
	System.out.println();
	Monthly_salary += salary;
	workinghours += hours;
	}
	System.out.println();
	System.out.println("Employee's total number of working days: "+days);
	System.out.println();
	System.out.println("Employee's total number of working hours: "+workinghours);
	System.out.println();
	System.out.println("Employee's Monthly Salary is: "+Monthly_salary);
	}
	void displaySalary() {
		System.out.println("Total Salary: "+Monthly_salary);
		}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		EmployeeWageComputation ewc = new EmployeeWageComputation();
		EmployeeWageComputation.ComputeEmpWage();
		ewc.displaySalary();
		

	}

}
