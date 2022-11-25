package com.example.demo.dto;

import javax.persistence.Column;

public class ManagerNameSalary
{
	@Column(name="manager_name")
	private String managerName;
	@Column(name="salary")
	private String salary;
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public ManagerNameSalary(String managerName, String salary) {
		super();
		this.managerName = managerName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ManagerNameSalary [managerName=" + managerName + ", salary=" + salary + "]";
	}
	
	
	
	
}
