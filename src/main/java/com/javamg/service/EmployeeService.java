package com.javamg.service;

import com.javamg.entity.Employee;

import java.util.List;

/**
 *
 * @author MustafaGungor
 * @since 10.06.2017
 * @version 1.0.0
 *
 */
public interface EmployeeService extends BaseService {

    void getId(Integer id);

    void createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Integer id);

    List<Employee> getAllEmployee();
}
