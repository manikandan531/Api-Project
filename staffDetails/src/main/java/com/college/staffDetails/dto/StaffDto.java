package com.college.staffDetails.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.college.staffDetails.entity.Achievement;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
import com.college.staffDetails.entity.Staff;

public class StaffDto {

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String bloodGroup;
	private String exInYears;
	private String mobile;
	private String address;
	private String currentDesi;
	private Integer departmentId;

	private List<Education> education;
	
	
	private List<Certification> certificate;
	
	
	private List<EmploymentHistory> history;
	
	
	private List<Achievement> achievement;	
	
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
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public StaffDto(String firstName, String lastName, String dateOfBirth, String bloodGroup, String exInYears,
			String mobile, String address, String currentDesi, Integer departmentId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.exInYears = exInYears;
		this.mobile = mobile;
		this.address = address;
		this.currentDesi = currentDesi;
		this.departmentId = departmentId;
	}
	public StaffDto() {
		super();
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
	
	
}
