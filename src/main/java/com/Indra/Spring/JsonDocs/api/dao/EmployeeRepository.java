package com.Indra.Spring.JsonDocs.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Indra.Spring.JsonDocs.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
