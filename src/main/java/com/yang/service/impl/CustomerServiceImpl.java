package com.yang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
import com.yang.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	public CustomerServiceImpl() {}
	
	public void init() {
		System.out.println("进行初始化操作！");
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void saveCustomer() {
		System.out.println("业务层调用数据层存储客户信息");
		customerDao.saveCustomer();
	}

	@Override
	public void deleteCustomer() {
		System.out.println("业务层调用数据层删除客户信息");
		customerDao.deleteCustomer();
	}

	@Override
	public void updateCustomer() {
		System.out.println("业务层调用数据层更新客户信息");
		customerDao.updateCustomer();
	}

	@Override
	public Customer selectOne(int i) {
		System.out.println("业务层调用数据层查询一个客户信息");
		return customerDao.selectOne(1);
	}

	@Override
	public List<Customer> selectAll() {
		System.out.println("业务层调用数据层查询所有客户信息");
		return customerDao.selectAll();
	}
	
}
