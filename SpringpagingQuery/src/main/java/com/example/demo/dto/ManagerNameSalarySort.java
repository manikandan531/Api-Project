package com.example.demo.dto;

import javax.persistence.Column;

public class ManagerNameSalarySort 
{
	@Column(name="manager_name")
	private String managerName;
	@Column(name="name")
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
	
	
	

}
