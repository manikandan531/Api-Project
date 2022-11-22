package com.college.staffDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.Achievement;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
import com.college.staffDetails.entity.Staff;
import com.college.staffDetails.service.StaffService;

@RestController
@RequestMapping("/StaffDetails")
public class AppController {

	@Autowired
	private StaffService staffservice;
	
	@GetMapping("/getDepartment")
	public Department fetchingDepartment(StaffDto staffdto)
	{
		return staffservice.fetchingDepartment(staffdto.getDepartmentId());
	}
	
	@GetMapping("/getStaffDetails")	
	public List<Staff> fetchStaffDetails()
	{
		return staffservice.fetchStaffDetails();
	}
	
	@PostMapping("/saveStaffDetails")
	public Staff saveStaffDetails(@RequestBody StaffDto staffdto)
	{
		return staffservice.saveStaffDetails(staffdto);
	}
	
	@PutMapping("/updateStaffDetails/{staffId}")
	public Staff updateStaffDetails(@PathVariable Integer staffId,@RequestBody StaffDto staffdto)
	{
		return staffservice.updateStaffDetails(staffId,staffdto);
	}
	
	@DeleteMapping("/deleteStaffdetails/{staffid}")
	public String deleteStaffdetails(@PathVariable Integer staffid)
	{
		staffservice.deleteStaffdetails(staffid);
		return "The Selected Rows Deleted Successfully";
	}
	
	@PutMapping("/updateEducationDetail/{eid}")
	public Education updateEducation(@PathVariable  Integer eid,Education education)
	{
		return staffservice.updateEducationDetails(eid,education);
	}
	
	@DeleteMapping("/deleteEducationDetail/{eid}")
	public String deleteEducation(@PathVariable  Integer eid)
	{
		staffservice.deleteEducationDetails(eid);
		return "Rows Deleted Successfully";
	}
	
	@PutMapping("/updateCertificationDetail/{certificateId}")
	public Certification updateCertification(@PathVariable  Integer  certificateId,Certification certification)
	{
		return staffservice.updateCertificationDetails(certificateId,certification);
	}
	
	@DeleteMapping("/deleteCertificationDetail/{certificateID}")
	public String deleteCertification(@PathVariable  Integer certificateId)
	{
		staffservice.deleteCertificationDetails(certificateId);
		return "Rows Deleted Successfully";
	}
	
	@PutMapping("/updateEmploymentDetails/{hid}")
	public EmploymentHistory updateEmploymentHistoryDetails(@PathVariable  Integer hid,EmploymentHistory history)
	{
		return staffservice.updateEmploymentHistoryDetails(hid, history);
	}
	
	@DeleteMapping("/deleteEmploymenthistoryDetail/{hid}")
	public String deleteEmploymentHistoryDetails(@PathVariable  Integer hid)
	{
		staffservice.deleteEmploymentHistoryDetails(hid);
		return "Rows Deleted Succesfully";
	}
	
	@PutMapping("/updateAchievementDetail/{achieveId}")
	public Achievement updateAchievement(@PathVariable  Integer achieveId,Achievement achievement)
	{
		return staffservice.updateAchievementDetails(achieveId,achievement);
	}
	
	@DeleteMapping("/deleteAchievementDetail/{achieveId}")
	public String deleteAchievement(@PathVariable  Integer achieveId)
	{
		staffservice.deleteAchievementDetails(achieveId);
		return "Rows deleted Successfully";
	}
}