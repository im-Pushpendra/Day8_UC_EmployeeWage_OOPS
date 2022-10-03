package com.bridgelabz.day8.UC_EmployeeWage_OOPS;

import java.util.*;
public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		
		int wagePH = 20;
		int FulldayH = 8;
		int ParttimedayH = 4;
		int days = 0;
		int hours = 0;
		int workinghours = 0;
		int salary = 0;
		int Monthly_salary = 0;
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

}
