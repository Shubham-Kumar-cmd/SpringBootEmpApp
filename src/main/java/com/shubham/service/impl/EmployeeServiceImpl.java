package com.shubham.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubham.exception.EmployeeNotFoundException;
import com.shubham.model.Employee;
import com.shubham.repo.EmployeeRepository;
import com.shubham.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		Integer id=repo.save(e).getEmpId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt=repo.findById(id);
		//Standard method
		Employee emp=opt.orElseThrow(
				()-> new EmployeeNotFoundException("Employee Not Exist")
				);
		//Aliter
		/*Employee emp=null;
		if(opt.isPresent()) {
			emp=opt.get();
		}else {
			throw new EmployeeNotFoundException("Employee Not Exist");
		}*/
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee emp=getOneEmployee(id);
		repo.delete(emp);
	}

	

}
