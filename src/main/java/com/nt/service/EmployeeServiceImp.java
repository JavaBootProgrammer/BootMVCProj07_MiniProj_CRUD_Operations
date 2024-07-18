package com.nt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> listEmployees() {

		List<Employee> list = employeeRepository.findAll();
		System.out.println("EmployeeServiceImp.listEmployees()" + list);

		
		System.out.print("------------");
		
		
		for (Employee country : list) {
		    System.out.println("country"+country.getSalary()); 
		    System.out.println("country"+country.getDept()); 
		}
		
		
		System.out.print("------------");
		return list;
	}

}
