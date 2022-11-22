package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	void save(Department deptid);

}
