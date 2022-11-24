package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity


public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String name;
	private Integer age;
	private Boolean active;
	@Column(name="PHONE_NUMBER")
	private Long phoneNumber=(long) (Math.random()*Math.pow(10,10));
	private String designation;
	private Double salary=Math.random()*100000;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Employee(Long empId, String name, Integer age, Boolean active, Long phoneNumber, String designation,
			Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.active = active;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}
}	