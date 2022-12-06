package com.springBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.entity.Employee;
import com.springBoot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	
	
	@PostMapping("/employ")
	public Employee insertStudents(@RequestBody Employee employee) {
		
		return this.service.insertEmployee(employee);
	}
	
	@DeleteMapping("/{empId}")
	public boolean deleteEmployeeById(@PathVariable int empId)
	{
		System.out.println(empId);
		return this.service.delete(empId);
	}
	
	@GetMapping("/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable int empId) {
		return this.service.getById(empId);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployeeAll() {
		
		return this.service.getAllEmployee();
	}
	
	
}
