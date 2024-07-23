package com.java.practice.day_2;

public class EmployeeImpl implements Employee {

	@Override
	public void populate() {
		System.out.println("Populate the INfo");
	}

	public void display() {
		Employee.super.display();
		Employee.super.process();

	}

	public static void main(String[] args) {
		EmployeeImpl employeeImpl = new EmployeeImpl();
		employeeImpl.display();
		employeeImpl.populate();
	}

}
