package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.JoinDataDetails;
import com.example.demo.dto.OfficeDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Manager;

@Service
public interface ManagerService 
{
	public Employee getEmployeeDetails(Integer employeeId);

	public Manager saveOfficeDetails(OfficeDto officedto);

	public List<Manager> getOfficeDetails();

	public List<Manager> getOfficeDetailsByEmployeeId(Integer employeeId);

	public List<JoinDataDetails> getManagerSalesDetails();

	public Manager getManagernameByEmployeeID(Integer employeeId);

	public List<Object> getManagerDetailsByJoin();

	public List<Object> getManagerSalaryName();

	public List<Object> getManagerDetailsByMartialStatus(String martialStatus);

	public List<Object> getSalaryManagerNameBySortedOrder();

	public List<Object> sortPageManagerByValues(Integer pageNo, Integer pageSize);


	
	

	

	
	
}
