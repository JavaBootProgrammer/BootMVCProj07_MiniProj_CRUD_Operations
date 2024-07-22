package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeService {

	public Iterable<Employee> listEmployees();

	public String regiterEmployee(Employee employee);
	
	public Employee findByID(int id);
	
	public String UdpateEmployee(Employee employee);
	
	public String deleteEmployee(Employee employee);

}
