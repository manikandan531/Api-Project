package com.college.staffDetails.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	

}
