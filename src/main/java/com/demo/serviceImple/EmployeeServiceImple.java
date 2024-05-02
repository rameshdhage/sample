package com.demo.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepo;
import com.demo.service.EmployeeService;
@Service
public class EmployeeServiceImple implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	

	@Override
	public Employee save(Employee employee) {
		 return employeeRepo.save(employee);
	
	}

}
