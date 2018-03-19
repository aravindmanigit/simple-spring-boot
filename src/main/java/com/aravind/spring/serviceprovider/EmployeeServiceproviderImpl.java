package com.aravind.spring.serviceprovider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aravind.spring.model.Employee;

@Service
public class EmployeeServiceproviderImpl implements EmployeeServiceProvider {

	private List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("Aravind",39,"aravindoutlookdotcom"), 
			new Employee("Hari",39,"hari123atoutlookdotcom")));
	
	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return employees.stream().filter(employee -> employee.getName().equals(name)).findFirst().get();
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		return employees.stream().filter(employee -> employee.getEmail().equals(email)).findFirst().get();
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}

	@Override
	public Employee updateEmployee(String name, Employee employee) {
		for (int i=0; i<employees.size();i++)
		{
			Employee emp = employees.get(i);
			if (emp.getName().equals(name))
			{
				employees.set(i, employee);
				break;
			}
		}
		return employee;
	}

	@Override
	public void deleteEmployee(String name) {
		employees.removeIf(employee -> employee.getName().equals(name));
		
	}
	
	
	
	

}
