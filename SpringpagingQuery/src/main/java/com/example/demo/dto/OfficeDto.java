package com.example.demo.dto;

import java.util.List;


import com.example.demo.entity.SalesboyOrSalesgirl;

public class OfficeDto 
{
	
	private Integer managerId;
	private String managerName;
	private String designation;
	private String salary;
	private Integer employeeId;
	private List<SalesboyOrSalesgirl> salesboyorsalesgirl;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public List<SalesboyOrSalesgirl> getSalesboyorsalesgirl() {
		return salesboyorsalesgirl;
	}
	public void setSalesboyorsalesgirl(List<SalesboyOrSalesgirl> salesboyorsalesgirl) {
		this.salesboyorsalesgirl = salesboyorsalesgirl;
	}

	
	
	
	
}
