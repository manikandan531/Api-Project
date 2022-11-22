package com.college.staffDetails.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.Achievement;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
import com.college.staffDetails.entity.Staff;
import com.college.staffDetails.repository.AchievementRepository;
import com.college.staffDetails.repository.CertificationRepository;
import com.college.staffDetails.repository.DepartmentRepo;
import com.college.staffDetails.repository.EducationRepository;
import com.college.staffDetails.repository.EmploymentHistoryRepository;
import com.college.staffDetails.repository.StaffRepository;

@Service
public class StaffServiceImplement implements StaffService {

	@Autowired
	StaffRepository staffrepo;
	
	@Autowired
	DepartmentRepo departrepo;
	
	@Autowired
	EducationRepository educationrepo;
	
	@Autowired
	CertificationRepository certirepo;
	
	@Autowired
	EmploymentHistoryRepository emprepo;
	
	@Autowired
	AchievementRepository achrepo;

	@Override
	public Department fetchingDepartment(Integer departmentId) {
		Department deptid=departrepo.findById(departmentId).get();
		
		staffrepo.save(deptid);
		return deptid;
	}

	@Override
	public Staff saveStaffDetails(StaffDto staffdto) {
		
		System.out.println("This is Testing");
		Staff staff=new Staff();
		staff.setFirstName(staffdto.getFirstName());
		System.out.println(staffdto.getDepartmentId());
		staff.setDepartment(departrepo.findById(staffdto.getDepartmentId()).get());
		staff.setLastName(staffdto.getLastName());
		staff.setAddress(staffdto.getAddress());
		staff.setCurrentDesi(staffdto.getCurrentDesi());
		staff.setDateOfBirth(staffdto.getDateOfBirth());
		staff.setExInYears(staffdto.getExInYears());
		staff.setMobile(staffdto.getMobile());
		staff.setBloodGroup(staffdto.getBloodGroup());
		staff.setAchievement(staffdto.getAchievement());
		staff.setCertificate(staffdto.getCertificate());
		staff.setHistory(staffdto.getHistory());
		staff.setEducation(staffdto.getEducation());
		return staffrepo.save(staff);
	}

	@Override
	public Staff updateStaffDetails(Integer staffid, StaffDto staffdto) {
		Staff staffdata=staffrepo.findById(staffid).get();
		
		if(Objects.nonNull(staffdto.getFirstName()) && !"".equalsIgnoreCase(staffdto.getFirstName()))
		{
			staffdata.setFirstName(staffdto.getFirstName());
		}
		
		if(Objects.nonNull(staffdto.getLastName()) && !"".equalsIgnoreCase(staffdto.getLastName()))
		{
			staffdata.setLastName(staffdto.getLastName());
		}
		
		if(Objects.nonNull(staffdto.getDateOfBirth()) && !"".equalsIgnoreCase(staffdto.getDateOfBirth()))
		{
			staffdata.setDateOfBirth(staffdto.getDateOfBirth());
		}
		
		if(Objects.nonNull(staffdto.getBloodGroup()) && !"".equalsIgnoreCase(staffdto.getBloodGroup()))
		{
			staffdata.setBloodGroup(staffdto.getBloodGroup());
		}
		
		if(Objects.nonNull(staffdto.getExInYears()) && !"".equalsIgnoreCase(staffdto.getExInYears()))
		{
			staffdata.setExInYears(staffdto.getExInYears());
		}
		
		if(Objects.nonNull(staffdto.getMobile()) && !"".equalsIgnoreCase(staffdto.getMobile()))
		{
			staffdata.setMobile(staffdto.getMobile());
		}
		
		if(Objects.nonNull(staffdto.getAddress()) && !"".equalsIgnoreCase(staffdto.getAddress()))
		{
			staffdata.setAddress(staffdto.getAddress());
		}
		
		if(Objects.nonNull(staffdto.getCurrentDesi()) && !"".equalsIgnoreCase(staffdto.getCurrentDesi()))
		{
			staffdata.setCurrentDesi(staffdto.getCurrentDesi());
		}
		
		
		return staffrepo.save(staffdata);
	}

	@Override
	public List<Staff> fetchStaffDetails() {
		return staffrepo.findAll();
	}

	@Override
	public void deleteStaffdetails(Integer staffid) {
		staffrepo.deleteById(staffid);
		
	}

	@Override
	public Education updateEducationDetails(Integer eid, Education education) {
		Education edudata=educationrepo.findById(eid).get();
		
		if(Objects.nonNull(education.getCollegeName()) && !"".equalsIgnoreCase(education.getCollegeName()))
		{
			edudata.setCollegeName(education.getCollegeName());
		}
		
		if(Objects.nonNull(education.getCollegeAddress()) && !"".equalsIgnoreCase(education.getCollegeAddress()))
		{
			edudata.setCollegeAddress(education.getCollegeAddress());
		}
		
		if(Objects.nonNull(education.getAggregate()) && !"".equalsIgnoreCase(education.getAggregate()))
		{
			edudata.setAggregate(education.getAggregate());
		}
		
		return educationrepo.save(edudata);
	}
	@Override
	public void deleteEducationDetails(Integer eid) 
	{
		educationrepo.deleteById(eid);
		
	}

	public Certification updateCertificationDetails(Integer certificateId,Certification certification)
	{
		Certification certidata = certirepo.findById(certificateId).get();
		

		if(Objects.nonNull(certification.getCourseName()) && !"".equalsIgnoreCase(certification.getCourseName()))
		{
			certidata.setCourseName(certification.getCourseName());
		}
		
		if(Objects.nonNull(certification.getCourseCompletionYear()) && !"".equalsIgnoreCase(certification.getCourseCompletionYear()))
		{
			certidata.setCourseCompletionYear(certification.getCourseCompletionYear());
		}
		
		if(Objects.nonNull(certification.getInstituteName()) && !"".equalsIgnoreCase(certification.getInstituteName()))
		{
			certidata.setInstituteName(certification.getInstituteName());
		}
		
		
		return certirepo.save(certidata);
		}
	

	@Override
	public void deleteCertificationDetails(Integer certificateId) 
	{
		certirepo.deleteById(certificateId);
		
	}
		public EmploymentHistory updateEmploymentHistoryDetails(Integer hid,EmploymentHistory history )
		{
			EmploymentHistory empdata=emprepo.findById(hid).get();
			

			if(Objects.nonNull(history.getCompanyName()) && !"".equalsIgnoreCase(history.getCompanyName()))
			{
				empdata.setCompanyName(history.getCompanyName());
			}
			
			if(Objects.nonNull(history.getSalary()) && !"".equalsIgnoreCase(history.getSalary()))
			{
				empdata.setSalary(history.getSalary());
			}
			
			return emprepo.save(empdata);
		}
		
		@Override
		public void deleteEmploymentHistoryDetails(Integer hid)
		{
			emprepo.deleteById(hid);
			
		}

		public Achievement updateAchievementDetails(Integer achieveId,Achievement achievement)
		{
			Achievement achdata=achrepo.findById(achieveId).get();
			


			if(Objects.nonNull(achievement.getEventName()) && !"".equalsIgnoreCase(achievement.getEventName()))
			{
				achdata.setEventName(achievement.getEventName());
			}
			
			if(Objects.nonNull(achievement.getEventPlace()) && !"".equalsIgnoreCase(achievement.getEventPlace()))
			{
				achdata.setEventPlace(achievement.getEventPlace());
			}
			
			return achrepo.save(achdata);
		}
		@Override
		public void deleteAchievementDetails(Integer achieveId) 
		{
			achrepo.deleteById(achieveId);
			
		}
}

