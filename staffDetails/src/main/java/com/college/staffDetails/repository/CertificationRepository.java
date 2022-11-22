package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Integer>{

}
