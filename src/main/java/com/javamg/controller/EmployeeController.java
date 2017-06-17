package com.javamg.controller;

import com.javamg.entity.Employee;
import com.javamg.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ucakyunus on 10.06.2017.
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "read", method = RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public void updateEmployee( @RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
    }

}
