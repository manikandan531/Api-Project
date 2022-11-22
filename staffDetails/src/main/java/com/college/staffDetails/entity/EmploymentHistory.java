package com.college.staffDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmploymentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hid;
	private String companyName;
	private String salary;
	
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public EmploymentHistory(Integer hid, String companyName, String salary) {
		super();
		this.hid = hid;
		this.companyName = companyName;
		this.salary = salary;
	}
	public EmploymentHistory() {
		super();
	}
	
	
}
