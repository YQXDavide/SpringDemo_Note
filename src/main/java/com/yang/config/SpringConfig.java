package com.yang.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan("com.yang")
@EnableAspectJAutoProxy
public class SpringConfig {

}
