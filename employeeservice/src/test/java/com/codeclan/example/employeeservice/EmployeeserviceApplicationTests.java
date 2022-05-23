package com.codeclan.example.employeeservice;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee Matt = new Employee("Matt" , 30 , 123 , "hello@matt.com");
		employeeRepository.save(Matt);
		Employee Elisol = new Employee("Elisol" , 33 , 456 , "hello@elisol.com");
		employeeRepository.save(Elisol);

	}

}
