package com.bridgelabz.day8.UC_EmployeeWage_OOPS;

import java.util.*;
public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random();
		int a = random.nextInt(3);
		int wagePH = 20;
		int FulldayH = 8;
		int ParttimedayH = 4;
		switch(a) {
		case 0: System.out.println("Employee is Absent\nPer day Wage is: 0");
		break;
		case 1: System.out.println("Employee is Present\nPer day Wage is: "+(wagePH*FulldayH));
		break;
		case 2: System.out.println("Employee is Present Halfday\nPer day Wage is: "+(wagePH*ParttimedayH));
		break;
		}

	}

}
