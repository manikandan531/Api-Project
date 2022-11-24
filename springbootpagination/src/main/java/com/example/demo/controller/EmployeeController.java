package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;

import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController 
{
	
	 @Autowired private EmployeeService employeeService;
	  
	  
	  @PostMapping("/saveEmployees") 
	  public List<Employee> saveEmployees(@RequestBody List<Employee> employeeList) 
	  {
		  return employeeService.saveEmployeeData(employeeList);
	  
	  }
	  
	  @GetMapping("/getEmployee")
	  public List<Employee> getEmployees() 
	  { 
		  return employeeService.getEmployeeData(); }
	  
	  
	  @GetMapping("/getEmployeeById/{empId}") 
	  public Employee getEmployees(@PathVariable Long empId) 
	  { 
		  return employeeService.getEmployeeById(empId); 
	  }
	  
	  @DeleteMapping("/deleteEmployeeByDesignation/{designation}") 
	  public List<Employee> deleteEmployeeByDesignation(@PathVariable String designation)
	  { 
		  return employeeService.deleteEmployeeByDesignation(designation); 
	  }
	  
	  @GetMapping("/getEmployeeByDesignation/{designation}") 
	  public Employee getEmployeesbyDesignation(@PathVariable String designation) 
	  {
		  return employeeService.getEmployeeByDesignation(designation); 
	  }
	 
	  @RequestMapping(value="/pagingAndSortingEmployees/{pageNumber}/{pageSize}",
	  method = RequestMethod.GET) public Page<Employee>
	  employeePagination(@PathVariable Integer pageNumber,@PathVariable Integer pageSize) 
	  { 
		  return employeeService.getEmployeePagination(pageNumber,pageSize,null); 
	  }
	  
	  @RequestMapping(value="/pagingAndSortingEmployees/{pageNumber}/{pageSize}/{sortProperty}",method =RequestMethod.GET) 
	  public Page<Employee> employeePagination(@PathVariable Integer pageNumber,@PathVariable Integer pageSize,
			  									@PathVariable String sortProperty) 
	  { 
		  return employeeService.getEmployeePagination(pageNumber,pageSize,sortProperty); 
	  }
	  
	  @GetMapping("/findEmployeesByDesignationAndActiveData/{activeState}/{desinationList}")
	  public List<Employee> findEmployeesByDesigntionAndActiveData(@PathVariable  Boolean activeState,
			  													  @PathVariable List<String> designationList)
	  {
		  return  employeeService.findEmployeesByDesignationAndActiveData(activeState,designationList);  
	  }
	  
	  @PutMapping("/updateEmployeeState/{activeState}/{empIdList}")
	  public int updateEmployeeState(@PathVariable Boolean activeState,
			  						 @PathVariable List<Long> empIdList)
	  {
		  return employeeService.updateEmployeeState(activeState,empIdList);
	  }
	  
	}