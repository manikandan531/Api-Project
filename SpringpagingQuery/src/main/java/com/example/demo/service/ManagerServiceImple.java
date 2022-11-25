package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.JoinDataDetails;
import com.example.demo.dto.OfficeDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Manager;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.repository.ManagerRepo;
import com.example.demo.repository.SalesboyOrSalesgirlRepo;

@Service
public class ManagerServiceImple implements ManagerService
{
	
	@Autowired EmployeeRepo employeeRepo;
	
	@Autowired ManagerRepo managerRepo;
	
	@Autowired SalesboyOrSalesgirlRepo salRepo;

	
	@Override
	public Employee  getEmployeeDetails(Integer employeeId)
	{
		Employee employeeDataId=employeeRepo.findById(employeeId).get();
		employeeRepo.save(employeeDataId);
		return employeeDataId;
	}



	@Override
	public Manager saveOfficeDetails(OfficeDto officedto)
	{
		Manager manager=new Manager();
		manager.setManagerName(officedto.getManagerName());
		manager.setDesignation(officedto.getDesignation());
		manager.setSalary(officedto.getSalary());
		manager.setEmployee(employeeRepo.findById(officedto.getEmployeeId()).get());
		manager.setSalesboyorsalesgirl(officedto.getSalesboyorsalesgirl());
		
		
		return managerRepo.save(manager);
	}



	@Override
	public List<Manager> getOfficeDetails()
	{
		return managerRepo.findAll();
	}



	@Override
	public List<Manager> getOfficeDetailsByEmployeeId(Integer employeeId) 
	{
		return managerRepo.getManagerDetailsByEmployeeId(employeeId);
	}



	@Override
	public List<JoinDataDetails> getManagerSalesDetails() 
	{
		return null;
	}



	@Override
	public Manager getManagernameByEmployeeID(Integer employeeId) 
	{
		return managerRepo.getManagerNameByEmployeeId(employeeId);
	}



	@Override
	public List<Object> getManagerDetailsByJoin()
	{
		return managerRepo.getManagerNameDesignationByJoin();
	}



	@Override
	public List<Object> getManagerSalaryName() 
	{
		return managerRepo.findManagerNameSalaryByJoin();
	}



	@Override
	public List<Object> getManagerDetailsByMartialStatus(String martialStatus) 
	{
		return salRepo.getDetailsOfManagerEmployee(martialStatus);
	}



	@Override
	public List<Object> getSalaryManagerNameBySortedOrder() 
	{
		return managerRepo.sortSalaryAndName();
	}



	@Override
	public List<Object> sortPageManagerByValues(Integer pageNo, Integer pageSize) 
	{
		return managerRepo.pageSortValues(pageNo,pageSize);
	}



}