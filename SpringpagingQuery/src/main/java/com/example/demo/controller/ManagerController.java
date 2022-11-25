package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.JoinDataDetails;
import com.example.demo.dto.OfficeDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Manager;
import com.example.demo.service.ManagerService;

@RestController
public class ManagerController
{
	
	@Autowired 
	private ManagerService managerService;
	
	@GetMapping("/EmployeeId")
	public Employee getEmployeeDetails(OfficeDto officedto)
	{
		return managerService.getEmployeeDetails(officedto.getEmployeeId());
	}
	
	@PostMapping("/saveOfficeDetails")
	public Manager saveEmployeeDetils(@RequestBody OfficeDto officedto)
	{
		return managerService.saveOfficeDetails(officedto);
	}
	
	
	@GetMapping("/getOfficeDetails")
	public List<Manager> getOfficeDetails()
	{
		return managerService.getOfficeDetails();
	}
	
	@GetMapping("/getManagerDetails/{employeeId}")
	public List<Manager> getOfficeDetailsByEMployeeId(@PathVariable Integer employeeId)
	{
		return managerService.getOfficeDetailsByEmployeeId(employeeId);
	}
	
	@GetMapping("/getManagerSalesDetails")
	public List<JoinDataDetails> getManagerSalesDetails()
	{
		return managerService.getManagerSalesDetails();
	}
	
	@GetMapping("/getManagernameByEmployeeId/{employeeId}")
	public Manager getManagernameByEmployeeID(@PathVariable Integer employeeId)
	{
		return managerService.getManagernameByEmployeeID(employeeId);
	}
	
	@GetMapping("/getManagerdetailsByJoin")
	public List<Object> getManagerDetailsByJoin()
	{
		return managerService.getManagerDetailsByJoin();
		
	}
	@GetMapping("/getManagerNameSalary")
	public List<Object> getManagerSalaryName()
	{
		return managerService.getManagerSalaryName();
	}
	
	@GetMapping("/getManagerDetailsByMartialStatus/{maritalStatus}")
	public List<Object> getmanagerDetailsByMartialStatus(@PathVariable String martialStatus)
	{
		return managerService.getManagerDetailsByMartialStatus(martialStatus);
	}
	
	@GetMapping("/getSalaryManagerNameBySortedOrder")
	public List<Object> getSalaryFatherNameBySortedOrder()
	{
		return managerService.getSalaryManagerNameBySortedOrder();
		
	}
	
	@GetMapping("/sortpage/{pageNo}/{pageSize}")
	public List<Object> sortPageManagerByValues(@PathVariable Integer pageNo, @PathVariable Integer pageSize)
	{
		return managerService.sortPageManagerByValues(pageNo,pageSize);
	}
	
}
