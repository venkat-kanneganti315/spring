package com.flm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.model.Employee;

public class creatingObjectInSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//Employee emp = (Employee)ctx.getBean("e1");
		               //(OR)
		Employee emp = ctx.getBean("e1", Employee.class);
		emp.setId(01L);
		emp.setName("venkat kanneganti");
		emp.setSalary(60000D);
		System.out.println(emp);
		
		
		

		
		// TODO Auto-generated method stub

	}

}
