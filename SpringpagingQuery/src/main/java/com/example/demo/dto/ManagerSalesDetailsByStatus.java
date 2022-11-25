package com.example.demo.dto;

import javax.persistence.Column;

public class ManagerSalesDetailsByStatus 
{
	@Column(name="manager_name")
	private String managerName;
	@Column(name="name")
	private String name;
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
