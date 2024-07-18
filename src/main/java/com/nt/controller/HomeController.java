package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.EmployeeServiceImp;

@Controller
public class HomeController {

	@Autowired
	EmployeeServiceImp employeeServiceImp;

	@GetMapping("/home")
	public String getHomePage() {

		return "home";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {

		map.put("employees", employeeServiceImp.listEmployees());
		return "showReport";
	}
}
