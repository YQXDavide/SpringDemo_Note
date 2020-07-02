package com.yang.dao;

import java.util.List;

import com.yang.entity.Customer;

public interface CustomerDao {
	void saveCustomer();
	
	void deleteCustomer();
	
	void updateCustomer();
	
	Customer selectOne(int i);
	
	List<Customer> selectAll();
}
