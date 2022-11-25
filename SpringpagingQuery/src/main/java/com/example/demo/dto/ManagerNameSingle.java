package com.example.demo.dto;

import javax.persistence.Column;

public class ManagerNameSingle
{
	@Column(name="manager_name")
	private String manager_Name;
	@Column(name="name")
	private String name;
	@Column(name="designation")
	private String designation;
	
	public String getManager_name() {
		return manager_Name;
	}
	public void setManager_name(String manager_name) {
		this.manager_Name = manager_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
