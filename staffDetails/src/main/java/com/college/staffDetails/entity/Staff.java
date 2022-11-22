package com.college.staffDetails.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer staffId;
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String bloodGroup;
	private String exInYears;
	private String mobile;
	private String address;
	private String currentDesi;
	
	@OneToOne
	@JoinColumn
	private Department department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Education> education;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Certification> certificate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<EmploymentHistory> history;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Achievement> achievement;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getExInYears() {
		return exInYears;
	}

	public void setExInYears(String exInYears) {
		this.exInYears = exInYears;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCurrentDesi() {
		return currentDesi;
	}

	public void setCurrentDesi(String currentDesi) {
		this.currentDesi = currentDesi;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Certification> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Certification> certificate) {
		this.certificate = certificate;
	}

	public List<EmploymentHistory> getHistory() {
		return history;
	}

	public void setHistory(List<EmploymentHistory> history) {
		this.history = history;
	}

	public List<Achievement> getAchievement() {
		return achievement;
	}

	public void setAchievement(List<Achievement> achievement) {
		this.achievement = achievement;
	}

	public Staff(Integer staffId, String firstName, String lastName, String dateOfBirth, String bloodGroup,
			String exInYears, String mobile, String address, String currentDesi, Department department,
			List<Education> education, List<Certification> certificate, List<EmploymentHistory> history,
			List<Achievement> achievement) {
		super();
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.exInYears = exInYears;
		this.mobile = mobile;
		this.address = address;
		this.currentDesi = currentDesi;
		this.department = department;
		this.education = education;
		this.certificate = certificate;
		this.history = history;
		this.achievement = achievement;
	}

	public Staff() {
		super();
	}
	
	
	
	
	
}
