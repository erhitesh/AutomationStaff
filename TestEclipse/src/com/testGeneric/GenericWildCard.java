package com.testGeneric;

public class GenericWildCard {

	public static void main(String args[]) {
		MyEmpUtil<CompAEmp> empA = new MyEmpUtil<CompAEmp>(new CompAEmp("Hitesh", 1234));
		MyEmpUtil<CompBEmp> empB = new MyEmpUtil<CompBEmp>(new CompBEmp("Harsh", 5555));
		MyEmpUtil<CompCEmp> empC = new MyEmpUtil<CompCEmp>(new CompCEmp("Rakesh", 1234));
		System.out.println("Is salary same? "+empA.isSalaryEqual(empB));
		System.out.println("Is salary same? "+empA.isSalaryEqual(empC));
	}
}

class MyEmpUtil<T extends Emp> {
	private T obj;
	MyEmpUtil(T obj) {
		this.obj = obj;
	}
	
	public int getSalary() {
		return obj.getSalary();
		
	}
	
	public boolean isSalaryEqual(MyEmpUtil<?> otherEmp){
		if (obj.getSalary() == otherEmp.getSalary())
			return true;
		return false;
	}
}

class Emp {
	
	private String name;
	private int salary;

	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class CompAEmp extends Emp {

	public CompAEmp(String name, int salary) {
		super(name, salary);
	}

}

class CompBEmp extends Emp {

	public CompBEmp(String name, int salary) {
		super(name, salary);
	}
}

class CompCEmp extends Emp {

	public CompCEmp(String name, int salary) {
		super(name, salary);
	}

}