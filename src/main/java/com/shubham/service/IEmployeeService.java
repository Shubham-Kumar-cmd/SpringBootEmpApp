package com.shubham.service;

import java.util.List;

import com.shubham.model.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	Employee getOneEmployee(Integer id);
	void deleteEmployee(Integer id);
	
}
