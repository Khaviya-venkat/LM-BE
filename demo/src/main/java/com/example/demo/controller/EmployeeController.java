package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController{
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/showemp")
	public String showMessage() {
		return "Welcome";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee e) {
		String result = "";
		result = employeeService.saveEmployee(e);
		System.out.println(e.getEmployeeName());
	/*	if(obj != null) {
			result = "User data saved";
		}
		else {
			result = "Insertion failed";
		}*/
		
		return result;
	}
	
}

