package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	
	  @Autowired 
	  EmployeeRepository employeeRepository;
	  
	  public List<Employee> saveEmployeeData(List<Employee> employeeList) { return
	  employeeRepository.saveAll(employeeList); }
	  
	  
	  public List<Employee> getEmployees() {
	  
	  return employeeRepository.findAll(); }
	  
	  
	  public Employee getEmployeeById(Long empId) 
	  { 
		  return employeeRepository.findByEmpId(empId);
		}
	  
	  
	  public List<Employee> deleteEmployeeByDesignation(String designation)
	  {
	  
	  return employeeRepository.deleteByDesignation(designation); 
	  }
	  
	  
	  public Employee getEmployeeByDesignation(String designation) 
	  { 
		  return employeeRepository.findTopByDesignationOrderBySalaryDesc(designation); 
	  }
	  
	  
	/*
	 * //public Page<Employee> getEmployeePagination(Integer pageNumber,Integer
	 * pageSize) //{ //Sort sort = Sort.by(Sort.Direction.ASC, "name"); //Pageable
	 * pageable = PageRequest.of(pageNumber,pageSize,sort); // return
	 * employeeRepository.findAll(pageable);
	 *///}
	  
	  
	  public Page<Employee> getEmployeePagination(Integer pageNumber,Integer pageSize,String sortProperty) 
	  {
		  Pageable pageable = null;
	  if(null!=sortProperty) 
	  { 
		  pageable = PageRequest.of(pageNumber,pageSize,Sort.Direction.ASC, sortProperty); 
	  } 
	  else
	  { 
		  pageable = PageRequest.of(pageNumber,pageSize,Sort.Direction.ASC, "name");
	  } 
	  	return employeeRepository.findAll(pageable);
	  }
	 

	public List<Employee> getEmployeeData() 
	{
		return employeeRepository.findAllEmployeeQuery();
	}


	public List<Employee> findEmployeesByDesignationAndActiveData(Boolean activeState, List<String> designationList)
	{
		return employeeRepository.findEmployeesByDesignationAndActiveQuery(activeState, designationList);
	}


	public int updateEmployeeState(Boolean activeState, List<Long> empIdList) 
	{
		
		return employeeRepository.updateEmployeeStatebyEmployeeId(activeState,empIdList);
	}



}
