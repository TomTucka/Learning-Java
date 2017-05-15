package com.example.domain;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId, String name,String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	//not expecting a return
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		
		if (name != null && !name.equals("")) {
			this.name = name;
		}
		
	}
	
	public void rasieSalary(double incerase) {
		if (incerase > 0) {
			salary += incerase;
		}
	}
	
	public String toString() {
		return  "Employee ID: " + getEmpId() + "\n" +
				"Employee Name: " +  getName() +"\n" +
				"Employee Social Security Number: " + getSsn() + "\n" +
				"Employee Salary: " +  getSalary();
	}
}
