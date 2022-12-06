package com.springBoot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.entity.Employee;
import com.springBoot.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	
	// insert employees
	
	public Employee insertEmployee(Employee employee) {
		Employee emp = this.repository.save(employee);
		System.out.println("Employee Added" + emp);
		return emp;

	}
	
	
	
 
	// get employee by id
	
	public Optional<Employee> getById(int id) {
		System.out.println("Getting By id");
		return this.repository.findById(id);

	}

	
	
	// get all employees
	
	
	public List<Employee> getAllEmployee() {
		System.out.println("Get All employees");
		
		List<Employee> employees = new ArrayList<Employee>();
		this.repository.findAll().forEach(employees::add);
		return employees;
	}
	
	// delete an employee
	
	public boolean delete(int id) {
		if(! this.repository.existsById(id))
		{
			
			throw new EntityNotFoundException("User with "+id+" cannot be deleted as it not exists");		
		}
		  this.repository.deleteById(id);
		  
		return true;
		
	}
}
