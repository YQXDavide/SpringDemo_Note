package com.yang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	
	@Override
	public void saveCustomer() {
		System.out.println("数据层存储customer");

	}

	@Override
	public void deleteCustomer() {
		System.out.println("数据层删除customer");

	}

	@Override
	public void updateCustomer() {
		System.out.println("数据层更新customer");

	}

	@Override
	public Customer selectOne(int i) {
		System.out.println("数据层查询一个customer");
		return null;
	}

	@Override
	public List<Customer> selectAll() {
		System.out.println("数据层查询所有customer");
		return null;
	}

}
