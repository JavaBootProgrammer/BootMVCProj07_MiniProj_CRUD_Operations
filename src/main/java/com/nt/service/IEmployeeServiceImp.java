package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepository;

public class IEmployeeServiceImp implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> listEmployees() {

		return employeeRepository.findAll();
	}

}
