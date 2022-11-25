package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.SalesboyOrSalesgirl;

public interface SalesboyOrSalesgirlRepo extends JpaRepository<SalesboyOrSalesgirl,Integer> 
{
	@Query(nativeQuery = true,value="SELECT manager.manager_name,salesboy_or_salesgirl.designation FROM manager INNER JOIN salesboy_or_salesgirl on manager.manager_id=salesboyorsalesgirl_manager_id WHERE martial_status=?1   ")
	List<Object> getDetailsOfManagerEmployee(String martialStatus);

}
