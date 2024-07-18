package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceImp;

@Controller
public class HomeController {

	@Autowired
	EmployeeServiceImp employeeServiceImp;

	@GetMapping("/home")
	public String getHomePage() {

		return "home";
	}

	@GetMapping("/reportOne")
	public String showReport(Map<String, Object> map) {

		List<Employee> list = (List<Employee>) employeeServiceImp.listEmployees();

		for (Employee employee : list) {
			System.out.println("-----------------");
			System.out.println(employee.getDept());
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getJob());
			System.out.println(employee.getSalary());
			System.out.println("-----------------");

		}
		map.put("employees", list);
		System.out.print("list from contoller class " + employeeServiceImp.listEmployees());

		return "showReport";
	}
}
