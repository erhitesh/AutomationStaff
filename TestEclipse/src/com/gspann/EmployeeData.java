package com.gspann;

public class EmployeeData {

	// Global Variable Declaration.
	String name, phone, address, subject;
	int salary, tax;

	void input(String name, String phone, String address, String subject, int salary) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.subject = subject;
		this.salary = salary;
	}

	void compute() {
		if (salary * 12 > 175000)
			tax = (salary * 12) - 175000 * 5 / 100;
	}

	void display() {
		System.out.println("Employee Name.."+name);
		System.out.println("Employee Phone Number.."+phone);
		System.out.println("Employee address.."+address);
		System.out.println("Employee Subject.."+subject);
		System.out.println("Employee Salary.."+salary);
	}

	public static void main(String args[]) {
		EmployeeData obj = new EmployeeData();
		obj.input("Tarun", "9876543210", "mahanagar", "history", 10000);
		obj.compute();
		obj.display();
	}
}
