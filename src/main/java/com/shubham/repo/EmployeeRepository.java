package com.shubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
