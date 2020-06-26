package com.Indra.Spring.JsonDocs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Indra.Spring.JsonDocs.api.dao.EmployeeRepository;
import com.Indra.Spring.JsonDocs.api.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "new employee added with id :" + employee.getId();
	}

	public Employee getEmployee(int id) {
		System.out.println("get method call");
		return repository.findOne(id);
	}

	public List<Employee> deleteEmployee(int id) {
		repository.delete(id);
		return repository.findAll();
	}

}
