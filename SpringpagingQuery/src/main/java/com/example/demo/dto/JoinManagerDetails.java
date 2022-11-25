package com.example.demo.dto;

import javax.persistence.Column;

public class JoinManagerDetails 
{
	
	@Column(name="manager_name")
	private String managerName;
	@Column(name="designation")
	private String designation;
	@Column(name="name")
	private String name;
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public JoinManagerDetails(String managerName, String designation, String name) {
		super();
		this.managerName = managerName;
		designation = designation;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "JoinManagerDetails [managerName=" + managerName + ", designation=" + designation + ", name=" + name
				+ "]";
	}
	
	
	
	
	
	
}
