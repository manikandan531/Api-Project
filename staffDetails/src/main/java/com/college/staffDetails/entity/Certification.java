package com.college.staffDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer certificateId;
	private String courseName;
	private String courseCompletionYear;
	private String instituteName;
	
	public Integer getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(Integer certificateId) {
		this.certificateId = certificateId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCompletionYear() {
		return courseCompletionYear;
	}
	public void setCourseCompletionYear(String courseCompletionYear) {
		this.courseCompletionYear = courseCompletionYear;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public Certification(Integer certificateId, String courseName, String courseCompletionYear, String instituteName) {
		super();
		this.certificateId = certificateId;
		this.courseName = courseName;
		this.courseCompletionYear = courseCompletionYear;
		this.instituteName = instituteName;
	}
	public Certification() {
		super();
	}
	
	
}
