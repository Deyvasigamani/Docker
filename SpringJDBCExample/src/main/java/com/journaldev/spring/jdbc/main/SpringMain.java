package com.journaldev.spring.jdbc.main;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.jdbc.dao.EmployeeDAO;
import com.journaldev.spring.jdbc.model.Employee;

public class SpringMain {

	public static void main(String[] args) {
		//Get the Spring Context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Get the EmployeeDAO Bean
		//EmployeeDAO employeeDAO = ctx.getBean("employeeDAO", EmployeeDAO.class);
		//To use JdbcTemplate
		EmployeeDAO employeeDAO = ctx.getBean("employeeDAOJDBCTemplate", EmployeeDAO.class);
		
		//Run some tests for JDBC CRUD operations
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Sathiya");
		emp.setRole("Java Developer");
		
		//Create
		employeeDAO.save(emp);
		
		//Read
		Employee emp1 = employeeDAO.getById(1);
		System.out.println("Employee Retrieved::"+emp1);
		
		//Update
		emp.setId(1);
		emp.setName("Saranya");
		emp.setRole("UI developer");
		employeeDAO.update(emp);
		
		//Get All
		List<Employee> empList = employeeDAO.getAll();
		System.out.println(empList);
		
		//Delete
		employeeDAO.deleteById(1);
		
		//Close Spring Context
		ctx.close();
		
		System.out.println("DONE");
	}

}
