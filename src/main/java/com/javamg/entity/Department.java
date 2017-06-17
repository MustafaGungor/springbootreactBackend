package com.javamg.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="department")
public class Department extends BaseEntity{

	private String name;

	private String description;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Employee> employee;

	public Department() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
}
