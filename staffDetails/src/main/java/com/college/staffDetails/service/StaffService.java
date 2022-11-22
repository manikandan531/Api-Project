package com.college.staffDetails.service;

import java.util.List;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.Achievement;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
import com.college.staffDetails.entity.Staff;

public interface StaffService {

	public Department fetchingDepartment(Integer departmentId);

	public Staff saveStaffDetails(StaffDto staffdto);

	public Staff updateStaffDetails(Integer staffid, StaffDto staffdto);

	public List<Staff> fetchStaffDetails();

	public void deleteStaffdetails(Integer staffid);
	


	public Education updateEducationDetails(Integer eid, Education education);

	public void deleteEducationDetails(Integer eid);

	public EmploymentHistory updateEmploymentHistoryDetails(Integer hid, EmploymentHistory history);

	public void deleteEmploymentHistoryDetails(Integer hid);


	public Certification updateCertificationDetails(Integer certificateid, Certification certification);

	public void deleteCertificationDetails(Integer certificateId);

	public Achievement updateAchievementDetails(Integer achieveId, Achievement achievement);

	public void deleteAchievementDetails(Integer achieveId);

}	

