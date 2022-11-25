package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Manager
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="manager_id")
	private Integer managerId;
	@Column(name="manager_name")
	private String managerName;
	@Column(name="designation")
	private String designation;
	@Column(name="salary")
	private String salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Employee employee;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<SalesboyOrSalesgirl> getSalesboyorsalesgirl() {
		return salesboyorsalesgirl;
	}

	public void setSalesboyorsalesgirl(List<SalesboyOrSalesgirl> salesboyorsalesgirl) {
		this.salesboyorsalesgirl = salesboyorsalesgirl;
	}

	
}
