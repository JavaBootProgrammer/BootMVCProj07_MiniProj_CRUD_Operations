package com.nt.service;

import java.util.Optional;

import com.nt.model.Employee;

public interface IEmployeeService {

	public Iterable<Employee> listEmployees();

	public String regiterEmployee(Employee emp);
	
	public Employee findByID(int id);
	
	public String UdpateEmployee(Employee emp);

}
