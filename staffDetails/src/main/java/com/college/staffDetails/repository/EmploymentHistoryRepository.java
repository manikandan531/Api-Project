package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.EmploymentHistory;
@Repository
public interface EmploymentHistoryRepository extends JpaRepository<EmploymentHistory, Integer>{

}
