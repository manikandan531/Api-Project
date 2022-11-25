package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Manager;

@Repository
public interface ManagerRepo extends JpaRepository<Manager,Integer> 
{
	@Query(nativeQuery = true,value="SELECT * FROM manager WHERE employee_employee_id=?1")
	List<Manager> getManagerDetailsByEmployeeId(Integer employeeId);
	
	@Query(nativeQuery = true,value="SELECT * FROM manager  WHERE employee_employee_id=?1")
	Manager getManagerNameByEmployeeId(Integer employeeId);
	
	@Query(nativeQuery = true,value="SELECT manager.manager_name,salesboy_or_salesgirl from manager inner join salesboy_or_salesgirl on manager.manager_id=salesboyorsaesgirl_manager_id")
	List<Object> getManagerNameDesignationByJoin();

	@Query(nativeQuery = true,value="SELECT manager_name,salary FROM manager")
	List<Object> findManagerNameSalaryByJoin();

	@Query(nativeQuery = true,value="SELECT manager_name,salary FROM manager ORDER BY salary DESC")
	List<Object> sortSalaryAndName();

	
	@Query(nativeQuery = true,value="SELECT * FROM manager LIMIT ?1 OFFSET ?2")
	List<Object> pageSortValues(Integer pageNo, Integer pageSize);

	



}
