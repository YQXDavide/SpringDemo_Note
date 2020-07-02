package com.yang.service;

import java.util.List;

import com.yang.entity.Customer;

public interface CustomerService {
	void saveCustomer();
	
	void deleteCustomer();
	
	void updateCustomer();
	
	Customer selectOne(int i);
	
	List<Customer> selectAll();
}
