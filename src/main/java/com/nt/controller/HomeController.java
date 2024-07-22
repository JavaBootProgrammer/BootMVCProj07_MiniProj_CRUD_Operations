package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.apache.catalina.mbeans.MBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceImp;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	EmployeeServiceImp employeeServiceImp;

	@GetMapping("/")
	public String getHomePage() {
		System.out.println("HomeController.getHomePage()");
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

	@GetMapping("/register") // display register form
	public String registerEmployee(@ModelAttribute("employee") Employee e) {
		System.out.println("HomeController.registerEmployee()");

		return "addEmployee";
	}

//	@PostMapping("/register") // display register form
//	public String saveEmployee(@ModelAttribute("employee") Employee e, RedirectAttributes atr) {
//		System.out.println("HomeController.saveEmployee()");
//		
//		Iterable<Employee> employees = employeeServiceImp.listEmployees();
//		
//		
//
//		String message = employeeServiceImp.regiterEmployee(e);
//		atr.addAttribute("message", message);
//		return "redirect:reportOne";
//
//	}

	@PostMapping("/register") // display register form
	public String saveEmployee(@ModelAttribute("employee") Employee e, HttpSession atr) {
		System.out.println("HomeController.saveEmployee()");

		Iterable<Employee> employees = employeeServiceImp.listEmployees();

		String message = employeeServiceImp.regiterEmployee(e);
		atr.setAttribute("message", message);
		return "redirect:reportOne";

	}

	@GetMapping("/edit") // display register form
	public String editEmployee(@ModelAttribute("employee") Employee receivedEmployee,
			@RequestParam Integer employeeNo) {

		System.out.println("HomeController.editEmployee()");

//		Iterable<Employee> employees = employeeServiceImp.listEmployees();

//		String message = employeeServiceImp.regiterEmployee(receivedEmployee);

		Employee foundEmployee = employeeServiceImp.findByID(employeeNo);

		BeanUtils.copyProperties(foundEmployee, receivedEmployee);

		return "editEmployee";

	}

	@PostMapping("/edit") // display register form
	public String updateEmployee(@ModelAttribute("employee") Employee e, RedirectAttributes atr) {

		System.out.println("HomeController.updateEmployee()");

		String message = employeeServiceImp.UdpateEmployee(e)+ " has been updated";
		atr.addFlashAttribute("message", message);

		return "redirect:reportOne";

	}
	
	@GetMapping("delete")
	public String deteleEmployeePageDisplay(@ModelAttribute("employee") Employee receivedEmployee,
			@RequestParam Integer employeeNo)
	{
		System.out.println("HomeController.deteleEmployeePageDisplay()");
		
		Employee foundEmployee= employeeServiceImp.findByID(employeeNo);

		BeanUtils.copyProperties(foundEmployee, receivedEmployee);

		return "deleteEmployee";
	}
	
	@PostMapping("/delete") // display register form
	public String deteleEmployeePageDisplay(@ModelAttribute("employee") Employee e, RedirectAttributes atr) {

		System.out.println("HomeController.updateEmployee()");

		String message = employeeServiceImp.deleteEmployee(e)+" has been deleted";
		atr.addFlashAttribute("message", message);

		return "redirect:reportOne";

	}

}
