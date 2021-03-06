package com.javamg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity{
	
	private String name;
	private String surname;
	private double salary;

    public Employee() {
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
