package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	
	  Employee findByEmpId(Long id);
	  
	  List<Employee> deleteByDesignation(String designation);
	  
	  Employee findTopByDesignationOrderBySalaryDesc(String designation);
	 

	@Query(value="select  e from Employee e",nativeQuery = true)
	List<Employee> findAllEmployeeQuery();
	
	
	@Query(value="select e from Employee e where e.active=:activeState  and e.designation in:designationList",nativeQuery = true)
	List<Employee> findEmployeesByDesignationAndActiveQuery(@Param("activeState") Boolean activeState,
														   @Param("designationList")List<String> designationList);
	
	@Modifying
	@Query(value="update Employee e set e.active= ?1 where e.empId in ?2",nativeQuery = true)
	int updateEmployeeStatebyEmployeeId(Boolean activeState,List<Long> empIdList);
	
	
	
}
