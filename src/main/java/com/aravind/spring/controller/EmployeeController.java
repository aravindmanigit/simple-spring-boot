package com.aravind.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.spring.model.Employee;
import com.aravind.spring.serviceprovider.EmployeeServiceProvider;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceProvider employeeServiceProvider;
	
	@RequestMapping(path="/employees")
	public List<Employee> getEmployees()
	{
		return employeeServiceProvider.getEmployees();
	}
	
	@RequestMapping(path="/employees/{employeeName}")
	public Employee getEmployeeByName(@PathVariable("employeeName") String name)
	{
		return employeeServiceProvider.getEmployeeByName(name);
	}
	
	@RequestMapping(path="/employees", method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeServiceProvider.addEmployee(employee);
	}
	
	@RequestMapping(path="/employees/{name}", method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable String name, @RequestBody Employee employee)
	{
		return employeeServiceProvider.updateEmployee(name, employee);
	}
	
	@RequestMapping(path="/employees/{name}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String name)
	{
		employeeServiceProvider.deleteEmployee(name);
	}
	
	
}
