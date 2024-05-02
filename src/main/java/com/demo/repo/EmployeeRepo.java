package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee , Integer>{

}
