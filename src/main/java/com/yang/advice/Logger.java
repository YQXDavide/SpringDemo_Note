package com.yang.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	@Pointcut("execution(* com.yang.service.impl.CustomerServiceImpl.saveCustomer(..))")
	public void pointcut1() {}
	@Before("pointcut1()")
	public void printLog() {
		System.out.println("打印");
	}
}
