package org.sample;

public class Company {

	public void compId() {
		System.out.println("12345678");
	}

	public void compName() {
		System.out.println("Hexaware");
	}

	public static void main(String[] args) {
		Company c = new Company();

		c.compId();
		c.compName();
		Employee e = new Employee();
		e.empId();
		e.empName();

	}
}
