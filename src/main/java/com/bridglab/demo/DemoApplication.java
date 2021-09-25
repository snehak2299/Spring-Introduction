package com.bridglab.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridglab.demo.component.DemoBean;
import com.bridglab.demo.component.EmployeeBean;

@SpringBootApplication
public class DemoApplication {
	public static final Logger logger=LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring concept demo");
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		logger.debug("Demo Bean= "+demoBean.toString());
		
		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
		
		
	}
	
	

}
