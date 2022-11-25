package com.example.demo.dto;

import javax.persistence.Column;

public class ManagerDto 
{
	@Column(name="manager_id")
	private Integer managerId;
	@Column(name="manager_name")
	private String managerName;
	@Column(name="designation")
	private String designation;
	@Column(name="salary")
	private String salary;

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getdesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	
	
	
}
