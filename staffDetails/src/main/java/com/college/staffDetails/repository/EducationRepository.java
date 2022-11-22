package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.Education;
@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {

}
