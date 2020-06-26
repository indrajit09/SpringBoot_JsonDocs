package com.Indra.Spring.JsonDocs.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@ApiObject
@Data
public class Employee {
	@Id
	@GeneratedValue
	@ApiObjectField(name = "employee id", description = "Auto generated id")
	private int id;
	@ApiObjectField(name = "employee name", description = "name same as voterId")
	private String name;
	@ApiObjectField(name = "department", description = "dept section")
	private String dept;
	@ApiObjectField(name = "salary", description = "annual income")
	private double salary;
}
