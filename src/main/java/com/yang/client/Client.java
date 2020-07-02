package com.yang.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yang.config.SpringConfig;
import com.yang.service.CustomerService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		CustomerService service = (CustomerService) context.getBean("customerService");
		service.saveCustomer();
		service.deleteCustomer();
	}
}
