package com.aravind.spring.serviceprovider;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aravind.spring.model.Employee;


public interface EmployeeServiceProvider {
	
	public List<Employee> getEmployees();
	
	public Employee getEmployeeByName(String name);
	
	public Employee getEmployeeByEmail(String email);
	
	public void addEmployee(Employee employee);
	
	public Employee updateEmployee(String name, Employee employee);
	
	public void deleteEmployee(String name);

}
