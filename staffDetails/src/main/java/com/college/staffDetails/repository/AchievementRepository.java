package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.Achievement;
@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Integer>{

}
