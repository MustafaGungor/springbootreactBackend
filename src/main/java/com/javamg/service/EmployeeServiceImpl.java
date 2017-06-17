package com.javamg.service;

import com.javamg.dao.EmployeeDao;
import com.javamg.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void getId(Integer id) {

    }

    @Override
    public void createEmployee(Employee employee) {
        employeeDao.create(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeDao.delete(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllList();
    }
}
